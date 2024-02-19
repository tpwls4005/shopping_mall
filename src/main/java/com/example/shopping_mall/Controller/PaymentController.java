package com.example.shopping_mall.Controller;

import com.example.shopping_mall.DTO.PaymentDTO;
import com.example.shopping_mall.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {
  @Autowired
  private PaymentService paymentService;

  @GetMapping
  public List<PaymentDTO> getAllPayments() {
    return paymentService.getAllPayments();
  }

  @GetMapping("/{paymentId}")
  public PaymentDTO getPaymentById(@PathVariable Long paymentId) {
    return paymentService.getPaymentById(paymentId);
  }

  @PostMapping
  public PaymentDTO createPayment(@RequestBody PaymentDTO paymentDTO) {
    return paymentService.createPayment(paymentDTO);
  }

  @PutMapping("/{paymentId}")
  public PaymentDTO updatePayment(@PathVariable Long paymentId, @RequestBody PaymentDTO paymentDTO) {
    return paymentService.updatePayment(paymentId, paymentDTO);
  }

  @DeleteMapping("/{paymentId}")
  public void deletePayment(@PathVariable Long paymentId) {
    paymentService.deletePayment(paymentId);
  }
}