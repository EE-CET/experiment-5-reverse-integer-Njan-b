import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
       
        int original = number;
        
       
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            number = Math.abs(number); 
        }
        
        
        int reversed = 0;
        while (number > 0) {
            int digit = number % 10;  
            reversed = reversed * 10 + digit;  
            number = number / 10;  
        }
        
     
        if (isNegative) {
            reversed = -reversed;
        }
        System.out.println("Original number: " + original);
        System.out.println("Reversed number: " + reversed);
        
        scanner.close();
    }
}