package miPrincipal;
import java.io.FileInputStream;
import java.util.Properties;

public class Aplicacion {
    public Usuario login(String usrname, String password) throws ErrorFisicoException{
        try{
            //abrimos el archivo de propiedades para lectura
            FileInputStream fis = new FileInputStream(("usuario.properties"));
            //cargamps el archivo de propiedades en un objeto tipo Propiesrtes
            Properties p = new Properties();
            p.load(fis);

            //leemos el valor de la propiedad ursname
            String usr = p.getProperty("usrname");

            //leemos el valos de la porpiedad de password
            String pwd =p.getProperty("password");

            //definimos la variable de retorno
            Usuario u = null;

            if (usr.equals(usrname) && pwd.equals(password))
            {
                //instanciamos y setteamis todos los datos
                u = new Usuario();
                u.setUserName(usr);
                u.setContrasena(pwd);
                u.setNombreUsuario(p.getProperty("nombre"));
                u.setEmail(p.getProperty("email"));  
            }
            //retornamos la instancia o null si no entramos al if
           return u;
           
        }catch( Exception ex){
            //cualquier error "salgo por exception"
          
            //throw new RuntimeException("Error verificando datos",ex);
            // throw new RuntimeException("Error verificando datos");
            throw new ErrorFisicoException(ex);


        }
    }
    
}
