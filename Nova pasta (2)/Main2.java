import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
       Scanner meuObj = new Scanner(System.in);
       System.out.println("Entre com o valor inicial:");
       int i = meuObj.nextInt();
       int valorFinal = i + 200;
       for(int j = i; j<= valorFinal; j = j+2){
           System.out.println(j);
       }
       meuObj.close();
    }
}