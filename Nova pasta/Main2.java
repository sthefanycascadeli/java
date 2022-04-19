class Main2 {
    private String nome;
    //construtor
    Main2() {
        System.out.println("Construtor chamado:");
        nome = "Programa Java";
    }
    public static void main(String[] args) {
        Main2 obj = new Main2();
        System.out.println("Qual contrutor foi chamado?" + obj.nome);

    }
        
    }
    