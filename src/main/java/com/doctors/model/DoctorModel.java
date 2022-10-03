package com.doctors.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="doctor")

public class DoctorModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idDoctor;
    private String name;
    private String email;
    private Integer age;

    public DoctorModel() {
    }

    public DoctorModel(String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public DoctorModel(Integer id, String name, String email, Integer age) {
        this.idDoctor = idDoctor;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Integer getId() {
        return idDoctor;
    }

    public void setId(Integer id) {
        this.idDoctor = idDoctor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "DoctorModel{" +
                "id=" + idDoctor +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
