package domain;

public class Curso {
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
        return "Curso [\n\ntitulo= " + titulo + ", \ndescricao= " + descricao + ", \ncargaHoraria= " + cargaHoraria + "\n\n]";
    }

}
