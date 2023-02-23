package com.arifsynchron.springcompositekeydemo.entity;


import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@Data
//@IdClass(EmployeePKId.class)
public class Employee {

   // @Id
    //private int employeeId;
    //@Id
    @EmbeddedId
    private EmployeePKId employeePKId;
   // private int deptId;
    private String name;
    private String phone;
}
