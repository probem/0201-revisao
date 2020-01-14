package Revisao;

public class Condicoes {
    public static void main(String[] args) {
        float nota1 = 9.9f;
        float nota2 = 7.5f;
        double media = (nota1 + nota2)/2;
        String nomeAluno = "Jerfferson";

        if(media >= 7.0){
            System.out.println("Aprovado");
        }
        else if(media > 5.0 && media < 7.0){
            System.out.println("Recuperação");
        }
        else{
            System.out.println("Reprovado");
        }
        System.out.println(nomeAluno.toUpperCase() + " você tirou a média " + media);
    }
}
