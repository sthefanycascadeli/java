import javax.swing.JOptionPane;

public class calculadora {

    static void operacaoSoma(float a, float b) {
        JOptionPane.showMessageDialog(null, a + b, "Soma", JOptionPane.INFORMATION_MESSAGE);
    }

    static void operacaoSub(float a, float b) {
        JOptionPane.showMessageDialog(null, a - b, "Subtração", JOptionPane.INFORMATION_MESSAGE);
    }

    static void operacaoMult(float a, float b) {
        JOptionPane.showMessageDialog(null, a * b, "Multiplicação", JOptionPane.INFORMATION_MESSAGE);
    }

    static void operacaoDiv(float a, float b) {
        JOptionPane.showMessageDialog(null, a / b, "Divisão", JOptionPane.INFORMATION_MESSAGE);
    }

    static void calculadoraSimples(String op, float a, float b) {
        if (op.equals("+")) {
            operacaoSoma(a, b);
        }
        if (op.equals("-")) {
            operacaoSub(a, b);
        }
        if (op.equals("*")) {
           operacaoMult(a, b);
        }
        if (op.equals("/")) {
            operacaoDiv(a, b);
        }
    }

    public static void main(String[] args) {
        float valorA, valorB;
        String operadorConta;
        operadorConta = JOptionPane.showInputDialog("Entre com o operador");
        valorA = Float.parseFloat(JOptionPane.showInputDialog("Entre com um número"));
        valorB = Float.parseFloat(JOptionPane.showInputDialog("Entre com um número"));

        calculadoraSimples(operadorConta, valorA, valorB);

    }
}
