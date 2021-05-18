public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main"); //adicionar breakpoint
        metodo1();
        System.out.println("Fim do main");
    }
    
    private static void metodo1() {
        System.out.println("Ini do metodo1"); //adicionar breakpoint
        metodo2();
        System.out.println("Fim do metodo1");
    }
    
    private static void metodo2() {
        System.out.println("Ini do metodo2"); //adicionar breakpoint
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            int a = i / 0; //insere exceção aritmética
        }
        System.out.println("Fim do metodo2");
    }
}