import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Comprando doce no valor de R$ " + valorDoce);
            mesada -= valorDoce;

        }
    }

    public static Double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
