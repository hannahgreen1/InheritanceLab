package Staff;

public abstract class Employee {

    private String name;
    private String NIno;
    private double salary;

    public Employee(String name, String NIno, Double salary){
        this.name = name;
        this.NIno = NIno;
        this.salary = salary;
    }

    public String getEmployeeName(){
        return this.name;
    }

    public String getEmployeeNIno(){
        return this.NIno;
    }

    public Double getEmployeeSalary(){
        return this.salary;
    }

    public Double raiseSalary(Double salary){
        return this.salary + 1000;
    }

    public Double payBonus(Double salary){
        return this.salary = (this.salary/100*1) + this.salary;

    }
}
