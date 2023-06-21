package com.example.CustomerBackend.service;

import com.example.CustomerBackend.enitity.Customer;
import com.example.CustomerBackend.enitity.Dependent;
import com.example.CustomerBackend.repository.CustomerRepository;
import com.example.CustomerBackend.repository.DependentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DependentService {
    @Autowired
    private DependentRepository dependentRepository;

    public Dependent saveDependent(Dependent dependent){
        return dependentRepository.save(dependent);
    }

    public List<Dependent> saveDependends(List<Dependent> dependents){
        return dependentRepository.saveAll(dependents);
    }

    public List<Dependent> getDependents(){
        return dependentRepository.findAll();
    }

    public Dependent getDependentById(int id){
        return dependentRepository.findById(id).orElse(null);
    }


    public String deleteDependent(int id){
        dependentRepository.deleteById(id);
        return "Dependent Removed !!" + id;
    }

    public Dependent updateDependent(Dependent dependent){

        Dependent existingDependent = dependentRepository.findById(dependent.getDID()).orElse(null);
        existingDependent.setName(dependent.getName());
        existingDependent.setEmail(dependent.getEmail());
        existingDependent.setGender(dependent.getGender());
        return dependentRepository.save(existingDependent);
    }

}



