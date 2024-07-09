import java.util.Scanner;

public class Even_or_Not {

    
     // Function to check if a number is even
    public static boolean isEven(int n){
        return n % 2 ==0;
    }
    
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Any Number");
        int n = sc.nextInt();

        if(isEven(n)){
            System.out.println(n + " is an even number :");
          } else{
            System.out.println(n +" is not an even number:");
          }

        isEven(n);

        
    }
    



}
