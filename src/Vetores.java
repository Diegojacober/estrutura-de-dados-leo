import java.util.Locale;
import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {
       // Vetor = arranjos unidimensionais
       // array -> homogenea (dados do mesmo tipo), ordenada, alocada de uma vez só, em um bloco contíguo de memória

       //vantagem: acesso imediato aos elementos pela sua posição
       // desvantagem -> tamanho fixo, dificuldade para realizar inserções e deleções

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++ ) {

            vect[i] = sc.nextDouble();

        }

        sc.close();

    }

}
