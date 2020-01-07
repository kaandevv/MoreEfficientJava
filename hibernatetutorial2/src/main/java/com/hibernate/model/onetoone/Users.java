package com.hibernate.model.onetoone;

import javax.persistence.*;

@Entity
@Table(name = "user_table")
public class Users {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String name;

    @OneToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private Address address;




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
