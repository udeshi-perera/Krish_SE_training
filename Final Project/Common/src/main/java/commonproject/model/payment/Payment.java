package commonproject.model.payment;

import commonproject.model.order.OrderDetail;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderDetailId")
    @NotNull
    private OrderDetail orderDetailId;
}
