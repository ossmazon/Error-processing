public class ArithmeticTest {

    public void div(int num1, int num2) {
        int resultado = 0;

        try {
            resultado = num1 / num2;
            System.out.println("El resultado de la division es: "+resultado);

        }catch (ArithmeticException e){
            System.out.println("La division entre 0 no es posible: "+e.getMessage());

        }




    }
}
