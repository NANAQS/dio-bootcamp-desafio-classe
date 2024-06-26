package domain;

public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String discricao;

    public abstract double calcularXP();

    public static double getXpPadrao() {
        return XP_PADRAO;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiscricao() {
        return discricao;
    }

    public void setDiscricao(String discricao) {
        this.discricao = discricao;
    }

    
}
