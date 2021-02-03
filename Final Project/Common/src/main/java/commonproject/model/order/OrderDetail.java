package commonproject.model.order;


import commonproject.enumorator.Status;
import commonproject.model.menu.Menu;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "orderDetail")
public class OrderDetail {
    @Id
    @GeneratedValue
    private int id;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menuId")
    private Menu menuId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderId")
    @NotNull
    private Order orderId;

    @NotNull
    private int quantity;

    @NotNull
    private BigDecimal price;
}
