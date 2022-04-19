class Main4 {
    String idiomas;
    Main4 (String falado){
        idiomas = falado;
        System.out.println(idiomas + " É falado no mundo");

    }
    public static void main(String[] args){
        Main4 obj1 = new Main4("Alemão");
        Main4 obj2 = new Main4("Inglês");
        Main4 obj3 = new Main4("Português");
        System.out.println(obj1.idiomas);
      
    }

    
}
