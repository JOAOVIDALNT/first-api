package com.firstapi.userdepartment.repositories;

import com.firstapi.userdepartment.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
