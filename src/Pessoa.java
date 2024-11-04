import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private LocalDate dataCadastro;
    private Double salario;

    public Pessoa() {

    }

    public Pessoa(String nome, String sobrenome, LocalDate dataNascimento, LocalDate dataCadastro, Double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.dataCadastro = dataCadastro;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobenome() {
        return sobrenome;
    }

    public void setSobenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void imprimirPessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Salario: " + salario);
        System.out.println("Data Nascimento: " + dataNascimento);
        System.out.println("Data Cadastro: " + dataCadastro);
        System.out.println("------------------------------");
    }
    
    
}
