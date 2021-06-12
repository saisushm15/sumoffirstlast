/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum.of.first.last;
import java.util.Scanner;
/**
 *
 * @author konda babu
 */
public class SumOfFirstLast {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t>0)
        {
          int n=input.nextInt();
          int sum=0,firstdigit,lastdigit; 
          lastdigit=n%10;
          firstdigit=n;
          while(n>=10)
          {
              n=n/10;
          }
          firstdigit=n;
          sum=firstdigit+lastdigit;
          System.out.println(sum);
        }
        t--;
        
    }
    
}
