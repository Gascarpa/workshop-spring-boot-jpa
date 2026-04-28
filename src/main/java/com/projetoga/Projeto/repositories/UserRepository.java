package com.projetoga.Projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoga.Projeto.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
