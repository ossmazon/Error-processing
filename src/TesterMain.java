import java.io.IOException;

public class TesterMain {

    public static void main(String[] args) {

        ArithmeticTest arithmeticTest =new ArithmeticTest();
        arithmeticTest.div(10,0);

        CombinationOfException combinationOfException =new CombinationOfException();



        try {
            combinationOfException.div(20,0);
        }catch (ArithmeticException e){
            System.out.println("Hay una excepcion de tipo aritmetica");
        }catch (IOException e){
            System.out.println("Hay una excepcion de tipo IO");
        }catch (Exception e){
            System.out.println("Hay una excepcion de tipo "+e.getClass());
        }

        Usuarios usuarios =new Usuarios();
        try {
            usuarios.meterUsuario("PEPE");
            usuarios.meterUsuario("JUAN");
            usuarios.meterUsuario("PEP");

        }catch (UsuariosException e){
            System.out.println(e.getMessage()+" "+e.getClass());

        }


    }

}
