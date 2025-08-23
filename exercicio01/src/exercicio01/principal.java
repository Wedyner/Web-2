package exercicio01;

public class principal {

    public static void main(String[] args) {
       
        Exercicio01 pessoa = new Exercicio01("João Silva", 25);
        
        pessoa.setNome("Maria Oliveira");  
        pessoa.setIdade(30);               
              
        System.out.println("Nova idade: " + pessoa.getIdade());
        
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}
