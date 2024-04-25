package org.example.Models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
@Getter
@Setter
public class Payment {
    Long id;
    int amount;
    LocalTime time;
    EStatus status;
    EPaymentMode paymentMode;
}
