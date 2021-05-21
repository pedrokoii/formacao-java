public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main"); //adicionar breakpoint
        try {
            metodo1();
        } catch(ArithmeticException | NullPointerException ex) {
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
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
            System.out.println(i / 0); //insere exceção aritmética
            //Conta c = null;
            //c.deposita();
        }
        System.out.println("Fim do metodo2");
    }
}