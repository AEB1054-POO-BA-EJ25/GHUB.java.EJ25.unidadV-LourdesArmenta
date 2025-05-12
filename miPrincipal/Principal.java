package miPrincipal;

public class Principal {
    

    public static void main(String[] args) {
        try{
            Aplicacion app = new Aplicacion();
            //intentamos el login
            Usuario u = app.login("juan", "juan123sito");
            //mostramos el resultado
            System.out.println(u);
        }
        catch (Exception ex)
        {
            //ocurrio un error
            System.out.println("Servicio temporalmente interrumpido: ");
            System.out.println(ex.getMessage());
        }
        
    }
}