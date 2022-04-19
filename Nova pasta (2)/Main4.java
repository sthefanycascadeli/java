import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        Scanner meuObj = new Scanner(System.in);
        int quantidadeNotas;
        System.out.println("Entre com a quantidade de notas:");
        quantidadeNotas = meuObj.nextInt();
        double[] notas = new double[quantidadeNotas];
        for(int i = 0; i< quantidadeNotas; i++){
            System.out.println("Entre com a nota");
            notas[i] = meuObj.nextDouble();
        }
        double total = 0;
        for(int j = 0; j< notas.length; j++){
            total = total + notas[j];
        }
        total = total/quantidadeNotas;
        System.out.println("A média será:"+ total);
        meuObj.close();
     
    }
}
    
