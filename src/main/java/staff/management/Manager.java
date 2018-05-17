package staff.management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String nIno, Double salary, String deptName){
        super(name, nIno, salary);
        this.deptName = deptName;
    }

    public String getDeptName(){
        return this.deptName;
    }

}
