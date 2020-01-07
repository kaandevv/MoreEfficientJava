package com.hibernate.model.onetoone;

import javax.persistence.*;

@Entity
@Table(name = "address_table")
public class Address {

    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;

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
}
