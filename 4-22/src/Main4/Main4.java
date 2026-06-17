package Main4;

import com.google.gson.Gson;
import java.io.File;

public class Main4 {
    public static void main(String[] args) {
        
    File file = new File("gson-2.10.1.jar");
    Employee employee = gson.fromJson(file, Employee.class);

    System.out.println("Name: " + employee.getName());
    System.out.println("Age: " + employee.getAge());
    System.out.println("Salary: " + (int)employee.getSalary());

    }
}
