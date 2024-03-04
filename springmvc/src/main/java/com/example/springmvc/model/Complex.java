package com.example.springmvc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

//@Entity
public class Complex {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String email;
    private String list1;
    private List<String> list2;
    private String text1;
    private Address address;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getList1() {
        return list1;
    }

    public void setList1(String list1) {
        this.list1 = list1;
    }

    public List<String> getList2() {
        return list2;
    }

    public void setList2(List<String> list2) {
        this.list2 = list2;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", list1='" + list1 + '\'' +
                ", list2=" + list2 +
                ", text1='" + text1 + '\'' +
                ", address=" + address +
                '}';
    }
}
