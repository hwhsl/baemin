package baemin.domain;

import baemin.domain.*;
import baemin.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeleveryFinish extends AbstractEvent {

    private Long id;

    public DeleveryFinish(Rider aggregate){
        super(aggregate);
    }
    public DeleveryFinish(){
        super();
    }
}
