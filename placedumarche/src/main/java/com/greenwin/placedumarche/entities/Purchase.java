package com.greenwin.placedumarche.entities;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Purchase {

    @Id
    @GeneratedValue
    private Integer id;
    private float total;

    @ManyToOne
    private Customer customer;

    @OneToMany(mappedBy = "purchase")
    private Set<Supplier> suppliers = new HashSet<>();

    public Purchase(float total, Customer customer) {
        this.total = total;
        this.customer = customer;
    }

    private Purchase() {

    }

    public Integer getId() {
        return id;
    }

    public float getTotal() {
        return total;
    }

    public Customer getCustomer() {
        return customer;
    }
}
