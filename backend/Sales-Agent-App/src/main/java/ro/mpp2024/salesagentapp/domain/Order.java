package ro.mpp2024.salesagentapp.domain;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @ManyToOne
    private int user_id;

    @ManyToOne
    private int product_id;

    private int quantity;

    private LocalDateTime order_date;

    public Order(int id, int product_id, int user_id, int quantity, LocalDateTime order_date) {
        this.id = id;
        this.product_id = product_id;
        this.user_id = user_id;
        this.quantity = quantity;
        this.order_date = order_date;
    }

    public int getId() {
        return id;
    }

    public int getUser_id() {
        return user_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDateTime getOrder_date() {
        return order_date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setOrder_date(LocalDateTime order_date) {
        this.order_date = order_date;
    }
}
