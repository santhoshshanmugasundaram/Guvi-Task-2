package guvi_task2_Q4;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("santhosh", 24, 12345, 50000.0);
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Employee ID: " + employee.getEmployeeID());
        System.out.println("Salary: $" + employee.getSalary());
    }
}

//output
//Name: santhosh
//Age: 24
//Employee ID: 12345
//Salary: $50000.0