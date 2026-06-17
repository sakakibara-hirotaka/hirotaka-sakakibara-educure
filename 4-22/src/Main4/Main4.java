package Main4;

import com.google.gson.Gson;
import java.io.FileReader;

public class Main4 {
    public static void main(String[] args) {
        
        try {
            FileReader reader = new FileReader("excersise.json");
            Gson gson = new Gson();
            Employee employee = gson.fromJson(reader, Employee.class);

            System.out.println("Name: " + employee.getName());
            System.out.println("Age: " + employee.getAge());
            System.out.println("Salary: " + (int)employee.getSalary());
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
