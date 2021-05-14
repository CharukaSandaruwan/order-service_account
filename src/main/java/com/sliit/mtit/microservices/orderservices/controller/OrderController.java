package com.sliit.mtit.microservices.orderservices.controller;

import com.sliit.mtit.microservices.orderservices.dto.OrderResponse;
import com.sliit.mtit.microservices.orderservices.dto.OrderResquest;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * the type order controller
 */

@RestController
@RequestMapping("/orders")
public class OrderController {

    /**
     * Create order
     */
    @PostMapping(consumes = "application/json" ,produces = "application/json")
    public @ResponseBody OrderResponse createOrder(@RequestBody OrderResquest request){

        System.out.println("Order Details:" + request);
        var orderResponse = new OrderResponse();
        orderResponse.setOrderId(UUID.randomUUID().toString());
        orderResponse.setMessage("successfully create order");
        return orderResponse;
    }

}
