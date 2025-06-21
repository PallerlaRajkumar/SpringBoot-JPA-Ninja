package org.example.store.repositories;

import org.example.store.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {


}
