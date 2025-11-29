/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basic.calculater;

import java.util.Scanner;

/**
 *
 * @author Siya
 */

// 1. Create a public class called Calculator
public class BasicCalculater {

    /**
     * 2. Inside of the class, create a Calculator() constructor.
     * You can leave the contents of the constructor empty.
     */
    public BasicCalculater(){
        
    }
    
    /**
     * 3 && 4. Create a public method that returns an int and call
     *it add(), containing two parameters.
    */
    public int add(int a, int b){
        return a + b;   // 5. The add() method should return the sum
                        //of a and b.
    }
    
    /**
     * 
     * 6. Next, create another similar method called subtract().
     * The subtract method should accept two parameters just
     * like the add() method does.
     */
    public int subtract(int a, int b){
        return a - b;   // 7. Inside of the subtract() method, return
                        // the different between a and b.
    }
    // 8. Create another method called multiply(). The multiply() 
    // method should accept two parameters.
    public int multiply(int a, int b){
        if (b == 0){
            System.out.println("Erro: Can't multiply with zero!");
            return 0;
        }
        return a * b;   // 9. Inside of the multiply method, return
                        // the product of a and b.
    }
    
    // 10. Create another method called divide(). It should accept
    // two int parameters
    public int divide(int a, int b){
        if (b == 0){
            System.out.println("Error: Can't divide by zero!");
            return 0;
        }
        return a / b;   // 11. Inside of the divide() method, return
                        // a divided by b.
    }
    
    // 12. Create another method called modulo. It must accept two
    // int parameters.
    public int modulo(int a, int b){
        return a % b;   // 13. Inside of the modulo() method, return
                        //a modulo b.
    }
    
    // 14. Next, create a main() method with all its necessary keywords.
    public static void main(String[] args) {
        // 15. Inside of the main method(). create a Calculator object
        // called myCalculator.
        BasicCalculater myCalculator = new BasicCalculater();
        Scanner sc = new Scanner(System.in);
        
        // 16. Print out the value of calling the add() method on myCalculator
        // Litle experiment
        System.out.println("===SUM===");
        System.out.print("Please enter first number: ");
        int aa = sc.nextInt();
        System.out.print("Please enter second number: ");
        int bb = sc.nextInt();
        System.out.println("Our sum is: " + myCalculator.add(aa, bb));
        
        System.out.println("");
        
        System.out.println("===SUBTRACT===");
        System.out.print("Please enter first number: ");
        int xy = sc.nextInt();
        System.out.print("Please enter second number: ");
        int yx = sc.nextInt();
        System.out.println("Our subtraction is: " + myCalculator.subtract(xy, yx));
        
        System.out.println("");
        
        
        System.out.println("===MUTLIPLY===");
        System.out.print("Please enter first number: ");
        int xx = sc.nextInt();
        System.out.print("Please enter second number: ");
        int yy = sc.nextInt();
        System.out.println("Our multiplication is: " + myCalculator.multiply(xx, yy));
        
        System.out.println("");
        
        
        System.out.println("===DIVIDE===");
        System.out.print("Please enter first number: ");
        int x = sc.nextInt();
        System.out.print("Please enter second number: ");
        int y = sc.nextInt();
        System.out.println("Our division is: " + myCalculator.divide(x, y));
        
        System.out.println("");
        
        
        System.out.println("===MODULO===");
        System.out.print("Please enter first number: ");
        int ab = sc.nextInt();
        System.out.print("Please enter second number: ");
        int ba = sc.nextInt();
        System.out.println("Our modulo is: " + myCalculator.modulo(ab, ba));
    }
    
}
