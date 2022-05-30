import java.util.Scanner;


public class Calculator{
    public static int add(int a,int b){
        int sum = a + b;
        return sum ;

    }
    public static int difference(int a,int b){
        int diff  = a-b;
        return diff;
        
    }
    public static int multiply(int a,int b){
        return a*b;

    }
    public static double divide(int a,int b){
        double ans   = (double)a%b;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("What Operation You want to perform Press A for add S for Substract D for Divide M for Multiply :");
        Scanner sc = new Scanner(System.in);
        char option = sc.next().charAt(0);
        if(option=='A'){
            System.out.println("Enter the first number :");
            int a = sc.nextInt();
            System.out.println("Enter the second number :");
            int b = sc.nextInt();
            System.out.println("The Sum of "+a+" And "+b+" is :"+add(a,b));
            
        }
        if(option=='S'){
            System.out.println("Enter the first number :");
            int a = sc.nextInt();
            System.out.println("Enter the second number :");
            int b = sc.nextInt();
            System.out.println("The difference  of "+a+" And "+b+" is :"+difference(a,b));
            
        }
        if(option=='M'){
            System.out.println("Enter the first number :");
            int a = sc.nextInt();
            System.out.println("Enter the second number :");
            int b = sc.nextInt();
            System.out.println("The Product of "+a+" And "+b+" is :"+multiply(a,b));
            
        }
        if(option=='D'){
            System.out.println("Enter the first number :");
            int a = sc.nextInt();
            System.out.println("Enter the second number :");
            int b = sc.nextInt();
            System.out.println("The Remainder of "+a+" divided by  "+b+" is :"+divide(a,b));
            
        }
        sc.close();
    
    }

}