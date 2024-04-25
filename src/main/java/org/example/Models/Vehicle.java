package org.example.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle {
    Long id;
    User owner;
    Long vehicleNo;
    EVehicleType vehicleType;
}
