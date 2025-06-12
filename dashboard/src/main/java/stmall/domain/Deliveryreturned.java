package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import stmall.infra.AbstractEvent;

@Data
public class Deliveryreturned extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String customerId;
    private String ItemId;
    private Integer qty;
    private String address;
}
