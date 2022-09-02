package com.payments.TotalShake.DTO;

import com.payments.TotalShake.Entity.Payment;
import com.payments.TotalShake.Entity.Status;

public class PaymentPedidoRequest {
    private String status;
    private Long pedidoId;

    public PaymentPedidoRequest(Payment payment) {
        this.status = String.valueOf(payment.getStatus());
        this.pedidoId = payment.getPedidoId();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }
}
