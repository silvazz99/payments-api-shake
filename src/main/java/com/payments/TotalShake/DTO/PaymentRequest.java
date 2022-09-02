package com.payments.TotalShake.DTO;


import com.payments.TotalShake.Entity.FormaDePagamento;
import com.payments.TotalShake.Entity.Payment;
import com.payments.TotalShake.Entity.Status;

import java.math.BigDecimal;

public class PaymentRequest {

    private String status;
    private Long pedidoId;
    private BigDecimal valor;
    private String nome;
    private String numero;
    private String expiracao;
    private String codigo;

    private String formaDePagamento;


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

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getExpiracao() {
        return expiracao;
    }

    public void setExpiracao(String expiracao) {
        this.expiracao = expiracao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public Payment toPayment() {
        return new Payment(
                this.valor,
                this.nome,
                this.numero,
                this.expiracao,
                this.codigo,
                Status.valueOf(this.status),
                this.pedidoId,
                FormaDePagamento.valueOf(this.formaDePagamento)
        );
    }
}
