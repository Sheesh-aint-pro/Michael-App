import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args){

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> address = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String input_name = sc.nextLine();
        names.add(input_name);

        System.out.print("Enter Age: ");
        int input_age = sc.nextInt();
        age.add(input_age);

        sc.nextLine();

        System.out.print("Enter Address: ");
        String input_adr = sc.nextLine();
        address.add(input_adr);

        System.out.println("Name: " + names + "\nAge: " + age + "\nAddress: " + address);
    }
}