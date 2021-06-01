public class java14 {
    
    record ClienteDTO(String nome, String cpf) {}

    public static void main(String[] args) {
        
        // Switch Expressions
        String nome = "Pedro";
        switch (nome) {
            case "Pedro", "Thais", "Vitor" -> System.out.println("Achou o nome: " + nome);
            default -> System.out.println("Não achou nenhum nome");
        }

        // Records
        ClienteDTO cliente1 = new ClienteDTO("Pedro", "123.456.789-10");
        System.out.println(cliente1.cpf());
        
    }

}
