package com.example.FitnessManagment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FitnessManagment.Model.Fitness;
import com.example.FitnessManagment.Model.login;

public interface loginRepository extends JpaRepository<login, String>
{
	login findByEmail(String email);

	void save(Fitness newMember);

}
