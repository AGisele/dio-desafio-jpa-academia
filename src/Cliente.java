public class Cliente {
    private final String nome;
    private final String sobrenome;
    private final int idade;
    private final String email;
    private final String telefone;
    private final String endereco;
    private final String objetivo;

    private Cliente(ClienteBuilder builder) {
        this.nome = builder.nome;
        this.sobrenome = builder.sobrenome;
        this.idade = builder.idade;
        this.email = builder.email;
        this.telefone = builder.telefone;
        this.endereco = builder.endereco;
        this.objetivo = builder.objetivo;
    }

    public static class ClienteBuilder {
        private final String nome;
        private final String sobrenome;
        private int idade;
        private String email;
        private String telefone;
        private String endereco;
        private String objetivo;

        public ClienteBuilder(String nome, String sobrenome) {
            this.nome = nome;
            this.sobrenome = sobrenome;
        }

        public ClienteBuilder idade(int idade) {
            this.idade = idade;
            return this;
        }

        public ClienteBuilder email(String email) {
            this.email = email;
            return this;
        }

        public ClienteBuilder telefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        public ClienteBuilder endereco(String endereco) {
            this.endereco = endereco;
            return this;
        }

        public ClienteBuilder objetivo(String objetivo) {
            this.objetivo = objetivo;
            return this;
        }

        public Cliente build() {
            return new Cliente(this);
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                ", objetivo='" + objetivo + '\'' +
                '}';
    }
}
