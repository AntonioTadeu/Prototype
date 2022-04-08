package padroescriacao.prototype;

public class UsuarioBanco implements Cloneable {
    private int Senha;
    private String nome;
    private Endereco endereco;
    private String localNascimento;

    public UsuarioBanco(int Senha, String nome, Endereco endereco, String localNascimento) {
        this.senha = senha;
        this.nome = nome;
        this.endereco = endereco;
        this.localNascimento = localNascimento;
    }

    public int getMatricula() {
        return Senha;
    }

    public void setMatricula(int matricula) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    @Override
    public UsuarioBanco clone() throws CloneNotSupportedException {
        UsuarioBanco UsuarioBancoClone = (UsuarioBanco) super.clone();
        UsuarioBancoClone.endereco = (Endereco) UsuarioBancoClone.endereco.clone();
        return alunoClone;
    }

    @Override
    public String toString() {
        return "UsuarioBanco{" +
                "senha=" + senha +
                ", nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", localNascimento='" + localNascimento + '\'' +
                '}';
    }
}
