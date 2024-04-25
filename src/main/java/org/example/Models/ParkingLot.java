package org.example.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingLot {
    Long id;
    List<Gate> gateList;
    EParkingStatus parkingLotStatus;
    List<ParkingFloor> parkingFloorList;
}
