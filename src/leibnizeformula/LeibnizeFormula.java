
package leibnizeformula;

/**
 *
 * @author Shahed A. Abedalwahab
 * 3/10/2019
 * Leibnize Formula to approximate the value of pi at 100, 200, 300, ....10000 terms 
 */
public class LeibnizeFormula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int counter=100;
        double pi=0;
        
   
       
       for (int i=1;i<=counter;i++)
       {
           
           
        pi+=(4*((Math.pow(-1,i+1))/(2*i-1)));
        if ((i==counter)&&(counter!=10100))
        {
            System.out.print("The value of pi after "+counter+" iteration is " );
       System.out.println(pi);
            i=0;
            counter+=100;
            pi=0;
        
        }
      
       }
    }
    
}
