public class Main {
    public static void main(String[] args){
        Employee emp = new Employee("Ted White", 25000.00);

        System.out.println("Name:" + emp.getName());
        emp.setName("John Smith");
        System.out.println("New Name:" + emp.getName());

        System.out.println("Salary:" + emp.getSalary());
        emp.setSalary(30000.00);
        System.out.println("New Salary:" + emp.getSalary());
    }
}
