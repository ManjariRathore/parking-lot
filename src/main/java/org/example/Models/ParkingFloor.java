package org.example.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class ParkingFloor {
    Long id;
    Long parkingFloorNo;
    List<ParkingSpot> parkingSpotList;
    EParkingStatus parkingFloorStatus;
}
