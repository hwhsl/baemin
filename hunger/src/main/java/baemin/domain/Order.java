package baemin.domain;

import baemin.domain.*;
import baemin.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Order extends AbstractEvent {

    private Long id;
    private String foodId;
    private String option;
    private String address;

    public Order(Order aggregate){
        super(aggregate);
    }
    public Order(){
        super();
    }
}
