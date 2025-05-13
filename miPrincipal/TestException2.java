package miPrincipal;

public class TestException2 {
    public static void main(String[] args) {
        try{
            //simulando una condicion que lance la nueva excepcion
            lanzarExcepcion();
            System.out.println("Esto no se ejecuta");
        }catch(MiExcepcionPersonalizada ex){
            System.out.println("Mi excepcion es capturada: "+ex.getMessage());
        }
        
    }
    public static void lanzarExcepcion() throws MiExcepcionPersonalizada{
        throw new MiExcepcionPersonalizada(("Este es un mensaje de excepcion personalizada"));
    }
    
}
