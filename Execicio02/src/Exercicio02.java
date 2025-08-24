public class Exercicio02 {

    private int dia;
    private int mes;
    private int ano;
    
    public Exercicio02(int dia, int mes, int ano) {
        if (validarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Data inválida!");
        }
    }
    
    private boolean validarData(int dia, int mes, int ano) {
        if (ano < 1900) return false;
        if (mes < 1 || mes > 12) return false;
        if (dia < 1 || dia > 30) return false; 
        return true;
    }
    
    public int getDia() {
        return dia;
    }
    
    public int getMes() {
        return mes;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setDia(int dia) {
        if (validarData(dia, this.mes, this.ano)) {
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("Dia inválido!");
        }
    }
    
    public void setMes(int mes) {
        if (validarData(this.dia, mes, this.ano)) {
            this.mes = mes;
        } else {
            throw new IllegalArgumentException("Mês inválido!");
        }
    }
    
    public void setAno(int ano) {
        if (validarData(this.dia, this.mes, ano)) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Ano inválido!");
        }
    }
    
    public void setData(int dia, int mes, int ano) {
        if (validarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Data inválida!");
        }
    }
    
    public String getDataFormatada() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
    
    // Método toString para representação em string
    @Override
    public String toString() {
        return getDataFormatada();
    }
}
