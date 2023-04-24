package dominio;

/**
 *
 * @author Mateus Ferraz
 */
public abstract class Conteudos {

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double caucularxp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String decricao) {
        this.descricao = decricao;
    }

}
