package miPrincipal;

public class LanzarExcepciones {
    public static void main(String[] args) {
       int valor = Math.incrementExact(17);
       System.out.println(valor);
        valor = Math.incrementExact(2147483647);
        System.out.println(valor);
       //System.out.println(Integer.MAX_VALUE);
        System.out.println(valor);
    }
    
}
