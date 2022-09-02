package com.payments.TotalShake.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Positive(message = "valor deve ser positivo")
    private BigDecimal valor;
    private String nome;
    private String numero;
    private String expiracao;
    private String codigo;
    private Status status;

    @NotNull
    private Long pedidoId;

    @NotNull
    @Enumerated(EnumType.STRING)
    private FormaDePagamento formaDePagamento;

    public Payment(){}

    public Payment(BigDecimal valor, String nome, String numero, String expiracao, String codigo, Status status, Long pedidoId, FormaDePagamento formaDePagamento) {
        this.valor = valor;
        this.nome = nome;
        this.numero = numero;
        this.expiracao = expiracao;
        this.codigo = codigo;
        this.status = status;
        this.pedidoId = pedidoId;
        this.formaDePagamento = formaDePagamento;
    }
}
