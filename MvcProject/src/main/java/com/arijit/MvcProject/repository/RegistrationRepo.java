package com.arijit.MvcProject.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arijit.MvcProject.entity.User;


@Repository
public interface RegistrationRepo extends  JpaRepository<User, Long>{

}
