import java.util.Scanner;

public class Factorial {


    public static void printfactorial(int n){

        // LOOP
        if (n < 0){
            System.out.println("Invalid Number");
            return;
        }


        int i,Factorial = 1; // Initialize factorial to 1

        // Loop to calculate factorial
        for (i=1; i<=n;i++){
            Factorial = Factorial*i;
        }
        System.out.println(Factorial);
        return;
    }

    public static void main(String[] args) {

        // Take input from the user 
        // Create an instance of the Scanner class
        Scanner sc = new Scanner (System.in);

         System.out.println("Enter the number :");
         int n = sc.nextInt();


        printfactorial(n); // Function call
        

    }
    
}
