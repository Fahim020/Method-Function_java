import java.util.Scanner;

public class Prime_No {

    public static void printPrime(int n){


    int count =0;
    for(int i=1; i<=n; i++){
      if(n%i==0){
        count++;
      }
    }
    if (count==2)
      System.out.println("prime Number");

    else
       System.out.println("Not prime Number");
      
      } 

public static void main(String[] args){

    // Take input from the user 
        // Create an instance of the Scanner class
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter the number :");
         int n = sc.nextInt();

         printPrime(n); // function call

}

}