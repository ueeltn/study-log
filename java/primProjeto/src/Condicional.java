public class Condicional {
    public static void main(String[] args) {

        int anoDeLancamento = 1980;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assitir");
        }

        if (incluidoNoPlano && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado para assistir!");
        } else {
            System.out.println("Deve pagar a locação!");
        }

    }
    }
