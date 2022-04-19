public class Main3 {
    private String nome;
    int x, y, z;
    //construdor
    Main3() {
        System.out.println("Construtor chamado:");
        nome = "Programa Java";
        x = 5;
        y = 6;
        z = x+y;
    }
    
    public static void main(String[] args) {
        Main3 obj = new Main3();
        System.out.println("Qual construtor foi chamado? " + obj.nome);
        System.out.println(obj.z);
    }

}
