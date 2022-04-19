import javax.swing.JOptionPane;
public class Main3 {
    
    public static  void main(String[] args){
        
        int valorA = Integer.parseInt(JOptionPane.showInputDialog("valor a:"));
        int valorB= Integer.parseInt(JOptionPane.showInputDialog("valor b:"));
        int resultado = valorA + valorB;
        JOptionPane.showMessageDialog(null, "Resultado final: "+resultado,
        "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
