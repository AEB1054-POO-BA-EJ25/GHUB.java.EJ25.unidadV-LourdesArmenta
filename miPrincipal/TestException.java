package miPrincipal;
public class TestException {
    public static void main(String[] args) {
        try{
        
        int resultado = 10/0;
        System.out.println(resultado);
        } catch (ArithmeticException ex){
            System.out.println("Error: se intentó dividir entre cero"+ex.getMessage());

        }
    }

}
