import java.util.Scanner;

public class Matrizes {

    public static void main(String[] args) {
        //Arranjos bidimensionais, vetor de vetores
        //Homogenea, Ordenada, alocada de uma vez só
        //Vantagem: Acesso imediato aos elementos pela sua posição
        //Desvantagem: tamanho fixo, dificuldade para se realizar inserções e deleções

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas linhas? ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        //percorre as linhas
        for (int i=0; i<n; i++) {
            //percorre as colunas
            for (int j=0; j<matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Numeros na diagonal principal ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i]+" ");
        }

        int count = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if(matriz[i][j] < 0) {
                    count++;
                }
            }
        }

        System.out.println("\n Quantidade de numeros negativos: "+count);
        sc.close();
    }

}
