package com.rrs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rrs.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
