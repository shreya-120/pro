

public class Employee{  
    String name;
    int id;
    double salary;
    String city;
    
    public Employee(String name, int id, double salary, String city) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.city = city;
        
    }
    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("City: " + city);
    }
    public static void main(String[] args){
        // Creating an object of Employee
        Employee emp1 = new Employee("XYZ", 101,50000.0,"Dharwad");
        emp1.displayInfo(); 
    }
} 


