import java.util.Scanner;

public class User_input {
public static void main(String[] args) {
    System.out.println("User Input Program");
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter no 1");
    int a=sc.nextInt();
    System.out.println("enter no 2");
    int b=sc.nextInt();
    int sum=a+b;
    System.out.println("The sum of these no");
    System.out.println(sum);
}
}
