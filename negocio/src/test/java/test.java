import mx.desarrollo.entity.Usuario;
import mx.desarrollo.integration.ServiceFacadeLocator;

public class test {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();

        usuario = ServiceFacadeLocator.getInstanceFacadeUsuario().login("123","rincon.diana@uabc.edu.mx");

        if(usuario.getId() != null){
            System.out.println("Login exitoso con el correo: " + usuario.getCorreo());
        }else{
            System.out.println("No se encontro registro");
        }
    }
}
