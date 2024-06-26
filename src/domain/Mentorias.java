package domain;
import java.time.LocalDate;

public class Mentorias extends Conteudo {
    private LocalDate data;

    
    @Override
    public String toString() {
        return "Mentorias [titulo=" + getTitulo() + ", descricao=" + getDiscricao() + ", data=" + data + "]";
    }
    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

}
