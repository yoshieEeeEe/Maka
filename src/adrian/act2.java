
package adrian;

import java.util.Scanner;


public class act2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        
        if (num==0){
            System.out.println("Inputted number is Zero.");
        }else if (num%2==0){
            System.out.println("Inputted number is even.");
        }else{
            System.out.println("Inputted number is odd.");
        }
    }
    
}
