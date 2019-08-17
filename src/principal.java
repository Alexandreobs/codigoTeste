import java.util.ArrayList;

public class principal {
    public static void main(String[] args) {

try {

    CalculoMatematico sub = new CalculoMatematico();
    sub.divisao(5, 2);
}catch (ArithmeticException erro) {
    System.out.println("A operção não pode ser feita: = 0");
}


//        try {
//            ArrayList<String> lista = new ArrayList<>();
//            lista.add("Pato");
//            lista.add("Cachorro");
//            lista.add("gato");
//            System.out.println(lista.get(2));
//
//
//        } catch (Exception erro) {
//            System.out.println("deu merda:  " + erro.getMessage());
//            erro.printStackTrace();
//        }
//        {
//
//            System.out.println("\n");
//        }
//
//        try {
//
//            ArrayList<String> listaDois = new ArrayList<>(null);
//            listaDois.add("Pato");
//            listaDois.add("Cachorro");
//            listaDois.add("gato");
//            System.out.println(listaDois.get(2));
//
//        }catch (Exception erro){
//            System.out.println("ta osso: " + erro.getLocalizedMessage());
//            erro.printStackTrace();
//        }

    }
}

