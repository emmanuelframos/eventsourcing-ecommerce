package com.ecommerce.iam.repository;

import com.ecommerce.iam.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findByUsername(String username);
}
