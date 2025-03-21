import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        // Exemplo de uso do do-while
        System.out.println("Discando....");

        do {
            System.out.println("Tentando ligar...");
        } while (tocando());

        System.out.println("Alo !!!");
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        return !atendeu;

    }
}
