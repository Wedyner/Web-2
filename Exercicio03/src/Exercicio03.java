
public class Exercicio03 {

    // Atributos privados para garantir o encapsulamento
    private int codigo;
    private String titulo;
    
    // Construtor que recebe código e título (obrigatórios)
    public Exercicio03(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }
    
    // Métodos getters para acessar os dados
    public int getCodigo() {
        return codigo;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    // Métodos setters para modificar os dados
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    // Método para representação em string
    @Override
    public String toString() {
        return "Código: " + codigo + " - Título: " + titulo;
    }
}