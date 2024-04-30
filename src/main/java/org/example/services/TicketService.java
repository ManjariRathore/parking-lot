package org.example.services;

import java.util.Optional;
import java.time.LocalTime;
import org.example.Models.Gate;
import org.example.Models.Ticket;
import org.example.Models.Vehicle;
import org.example.Models.EVehicleType;
import org.example.repositories.GateRepository;
import org.example.exceptions.InvalidGateException;


public class TicketService {
    private final GateRepository gateRepository;

    public TicketService(GateRepository gateRepository) {
        this.gateRepository = gateRepository;
    }

    public Ticket issueTicket(Long gateId, String vehicleNumber, EVehicleType vehicleType, String ownerName) throws InvalidGateException {

        Ticket ticket = new Ticket();
        ticket.setEntryTime(LocalTime.now());

        Optional<Gate> optionalGate = gateRepository.findById(gateId);
        if (optionalGate.isEmpty()) {
            throw new InvalidGateException("Invalid gate Id");
        }

        Gate gate = optionalGate.get();
        ticket.setGeneratedAt(gate);
        ticket.setGeneratedBy(gate.getOperator());


        Vehicle vehicle = new Vehicle();
        vehicle.setOwnerName(ownerName);
        vehicle.setVehicleNo(vehicleNumber);
        vehicle.setVehicleType(vehicleType);
        ticket.setVehicle(vehicle);


        return ticket;
    }
}
