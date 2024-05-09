import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

             System.out.println("enter your name");
        String Name = sc.nextLine();
             System.out.println("enter street name");
        String Street = sc.nextLine();
              System.out.println("enter city");
        String city = sc.nextLine();
               System.out.println("enter pin");
        int pin = sc.nextInt();
              System.out.println("enter state");
        String State = sc.nextLine();

        FirstClass fsc = new FirstClass(Name);
        Address add = new Address(Street, city, State, pin);

        System.out.println("employee details ,, First class new name");


        System.out.println(fsc.getName());

        System.out.println(add.getStreet());
        System.out.println(city);
        System.out.println(add.getState());
        System.out.println(pin);

    }
}