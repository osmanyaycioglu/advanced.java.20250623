package org.example.spring.cloud.spring.java.db;

import lombok.RequiredArgsConstructor;
import org.example.spring.cloud.spring.java.services.models.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderDao {
    private final IOrderRepository orderRepository;

    public void insertOrder(Order orderParam){
        orderParam.getMeal().setOrder(orderParam);
        orderRepository.save(orderParam);
    }

    public void updateOrder(Order orderParam){
        orderRepository.save(orderParam);
    }

    public void deleteOrder(Long orderId){
        orderRepository.deleteById(orderId);
    }
    public Order findOrder(Long orderId){
        return orderRepository.findById(orderId).orElse(null);
    }

    public List<Order> findAllOrders(){
        return orderRepository.findAll();
    }

}
