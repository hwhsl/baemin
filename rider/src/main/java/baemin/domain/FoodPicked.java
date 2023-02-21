package baemin.domain;

import baemin.domain.*;
import baemin.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class FoodPicked extends AbstractEvent {

    private Long id;

    public FoodPicked(Rider aggregate){
        super(aggregate);
    }
    public FoodPicked(){
        super();
    }
}
