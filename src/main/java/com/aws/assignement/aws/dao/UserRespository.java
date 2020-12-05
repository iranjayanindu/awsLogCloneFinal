package com.aws.assignement.aws.dao;

import com.aws.assignement.aws.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User, Integer> {
    public User getUserByUserId(int userId);

}
