package commonproject.model.order;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue
    private int id;

    private LocalDateTime orderDateTime;
}
