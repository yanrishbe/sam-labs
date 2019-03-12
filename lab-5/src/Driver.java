public class Driver {

    public static void main(String[] args) {
        Employee engineer1 = new Engineer();
        engineer1.setName("Vasiliy");
        engineer1.printName();
        engineer1.setQuantity(5);
        engineer1.countSalary();
        System.out.println("The salary of " + engineer1.getName() + " is: " + engineer1.getSalary());
        System.out.println(engineer1.taxCounter());

        Employee youngEngineer1 = new YoungEngineer();
        youngEngineer1.setName("Michayil");
        youngEngineer1.setQuantity(5);
        youngEngineer1.countSalary();
        System.out.println( "The salary of " + youngEngineer1.getName() + " is: " + youngEngineer1.getSalary());
        System.out.println(youngEngineer1.taxCounter());

        Employee racer1 = new Racer();
        racer1.setName("Anton");
        racer1.setQuantity(10);
        racer1.countSalary();
        System.out.println( "The salary of " + racer1.getName() + " is: " + racer1.getSalary());
        System.out.println(racer1.taxCounter());
    }
}
