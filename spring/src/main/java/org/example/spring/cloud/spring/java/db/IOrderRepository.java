package org.example.spring.cloud.spring.java.db;

import org.example.spring.cloud.spring.java.services.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.Future;
import java.util.stream.Stream;

public interface IOrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByCustomerNumber(String customerNumber);

    List<Order> findByCustomerNumberIn(List<String> customerNumber);

//    List<Order> findByCustomerNumberAndMealOrderByOrderProcessId(String customerNumber,
//                                                                 String meal);

    @Modifying
    @Query("update Order o set o.postTime = ?1 where o.orderId=?2")
    void updateOrderPostTime(Integer i,Long orderId);

    @Query("select o from Order o where o.customerNumber = ?1")
    Stream<Order> searchCustomerNumber2(String customerNumber);

    @Query("select o from Order o where o.customerNumber = ?1")
    Future<List<Order>> searchCustomerNumber3(String customerNumber);

    @Query("select o from Order o where o.customerNumber = ?1")
    Optional<Stream<Order>> searchCustomerNumber4(String customerNumber);

    @Query("select o from Order o where o.customerNumber = ?1")
    List<Order> searchCustomerNumber(String customerNumber);


    @Query(nativeQuery = true, value = "select * from order_process o where o.customerNumber = ?1")
    List<Order> searchCustomerNumberNative(String customerNumber);


//    @Query("select o.orderId,o.meal from Order o where o.customerNumber = ?1")
//    List<Order> searchCustomerNumberGetSome(String customerNumber);
//
//    @Query("select o.orderId,o.meal from Order o where o.customerNumber = ?1")
//    List<Object[]> searchCustomerNumberGetSome2(String customerNumber);

//    @Query("select new org.example.spring.cloud.spring.java.db.MySomeObj(o.orderId,o.meal)  from Order o where o.customerNumber = ?1")
//    List<MySomeObj> searchCustomerNumberGetSome3(String customerNumber);


}
