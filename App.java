import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.println("Name: " + name + "\nAge: " + age + "\nAddress: " + address);
    }
}