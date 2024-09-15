/*Crie uma classe com um método que lê o nome e quatro notas de um aluno durante o semestre, calcula a média aritmética dessas notas. Se a nota for maior ou igual a (seis) o aluno será aprovado. Se a média for menor que seis, o programa deverá ler a nota do exame final e calcular a nova média, da seguinte forma: Média Final = (Média+Exame Final)/2. Nesse caso, para ser aprovado a média final deverá ser maior ou igual a cinco. Esse método deve ser chamado pelo método main de outra classe do mesmo projeto. */

import java.util.Scanner;
public class media{ // DEFINI A CLASSE
    public void calcularMedia(){ // DEFINI O MÉTODO
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Nota 1:");
        double n1 = scanner.nextDouble();
        System.out.println("Nota 2:");
        double n2 = scanner.nextDouble();
        System.out.println("Nota 3:");
        double n3 = scanner.nextDouble();
        System.out.println("Nota 4:");
        double n4 = scanner.nextDouble();

        double media = (n1+n2+n3+n4)/4; // CALCULO A MÉDIA
        System.out.println("Média do aluno: " + media);
        
        if (media >= 6) { // VER SE O ALUNO FOI APROVADO
            System.out.println(nome + " foi aprovado!");
        } 
        else { // SE Ñ VERIFICA A NOTA DO EXAME FINAL
            System.out.println(nome + " foi reprovado!");
            System.out.println("Nota do exame final:");
        double exameFinal = scanner.nextDouble();
        double mediaFinal = (media + exameFinal) / 2; // VER MEDIA

            if (mediaFinal >= 5) { // VER SE A MEDIA FOI APROVADA
                System.out.println(nome + " foi aprovado na média final!");
            } 
            else { // SE Ñ ALUNO REPROVADO
                System.out.println(nome + " foi reprovado na média final!");
            }
        }
    }
}
