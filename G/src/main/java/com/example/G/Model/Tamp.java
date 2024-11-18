//package com.example.G.Model;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "t_e_s_t")
//public class Tamp {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String name;
//    private String email;
//    private String address;
//    private double number;
//    private int age;
//
//    public Tamp(){
//
//    }
//
//    public Tamp(Long id, String name, String email, String address, double number, int age) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//        this.address = address;
//        this.number = number;
//        this.age = age;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public double getNumber() {
//        return number;
//    }
//
//    public void setNumber(double number) {
//        this.number = number;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}
