package exercicio01;


public class Exercicio01 {
    // Atributos privados para garantir o encapsulamento
    private String nome;
    private int idade;
    
    // Construtor que recebe nome e idade (obrigatórios)
    public Exercicio01(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    // Métodos getters para acessar os dados
    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    // Métodos setters para modificar os dados
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
}