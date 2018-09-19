package com.greenwin.placedumarche.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Integer id;
    private String email;

    //Compte - Historique achats - produits favoris -mode de paiement (carte de crédit/ paypal

    @OneToMany(mappedBy = "customer")
    private Set<Purchase> purchases = new HashSet<>();

    public Customer(final String email) {
        this.email = email;
        this.purchases = purchases;
    }

    private Customer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Purchase> getPurchases() {
        return purchases;
    }
}
