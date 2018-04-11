/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie2;

/**
 *
 * @author student
 */
public class Fib {
    
     public static int fibReku(int n) {

        if (n < 2) {
            return n; 
        } else {
            return fibReku(n - 1) + fibReku(n - 2); 
        }
    }
    
}
