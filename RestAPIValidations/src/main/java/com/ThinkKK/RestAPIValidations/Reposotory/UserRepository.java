package com.ThinkKK.RestAPIValidations.Reposotory;

import com.ThinkKK.RestAPIValidations.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
