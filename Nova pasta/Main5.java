class Main5 {
    int a;
    boolean b;

    private Main5() {
        a = 0;
        b = false;
    }
    public static void main(String[] args) {
        Main5 obj = new Main5();
        System.out.println("Valores padrão:");
        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);
       
    }
    
}
