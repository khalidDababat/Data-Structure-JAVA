
package TowerOfHanoi;

import java.util.Scanner;


public class TowerOfHanoi {
  
    
    
    
    
    
    /*
     A     B       C   
    |||     |||      
     
    */
    
    
    
    public static void main(String[] args) {
         
        
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter number of Desk: ");
        int num = input.nextInt();
        System.out.println("Moved are :");
        moveDisk(num, 'A', 'B', 'C');
        
        
        
    }
    
    
     public static void moveDisk(int n , char a ,char b, char c){
        if(n==1){
            System.out.println("move disk "+n+"from "+a+" to "+ b);
            
        }
        else{
            moveDisk(n-1, a, c, b);
            System.out.println("move disk "+n+"from "+a+" to "+ b);
            moveDisk(n-1, c, b, a);
            
        }
    }
}
