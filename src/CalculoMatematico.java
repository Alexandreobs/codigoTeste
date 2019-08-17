public class CalculoMatematico {

    private int numero;
    private int numero2;


    public void divisao(int numero, int numero2) throws ArithmeticException {
        Integer divisao = 0;
        if (divisao == 0){
            throw new ArithmeticException(" estou lançando");
        } else {
            divisao (numero, numero2);
        }
            System.out.println(numero / numero2);

    }
}
