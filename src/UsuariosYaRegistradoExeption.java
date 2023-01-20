public class UsuariosYaRegistradoExeption extends UsuariosException{
    UsuariosYaRegistradoExeption(String messag){
        super("ya registrado --> "+messag);
    }
}
