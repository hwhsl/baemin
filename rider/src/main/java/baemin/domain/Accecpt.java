package baemin.domain;

import baemin.domain.*;
import baemin.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Accecpt extends AbstractEvent {

    private Long id;
    private String status;
    private Long orderId;
}


