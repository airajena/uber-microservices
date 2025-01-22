package com.uber.auth.repositories;


import com.uber.auth.models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
