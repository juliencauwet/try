package com.greenwin.placedumarche.entities;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue
    private int id;
    private String city;
    private String zipCode;
    private String street;
    private String number;
    private String building;
    private String sup;
    //country

    // On Customer class:

  //  @OneToOne(optional=false)
  //  @JoinColumn(
  //          name="CUSTREC_ID", unique=true, nullable=false, updatable=false)
  //  public CustomerRecord getCustomerRecord() { return customerRecord; }
//
  //  // On CustomerRecord class:
//
  //  @OneToOne(optional=false, mappedBy="customerRecord")
  //  public Customer getCustomer() { return customer; }



    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "appuser_id")
    private AppUser appUser;

    @OneToOne(mappedBy = "address")
    private Supplier supplier;

    public Address(String city, String zipCode, String street, String number) {
        this.city = city;
        this.zipCode = zipCode;
        this.street = street;
        this.number = number;
    }

    public Address() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
