public class UsuarioNombreCortoException extends UsuariosException{

    UsuarioNombreCortoException(String message){
        super("Nombre debe de tener mas de 3 caracteres --> "+message);
    }
}
