package baemin.domain;

import baemin.domain.*;
import baemin.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Accecpt extends AbstractEvent {

    private Long id;
    private String status;
    private Long orderId;

    public Accecpt(Cooking aggregate){
        super(aggregate);
    }
    public Accecpt(){
        super();
    }
}
