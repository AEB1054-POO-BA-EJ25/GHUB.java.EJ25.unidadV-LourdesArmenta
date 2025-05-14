package miPrincipal;

public class Calculadora {
    public int factorial(int n){
        if (n<0)
            throw new ArithmeticException("No se puede calcular el factorial de un número negativo");
        if(n>12)
            throw new IllegalArgumentException("No se puede calcular el factorial mayor de 12");
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;

    }
    
}
