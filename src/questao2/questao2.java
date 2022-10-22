package questao2;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("escrever uma frase ");
        String frase = ler.nextLine();
        System.out.println("Quantas vezes vai ser repetida ");
        int vezes = ler.nextInt();

        for(int i = 0; 1 < vezes ; i++){
        System.out.println(frase);}
      ler.close();
        
    } 
    
}
