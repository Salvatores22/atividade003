package questao5;

import java.util.Scanner;

public class questao5 {
public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int pessoas = 0;
    int pessoa1 = 0;
    for(int i =1; i < 6 ; i=i+1){
        System.out.println("Digite sua idade ");
        int idade = ler.nextInt();

        if(idade >= 18 ){
            pessoas++;

        }else{
            pessoa1++;
        }

    }System.out.println("  quantidade de pessoas com idade maior ou igual a 18 anos é de : " +pessoas+" , e de  pessoas menores de 18 anos e de : "+pessoa1);
ler.close();
}
    
}
