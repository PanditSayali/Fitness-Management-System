package com.example.FitnessManagment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FitnessManagment.Model.Fitness;

public interface FitnessRepository extends JpaRepository<Fitness,String>{

	Fitness findByEmailID(String emailID);

}
