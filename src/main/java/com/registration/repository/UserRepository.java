package com.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registration.entity.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails,Integer> 
{
	
}
