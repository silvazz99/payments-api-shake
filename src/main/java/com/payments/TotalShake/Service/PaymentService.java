package com.payments.TotalShake.Service;

import com.payments.TotalShake.Controller.PaymentAPI;
import com.payments.TotalShake.DTO.PaymentPedidoRequest;
import com.payments.TotalShake.Entity.Payment;
import com.payments.TotalShake.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    PaymentAPI paymentAPI;

    @Autowired
    PaymentRepository paymentRepository;
    public void sendPayment(Payment payment){
        PaymentPedidoRequest paymentPedidoRequest = new PaymentPedidoRequest(payment);
        paymentAPI.payPedido(paymentPedidoRequest);
    }

    public void savePayment(Payment payment) {
        paymentRepository.save(payment);
    }
}
