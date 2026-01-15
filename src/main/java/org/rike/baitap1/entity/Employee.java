package org.rike.baitap1.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String fullName;
    private String address;
    private String phone;
    private LocalDate dateBirth;
    private boolean status;
    
    public Employee(String fullName, String address, String phone, LocalDate dateBirth, boolean status) {
        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
        this.dateBirth = dateBirth;
        this.status = status;
    }

    



}
