package miPrincipal;
import java.io.FileInputStream:
import java.util.Properties;

public class Aplicacion {
    public Usuario login(String usrname, String password){
        try{
            //abrimos el archivo de propiedades para lectura
            FileInputStream fis = new FileInputStream(("usuario.properties"));
            //cargamps el archivo de propiedades en un objeto tipo Propiesrtes
            Properties p = new Properties();
            p.load(fis);

            //leemos el valor de la propiedad ursname
            String usr = p.getProperty("usrname");

            //leemos el valos de la porpiedad de password
            String pwd = ´p.getProperty("password");

            //definimos la variable de retorno
           


        }catch(){

        }
    }
    
}
