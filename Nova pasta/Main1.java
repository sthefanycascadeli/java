import javax.swing.JOptionPane;

public class Main1 {
    static void mensagemResposta(String texto) {
        JOptionPane.showMessageDialog(null, texto, "Validação",
                JOptionPane.INFORMATION_MESSAGE);
    }

    static void tipoTriangulo(int a, int b, int c) {
        if ((a == b) && (a == c) && (b == c)) {
            mensagemResposta("Triângulo Equilátero");
        } else {
            if ((a != b) && (a != c) && (b != c)) {
                mensagemResposta("Triângulo escaleno");
            } else {
                mensagemResposta("Triângulo isósceles");
            }
        }
    }

    static void triangulo(int a, int b, int c) {
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            mensagemResposta("É triângulo");
            tipoTriangulo(a, b, c);
        } else {
            mensagemResposta("Não é triângulo");
        }
    }

    public static void main(String[] args) {
        int ladoA, ladoB, ladoC;
        ladoA = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro lado"));
        ladoB = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo lado"));
        ladoC = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro lado"));
        triangulo(ladoA, ladoB, ladoC);
    }
}