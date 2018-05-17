package staff.management;


import staff.Employee;
import staff.management.Manager;

public class Director extends Employee {

    private double budget;


    public Director(String name, String nIno, Double salary, String deptName, Double budget){
        super(name, nIno, salary);
        this.deptname = deptName;
        this.budget = budget;

    }

    
}

