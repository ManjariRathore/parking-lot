package org.example.dtos;

import lombok.Getter;
import lombok.Setter;
import org.example.Models.EVehicleType;
@Getter
@Setter
public class IssueTicketRequestDto {
    private Long gateId;
    private EVehicleType vehicleType;
    private String vehicleNumber;
    private String ownerName;
}
