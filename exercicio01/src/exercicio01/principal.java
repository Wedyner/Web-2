package exercicio01;

public class principal {

    public static void main(String[] args) {
        // a. Instanciar uma pessoa com valores predefinidos
        Exercicio01 pessoa = new Exercicio01("João Silva", 25);
        
        // b. Modificar o nome e a idade com novos valores predefinidos
        pessoa.setNome("Maria Oliveira");  // Modifica o nome
        pessoa.setIdade(30);               // Modifica a idade
              
        System.out.println("Nova idade: " + pessoa.getIdade());
        
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}