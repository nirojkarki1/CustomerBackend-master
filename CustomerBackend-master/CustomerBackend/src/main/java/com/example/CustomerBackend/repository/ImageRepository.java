package com.example.CustomerBackend.repository;

import com.example.CustomerBackend.enitity.Imagedata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ImageRepository extends JpaRepository<Imagedata,Long> {

   Optional<Imagedata> findByName(String fileName);
}
