package com.example.CustomerBackend.repository;

import com.example.CustomerBackend.enitity.Dependent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DependentRepository extends JpaRepository<Dependent,Integer> {
}
