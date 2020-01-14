package Revisao;
//Imprima todos os múltiplos de 3, entre 1 a 100.
public class Repeticao {
    public static void main(String[] args) {
        //Criação de uma lista que contém 4 valores
        String[] saladaFrutas = new String[4];
        saladaFrutas[0] = "Banana";
        saladaFrutas[1] = "Kiwi";
        saladaFrutas[2] = "Morango";
        saladaFrutas[3] = "Atemoia";

        //Percorrer a lista e mostrar a quantidade de itens através do contador
        int contador = 0;
        for (String salada : saladaFrutas){
            contador++;
            System.out.println("Item " + contador +":" + salada);
        }

        //mostrar o comprimento da salada de frutas
        System.out.println(saladaFrutas.length);

        //Realizar o looping com while(enquanto):
        //enquanto o contador for menor ou igual a 4
        //imprimir Roger é legal
        int i = 0;
        while (i <= saladaFrutas.length){
            System.out.println("Roger é legal");
            i++;
        }

        //utilizando for para realizar o mesmo processo feito anteriormente
        //for(variável;condição;incremento ou decremento)
        for(int contador2 = 0; contador2 <= saladaFrutas.length; contador2++){
            System.out.println("Roger é legal");
        }

        //estrutura de escolha
        int item = 1;
        switch (item){
            case 1:
                System.out.println("MANEIRO");
                //parar a estrutura de escolha ou outra estrutura
                break;
            case 2:
                System.out.println("LEGAL");
                break;
        }
    }
}
