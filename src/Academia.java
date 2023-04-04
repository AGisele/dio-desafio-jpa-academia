public class Academia {
    public static void main(String[] args) {
        Cliente novoCliente = new Cliente.ClienteBuilder("Gisele", "Araújo")
                .idade(26)
                .email("gisele@emailexemplo.com")
                .telefone("(99) 99999-9999")
                .endereco("Rua 1, 123")
                .objetivo("Ganhar massa")
                .build();
        System.out.println(novoCliente.toString());

        novoCliente = new Cliente.ClienteBuilder("João", "Araújo")
                .idade(30)
                .email("joao@emailexemplo.com")
                .telefone("(88) 8888-8888")
                .endereco("Rua 7, 7")
                .objetivo("Ganhar massa")
                .build();

        System.out.println(novoCliente.toString());
    }
}
