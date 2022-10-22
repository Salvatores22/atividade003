package questao4;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
          int chances = 5;
          do{
            System.out.println("Digite sua senha ");
            String senha = ler.nextLine();
            chances = - 1 ;
            if(senha.equals("java2022")){
                System.out.println("Palavra OK !");

            }else
            System.out.println("Palavra errada !");

          }while(chances > 2 );
          System.out.println("Número de tentantivas  excedeu o limite ");
          ler.close();
          
    }
    
}
