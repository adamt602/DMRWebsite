package com.gmail.adamt602.springonmyown.repositories;

import com.gmail.adamt602.springonmyown.domain.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
