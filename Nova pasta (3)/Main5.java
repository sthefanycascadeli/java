import javax.swing.JOptionPane;
public class Main5 {
    public static void main(String[] args) {
        float nota1, nota2, nota3, nota4, calcularMedia;
nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1:"));
nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2:"));
nota3 = Float.parseFloat(JOptionPane.showInputDialog("Nota 3:"));
nota4 = Float.parseFloat(JOptionPane.showInputDialog("Nota 4:"));
calcularMedia = (nota1 + nota2 + nota3 + nota4)/4;
if (calcularMedia > 7){
    JOptionPane.showMessageDialog(null, "Aprovado! Média final: " + calcularMedia,
    "Média", JOptionPane.INFORMATION_MESSAGE);  
} else {
    JOptionPane.showMessageDialog(null, "Reprovado! Média final: " + calcularMedia,
    "Média", JOptionPane.INFORMATION_MESSAGE); 
}


    }      
}