import java.util.Scanner;

public class Average {
    public static void main(String args[]){
        float a,b, avg;
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        System.out.println("Enter 1st number");
        a= obj.nextFloat();
        System.out.println("Enter 2nd number");
        b= obj.nextFloat();
        avg=(a+b)/2;
        System.out.println("The average of numbers "+a+" and "+b+" is "+avg);
    }
}
