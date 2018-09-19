package com.greenwin.placedumarche.entities;



import javax.persistence.*;

@Entity
public class AppUser {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String firstName;
    private String email;
    private String phoneNumber;

    @OneToOne(mappedBy = "app_user", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private Address address;


    //photo
    //position GPS


    public AppUser(String name, String firstName, String email, String phoneNumber, Address address) {
        this.name = name;
        this.firstName = firstName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public AppUser() {

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}