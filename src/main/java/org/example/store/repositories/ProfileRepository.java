package org.example.store.repositories;

import org.example.store.dtos.UserSummary;
import org.example.store.entities.Profile;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface ProfileRepository extends CrudRepository<Profile, Long> {


}