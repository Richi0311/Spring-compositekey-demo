package com.arifsynchron.springcompositekeydemo;

import com.arifsynchron.springcompositekeydemo.entity.Employee;
import com.arifsynchron.springcompositekeydemo.reposirtory.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/employee")
public class SpringCompositekeyDemoApplication {

    @Autowired
    private EmployeeRepository repsoitory;

    @GetMapping()
    public List<Employee> getAll(){

        return repsoitory.findAll();
    }

    @PostMapping()
    public Employee saveEmployee(@RequestBody Employee emp){
        return  repsoitory.save(emp);

    }

    public static void main(String[] args) {
        SpringApplication.run(SpringCompositekeyDemoApplication.class, args);
    }

}
