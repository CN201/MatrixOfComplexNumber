/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package User;

import Designer.Complex;

/**
 *
 * @author Chotikarn
 */
public class MatrixOfComplexNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Complex a = new Complex(5.0, 6.0);  
        Complex b = new Complex(-3.0, 4.0);  
  
        System.out.println("a            = " + a);  
        System.out.println("b            = " + b);  
        System.out.println("Re(a)        = " + a.re());  
        System.out.println("Im(a)        = " + a.im());  
        System.out.println("a + b        = " + a.plus(b));  
        System.out.println("a - b        = " + a.minus(b));  
        System.out.println("a * b        = " + a.multi(b));  
        System.out.println("b * a        = " + b.multi(a));  
        
    }
    
}
