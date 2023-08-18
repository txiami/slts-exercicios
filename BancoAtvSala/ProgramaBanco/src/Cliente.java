class Cliente {
    String cpf;
    String nome;
    String endereco;
    String anoNascimento;

    public Cliente() {
    }

    public void Cadastro(String cpf, String nome, String endereco, String anoNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.anoNascimento = anoNascimento;
    }

    public void setCpf(String cpf) {this.cpf = cpf;}

    public void setNome(String nome) {this.nome = nome;}

    public void setEndereco(String endereco) { this.endereco = endereco;}

    public void setAnoNascimento(String anoNascimento) {this.anoNascimento = anoNascimento;}
}
