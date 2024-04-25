package org.example.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Gate {
    Long id;
    int GateNo;
    Operator operator;
    EGateType gateType;


}
