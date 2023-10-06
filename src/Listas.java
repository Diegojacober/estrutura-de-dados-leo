import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        //Lista é uma estrutura de dado homogenea
        //Ordenada
        //Iniciada vazia e seus elementos são alocados sob demanada
        // Cada elemento ocupa um nó

        //Vantagem: tamanho variável, facilidade para se realizar inserções e deleções
        //Desvantagem: acesso sequencial

         List<String> list = new ArrayList<>();

         list.add("Nicole");
         list.add("Diego");
         list.add("Angelo");
         list.add("Bona");
         list.add(3, "Diego Castan");

        System.out.println(list.size());

        //Remove ou com indíce ou o próprio texto
        list.remove("Diego");

        for (String nome:list) {
            System.out.println(nome);
        }


    }
}
