
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        try {

        	Exercicio02 data = new Exercicio02(15, 5, 2023);
            System.out.println("Data inicial: " + data.getDataFormatada());
            
            JOptionPane.showMessageDialog(null, "Vamos modificar a data!");
            
            String diaStr = JOptionPane.showInputDialog("Digite o dia (1-30):");
            int novoDia = Integer.parseInt(diaStr);
            
            String mesStr = JOptionPane.showInputDialog("Digite o mês (1-12):");
            int novoMes = Integer.parseInt(mesStr);
            
            String anoStr = JOptionPane.showInputDialog("Digite o ano (>= 1900):");
            int novoAno = Integer.parseInt(anoStr);
            
            data.setData(novoDia, novoMes, novoAno);
            
            String novaData = data.getDataFormatada();
            JOptionPane.showMessageDialog(null, "Nova data: " + novaData);
            
            System.out.println("Nova data: " + novaData);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Digite apenas números inteiros!");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getMessage());
        }
    }
}
