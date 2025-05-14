package miPrincipal;

import java.util.Scanner;

public class TestFactorialException {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dame valor de n: ");
        int n = entrada.nextInt();
        
        Calculadora calculadora = new Calculadora();
        System.out.println("El factorial de "+n+" es "+calculadora.factorial(n));
    } 
        
           
}


        
 
