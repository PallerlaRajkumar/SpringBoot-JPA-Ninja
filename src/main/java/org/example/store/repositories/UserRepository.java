package org.example.store.repositories;

import org.example.store.dtos.UserSummary;
import org.example.store.entities.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    @EntityGraph(attributePaths = {"tags", "addresses"} )
    Optional<User> findByEmail(String email);

    @EntityGraph(attributePaths = {"tags", "addresses"} )
    @Query("select u from User u")
    List<User> findAllWithAddresses();



    @Query("select u.id as id, u.email as email from User u  where u.profile.loyaltyPoints > :loyaltyPoints order by u.email")
 //   @EntityGraph(attributePaths = {"user"})
    List<UserSummary> findLoyalUsers(@Param("loyaltyPoints") int loyaltyPoints);






}
