package com.example.shopping_mall.Service;

import com.example.shopping_mall.DTO.PaymentDTO;
import com.example.shopping_mall.Entity.Payment;
import com.example.shopping_mall.Repository.PaymentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PaymentService {

  @Autowired
  private PaymentRepository paymentRepository;

  public PaymentDTO getPaymentById(Long paymentId) {
    Payment payment = paymentRepository.findById(paymentId)
        .orElseThrow(() -> new RuntimeException("Payment not found"));
    PaymentDTO paymentDTO = new PaymentDTO();
    BeanUtils.copyProperties(payment, paymentDTO);
    return paymentDTO;
  }

  public List<PaymentDTO> getAllPayments() {
    List<Payment> paymentList = paymentRepository.findAll();
    return paymentList.stream()
        .map(payment -> {
          PaymentDTO paymentDTO = new PaymentDTO();
          BeanUtils.copyProperties(payment, paymentDTO);
          return paymentDTO;
        })
        .collect(Collectors.toList());
  }

  public PaymentDTO createPayment(PaymentDTO paymentDTO) {
    Payment payment = new Payment();
    BeanUtils.copyProperties(paymentDTO, payment);
    payment = paymentRepository.save(payment);
    BeanUtils.copyProperties(payment, paymentDTO);
    return paymentDTO;
  }

  public PaymentDTO updatePayment(Long paymentId, PaymentDTO paymentDTO) {
    Payment payment = paymentRepository.findById(paymentId)
        .orElseThrow(() -> new RuntimeException("Payment not found"));
    BeanUtils.copyProperties(paymentDTO, payment);
    payment = paymentRepository.save(payment);
    BeanUtils.copyProperties(payment, paymentDTO);
    return paymentDTO;
  }

  public void deletePayment(Long paymentId) {
    paymentRepository.deleteById(paymentId);
  }
}