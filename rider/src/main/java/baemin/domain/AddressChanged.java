package baemin.domain;

import baemin.domain.*;
import baemin.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class AddressChanged extends AbstractEvent {

    private Long id;
}


