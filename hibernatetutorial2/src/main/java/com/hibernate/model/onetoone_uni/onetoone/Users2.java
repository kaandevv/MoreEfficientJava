package com.hibernate.model.onetoone_uni.onetoone;

import javax.persistence.*;

@Entity
@Table
public class Users2 {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String name;

    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private Address2 address2;


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

    public Address2 getAddress2() {
        return address2;
    }

    public void setAddress2(Address2 address2) {
        this.address2 = address2;
    }
}
