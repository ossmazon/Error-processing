public class UsuariosException extends Exception{

    UsuariosException(String message){
        super("Error al registrar --> "+message);
    }
}
