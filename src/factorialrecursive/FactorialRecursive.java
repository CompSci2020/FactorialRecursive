/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialrecursive;

/**
 *
 * @author richardkaune
 */
public class FactorialRecursive {

    public static void main(String[] args) {
       int num = 5;
       System.out.println("Factorial (" + num + "!) is " + fact(num));
    }

   public static int fact (int n) {
        if (n == 0 || n ==1) {
            return 1;
        } else {
            return (n * fact(n-1));
        }
    }
    
}
