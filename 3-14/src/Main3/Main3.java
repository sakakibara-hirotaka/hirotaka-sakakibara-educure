package Main3;

public class Main3 {
    public static void main(String[] args) {
        
        Employee regular = new RegularEmployee("田中" ,350000);
        Employee partTime = new PartTimeEmployee("佐藤" , 1000, 120);
        
        System.out.println(regular.getRole() + " (" +regular.getName() + ") の給料: " + regular.calculateSalary() +"円");
        System.out.println(partTime.getRole() + " (" +partTime.getName() + ") の給料: " + partTime.calculateSalary() +"円");
    }
}
