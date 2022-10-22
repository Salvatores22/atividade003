package questao1;
import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor ;
        System.out.println("Digite o valor do número da tabuada: ");
         valor = ler.nextInt();
        for(int i = 0; i < 10; i++){
            System.out.println(valor + " x " + i + " = " + (valor*i));
        }ler.close();
        
    }
    
}
