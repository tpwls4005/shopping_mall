package com.example.shopping_mall.Controller;

import com.example.shopping_mall.DTO.OrderDTO;
import com.example.shopping_mall.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
  @Autowired
  private OrderService orderService;

  @GetMapping
  public List<OrderDTO> getAllOrders() {
    return orderService.getAllOrders();
  }

  @GetMapping("/{orderId}")
  public OrderDTO getOrderById(@PathVariable Long orderId) {
    return orderService.getOrderById(orderId);
  }

  @PostMapping
  public OrderDTO createOrder(@RequestBody OrderDTO orderDTO) {
    return orderService.createOrder(orderDTO);
  }

  @PutMapping("/{orderId}")
  public OrderDTO updateOrder(@PathVariable Long orderId, @RequestBody OrderDTO orderDTO) {
    return orderService.updateOrder(orderId, orderDTO);
  }

  @DeleteMapping("/{orderId}")
  public void deleteOrder(@PathVariable Long orderId) {
    orderService.deleteOrder(orderId);
  }
}