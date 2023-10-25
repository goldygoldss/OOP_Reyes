
public class Employee {
    public int salary;

public static void main(String[] args){
    Employee employee = new Employee();
    Manager manager = new Manager();
    Director director = new Director();
    
    employee.salary = 50000;
    director.salary = 80000;
    manager.budget  = 100000;
    director.stockOptions = 1000;
    
    System.out.println("Employee Salary : " + employee.salary);
    System.out.println("Director Salary : " + director.salary);
    System.out.println("Manager Budget  : " + manager.budget);
    System.out.println("Director Stock Options : " + director.stockOptions);
}

}
