package miPrincipal;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TestException {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
          
        System.out.print("Introduce valor 1:");
        int a = leerEntero(entrada);//entrada.nextInt();
        System.out.print("Introduce valor 2:");
        int b = leerEntero(entrada);
        int resultado = a/b;

        int enteros[]={10,20,30,40};

        System.out.println(enteros[3]);
                
        System.out.println(resultado);
                 
    }
    public static int leerEntero(Scanner scanner){
        while (true){
            try{
                int valor = scanner.nextInt();
                scanner.nextLine(); //consume la linea del enter
                return valor;
            }catch(InputMismatchException e){
                System.out.println("\u001B[31m\t***Error: debe ingresar un número entero válido***\u001B[0m");
                scanner.nextLine();
            }
        }
    }
}


