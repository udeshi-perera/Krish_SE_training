package commonproject.model.customer;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String customerName;

    private String mobileNumber;

    private String email;
}
