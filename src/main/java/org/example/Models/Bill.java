package org.example.Models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
public class Bill {
    Long id;
    int amount;
    Ticket ticket;
    EStatus status;
    LocalTime exitTime;
    List<Payment> payments;
}
