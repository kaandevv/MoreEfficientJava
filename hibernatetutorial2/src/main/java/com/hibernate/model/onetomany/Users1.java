package com.hibernate.model.onetomany;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Users1 {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String name;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Set<Address1> address;


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

    public Set<Address1> getAddress() {
        return address;
    }

    public void setAddress(Set<Address1> address) {
        this.address = address;
    }
}
