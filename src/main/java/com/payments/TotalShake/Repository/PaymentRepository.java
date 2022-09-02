package com.payments.TotalShake.Repository;

import com.payments.TotalShake.Entity.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Long> {

}
