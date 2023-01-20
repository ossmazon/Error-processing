import java.io.IOException;

public class CombinationOfException {


    public void div(int num1, int num2) throws ArithmeticException,IOException{
        int resultado = 0;

        try {
            resultado = num1 / num2;

            if (num1==1){
                throw new IOException();

            }
        }catch (ArithmeticException e){
            throw new ArithmeticException();

        }

        System.out.println("El resultado de la division es: "+resultado);

    }
}
