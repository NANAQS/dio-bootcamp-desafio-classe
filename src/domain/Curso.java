package domain;

public class Curso extends Conteudo {
    String titulo;
    String descricao;
    int cargaHoraria;
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "Mentorias [titulo=" + getTitulo() + ", descricao=" + getDiscricao() + "]";
    }
    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

}
