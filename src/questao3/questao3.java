package questao3;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Primeiro número ");
        int number1 = ler.nextInt();
        System.out.println("Segundo número");
        int number2 = ler.nextInt();
        if((number1) < (number2)) {
            for(int i  = (number1+1); i < number2; i++){
                System.out.println("=====");
                System.out.println("os números entre eles são;" +i);


            }
        }else{
            for( int j = (number2+1); j < number1; j++ ){
                System.out.println("=====");
                System.out.println("os números entre eles são: " +j);
            }ler.close();
        }
    }
    
}
