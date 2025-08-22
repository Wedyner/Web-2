
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    private static List<Exercicio03> tarefas = new ArrayList<>();
    
    public static void main(String[] args) {
        int opcao;
        
        do {
            opcao = exibirMenu();
            
            switch (opcao) {
                case 1:
                    adicionarTarefa();
                    break;
                case 2:
                    removerTarefa();
                    break;
                case 3:
                    listarTarefas();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo do programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (opcao != 4);
    }
    
    // Método para exibir o menu e retornar a opção escolhida
    private static int exibirMenu() {
        String menu = """
            ===== GERENCIADOR DE TAREFAS =====
            1. Adicionar uma tarefa
            2. Remover uma tarefa
            3. Listar todas as tarefas
            4. Sair do programa
            
            Digite a opção desejada:
            """;
        
        try {
            String opcaoStr = JOptionPane.showInputDialog(menu);
            if (opcaoStr == null) {
                return 4; // Se o usuário cancelar, sai do programa
            }
            return Integer.parseInt(opcaoStr);
        } catch (NumberFormatException e) {
            return -1; // Opção inválida
        }
    }
    
    // Método para adicionar uma nova tarefa
    private static void adicionarTarefa() {
        try {
            // Ler código da tarefa
            String codigoStr = JOptionPane.showInputDialog("Digite o código da tarefa:");
            if (codigoStr == null) return; // Usuário cancelou
            
            int codigo = Integer.parseInt(codigoStr);
            
            // Verificar se o código já existe
            if (tarefaExiste(codigo)) {
                JOptionPane.showMessageDialog(null, "Já existe uma tarefa com este código!");
                return;
            }
            
            // Ler título da tarefa
            String titulo = JOptionPane.showInputDialog("Digite o título da tarefa:");
            if (titulo == null || titulo.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Título não pode ser vazio!");
                return;
            }
            
            // Criar e adicionar a nova tarefa
            Exercicio03 novaTarefa = new Exercicio03(codigo, titulo.trim());
            tarefas.add(novaTarefa);
            
            JOptionPane.showMessageDialog(null, "Tarefa adicionada com sucesso!");
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Código deve ser um número inteiro!");
        }
    }
    
    // Método para remover uma tarefa
    private static void removerTarefa() {
        if (tarefas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há tarefas para remover!");
            return;
        }
        
        try {
            // Mostrar tarefas existentes
            listarTarefas();
            
            // Ler código da tarefa a ser removida
            String codigoStr = JOptionPane.showInputDialog("Digite o código da tarefa a ser removida:");
            if (codigoStr == null) return; // Usuário cancelou
            
            int codigo = Integer.parseInt(codigoStr);
            
            // Procurar e remover a tarefa
            boolean removido = false;
            for (int i = 0; i < tarefas.size(); i++) {
                if (tarefas.get(i).getCodigo() == codigo) {
                    tarefas.remove(i);
                    removido = true;
                    break;
                }
            }
            
            if (removido) {
                JOptionPane.showMessageDialog(null, "Tarefa removida com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Tarefa não encontrada!");
            }
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Código deve ser um número inteiro!");
        }
    }
    
    // Método para listar todas as tarefas
    private static void listarTarefas() {
        if (tarefas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há tarefas cadastradas!");
            return;
        }
        
        StringBuilder lista = new StringBuilder("===== LISTA DE TAREFAS =====\n");
        
        for (Exercicio03 tarefa : tarefas) {
            lista.append(tarefa.toString()).append("\n");
        }
        
        JOptionPane.showMessageDialog(null, lista.toString());
    }
    
    // Método auxiliar para verificar se uma tarefa já existe
    private static boolean tarefaExiste(int codigo) {
        for (Exercicio03 tarefa : tarefas) {
            if (tarefa.getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }
}