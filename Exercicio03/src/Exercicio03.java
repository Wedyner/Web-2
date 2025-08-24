
public class Exercicio03 {

    private int codigo;
    private String titulo;
    
    public Exercicio03(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    @Override
    public String toString() {
        return "Código: " + codigo + " - Título: " + titulo;
    }
}
