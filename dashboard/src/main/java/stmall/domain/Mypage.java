package stmall.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "Mypage_table")
@Data
public class Mypage {

    private Long orderid;
    private String customerid;
    private String itemId;
    private Integer qty;
    private String address;
    private String orderStatus;
    private String deliveryStatus;
}
