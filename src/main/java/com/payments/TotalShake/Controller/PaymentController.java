package com.payments.TotalShake.Controller;

import com.payments.TotalShake.DTO.PaymentRequest;
import com.payments.TotalShake.DTO.PaymentResponse;
import com.payments.TotalShake.Entity.Payment;
import com.payments.TotalShake.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController{

    @Autowired
    PaymentService paymentService;

    @GetMapping
    public ResponseEntity<PaymentResponse> getPayment(Long id) {
        return ResponseEntity.ok(new PaymentResponse());
    }

    @PostMapping
    public void createPayment(@RequestBody PaymentRequest paymentRequest) {
        Payment payment = paymentRequest.toPayment();
        try {
            paymentService.sendPayment(payment);
            paymentService.savePayment(payment);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
