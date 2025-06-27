package org.example.spring.cloud.spring.java.services;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.example.spring.cloud.spring.java.db.IOrderRepository;
import org.example.spring.cloud.spring.java.db.OrderDao;
import org.example.spring.cloud.spring.java.services.models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderProcessService {
    private final OrderDao orderDao;


    public void processOrder(Order orderParam) {
        orderDao.insertOrder(orderParam);
    }
}
