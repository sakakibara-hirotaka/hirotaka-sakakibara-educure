package Main4;

import com.google.gson.Gson;

public class Main4 {
    public static void main(String[] args) {
        
    String json = "{\"name\":\"佐藤 一郎\",\"age\":35,\"salary\":\"450000\"}";

    Gson gson  = new Gson();
    Employe employe = gson.fromJson(json, Employe.class);

    System.out.println("Name: " + employe.getName());
    System.out.println("Age: " + employe.getAge());
    System.out.println("Salary: " + (int)employe.getSalary());

    }
}
