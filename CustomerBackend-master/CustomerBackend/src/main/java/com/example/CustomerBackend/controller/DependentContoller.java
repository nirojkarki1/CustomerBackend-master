package com.example.CustomerBackend.controller;

import com.example.CustomerBackend.enitity.Customer;
import com.example.CustomerBackend.enitity.Dependent;
import com.example.CustomerBackend.repository.DependentRepository;
import com.example.CustomerBackend.service.DependentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DependentContoller {
    @Autowired
    private DependentService dependentService;

    @Autowired
    private DependentRepository dependentRepository;
   @PostMapping("/adddependent")
    public Dependent addDependent(@RequestBody Dependent dependent){
        return dependentService.saveDependent(dependent);
    }
    @PostMapping("/adddependents")
    public List<Dependent> addDependents(@RequestBody List<Dependent> dependents){
        return dependentService.saveDependends(dependents);
    }
   @GetMapping("/dependents")
    public List<Dependent> findAllDependents(){return dependentService.getDependents();}

    @GetMapping("/dependent/{Id}")
    public Dependent findDependentById(@PathVariable int Id){
        return dependentService.getDependentById(Id);
    }

    @PutMapping("dupdate")
    public Dependent updateDependent(@RequestBody Dependent dependent){
        return dependentService.updateDependent(dependent);
    }
    @DeleteMapping("/ddelete/{id}")
    public String deleteDependent ( @PathVariable int id){
        return  dependentService.deleteDependent(id);
    }

}


