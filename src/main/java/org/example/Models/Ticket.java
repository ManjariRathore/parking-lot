package org.example.Models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
@Getter
@Setter
public class Ticket {
    Long id;
    Gate gate;
    EStatus status;
    Vehicle vehicle;
    LocalTime entryTime;
    ParkingSpot parkingSpot;
}
