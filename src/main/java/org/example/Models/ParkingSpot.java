package org.example.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class ParkingSpot {
    Long id;
    Long parkingSpotNo;
    ParkingFloor parkingFloor;
    EParkingStatus parkingStatus;
    List<EVehicleType> vehicleTypeList;

}
