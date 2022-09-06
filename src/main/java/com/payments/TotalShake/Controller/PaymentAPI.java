package com.payments.TotalShake.Controller;

import com.payments.TotalShake.DTO.PaymentPedidoRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(name = "payment", url = "app-totalgateway:8022/REQUEST-SERVICE/pedido/pay")
public interface PaymentAPI {

    @PutMapping
    void payPedido(PaymentPedidoRequest paymentPedidoRequest);

}
