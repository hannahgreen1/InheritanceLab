package staff;

public abstract class Employee {

    private String name;
    private String nIno;
    private double salary;

    public Employee(String name, String nIno, Double salary){
        this.name = name;
        this.nIno = nIno;
        this.salary = salary;
    }

    public String getEmployeeName(){
        return this.name;
    }

    public String getEmployeeNIno(){
        return this.nIno;
    }

    public Double getEmployeeSalary(){
        return this.salary;
    }

    public Double raiseSalary(Double salary){
        return this.salary = this.salary + 1000.00;
    }

    public Double payBonus(Double salary){
        return this.salary = (this.salary*0.1) + this.salary;

    }
}
