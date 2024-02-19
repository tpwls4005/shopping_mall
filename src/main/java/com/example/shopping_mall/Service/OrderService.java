package com.example.shopping_mall.Service;

import com.example.shopping_mall.DTO.OrderDTO;
import com.example.shopping_mall.Entity.Order;
import com.example.shopping_mall.Repository.OrderRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

  @Autowired
  private OrderRepository orderRepository;

  public OrderDTO getOrderById(Long orderId) {
    Order order = orderRepository.findById(orderId)
        .orElseThrow(() -> new RuntimeException("Order not found"));
    OrderDTO orderDTO = new OrderDTO();
    BeanUtils.copyProperties(order, orderDTO);
    return orderDTO;
  }

  public List<OrderDTO> getAllOrders() {
    List<Order> orderList = orderRepository.findAll();
    return orderList.stream()
        .map(order -> {
          OrderDTO orderDTO = new OrderDTO();
          BeanUtils.copyProperties(order, orderDTO);
          return orderDTO;
        })
        .collect(Collectors.toList());
  }

  public OrderDTO createOrder(OrderDTO orderDTO) {
    Order order = new Order();
    BeanUtils.copyProperties(orderDTO, order);
    order = orderRepository.save(order);
    BeanUtils.copyProperties(order, orderDTO);
    return orderDTO;
  }

  public OrderDTO updateOrder(Long orderId, OrderDTO orderDTO) {
    Order order = orderRepository.findById(orderId)
        .orElseThrow(() -> new RuntimeException("Order not found"));
    BeanUtils.copyProperties(orderDTO, order);
    order = orderRepository.save(order);
    BeanUtils.copyProperties(order, orderDTO);
    return orderDTO;
  }

  public void deleteOrder(Long orderId) {
    orderRepository.deleteById(orderId);
  }
}