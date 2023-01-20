import java.util.ArrayList;

public class Usuarios {

    ArrayList<String> usuarios = new ArrayList<>();
    public void meterUsuario(String name) throws UsuariosException{
        for (String usuario : usuarios){
            if (usuario==name){
                throw new UsuariosYaRegistradoExeption(name);

            }
            if(name.length()<=3){
                throw new UsuarioNombreCortoException(name);

            }

        }
        System.out.println("Usuario agregado "+name);
        usuarios.add(name);


    }
}
