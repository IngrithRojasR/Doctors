package com.doctors.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="specialty")

public class Specialty{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idSpecialty;

    private String name;

    private String description;
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy="specialty")
    @JsonIgnoreProperties("specialty")
    private List<DoctorModel> doctors;


    public Integer getIdSpecialty() {
        return idSpecialty;
    }

    public void setIdSpecialty(Integer idSpecialty) {
        this.idSpecialty = idSpecialty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<DoctorModel> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<DoctorModel> doctors) {
        this.doctors = doctors;
    }
}
