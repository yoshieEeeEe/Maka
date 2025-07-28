
package adrian;

import java.util.Scanner;


public class Adrian {

  
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        String name, remarks;
        int sci, hist, math, soc, arts;
        float marks, per;
                
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter marks in Science: ");
        sci = sc.nextInt();
        System.out.print("Enter marks in History: ");
        hist = sc.nextInt();
        System.out.print("Enter marks in Math: ");
        math = sc.nextInt();
        System.out.print("Enter marks in Soc: ");
        soc = sc.nextInt();
        System.out.print("Enter marks in Arts: ");
        arts = sc.nextInt();
        
        marks = sci+hist+math+soc+arts;
        per = marks/5;
        System.out.println("\nTotal Marks: "+marks);
        System.out.printf("Total Percentage: %.2f\n",per);
            if (per<=70){
                remarks = "Fail";
            }else if (per<=75){
                remarks = "Poor";
            }else if (per<=80){
                remarks = "Fair";
            }else if (per<=85){
                remarks = "Good";
            }else if (per<=90){
                remarks = "Very Good";
            }else{
                remarks = "Excellent";
            }
        System.out.println("Remarks: "+remarks);
        
            if (per<70){
                System.out.println("\nTry Again.");
            }else {
                System.out.println("\nCongrats "+name+", you Passed.");
            }
    }
    
}
