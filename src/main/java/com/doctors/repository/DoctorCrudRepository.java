package com.doctors.repository;

import com.doctors.model.DoctorModel;
import org.springframework.data.repository.CrudRepository;

public interface DoctorCrudRepository extends CrudRepository<DoctorModel,Integer> {

}
