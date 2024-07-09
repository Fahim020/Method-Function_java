import java.util.Scanner;

public class MultiplicationTable {

    public static void printMultiplicationTable(int n){

        System.out.println("Multiplication Table for " + n + " up To"  );
         
        for(int i = 1; i<=10; i++){

            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }

        public static void main (String[] args){

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Any Number"); 
            int n = sc.nextInt();

          
            printMultiplicationTable(n); //Function call
        }
    
    
}
