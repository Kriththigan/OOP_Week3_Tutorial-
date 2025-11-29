public class Employee extends Person{
    private double salary;
    public Employee(String initialName, double initialSalary){
        super(initialName);
        this.salary = initialSalary;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double newSalary){
        salary = newSalary;
    }
}

