package baemin.domain;

import baemin.domain.*;
import baemin.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class CookStarted extends AbstractEvent {

    private Long id;

    public CookStarted(Cooking aggregate){
        super(aggregate);
    }
    public CookStarted(){
        super();
    }
}
