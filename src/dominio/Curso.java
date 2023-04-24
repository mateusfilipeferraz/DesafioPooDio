package dominio;

/**
 *
 * @author Mateus Ferraz
 */
public class Curso extends Conteudos {

    private int cargaHoraria;

    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {

    }

    public Curso(int cargaHoraria) {

        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" + "titulo = " + getTitulo() + ", descri\u00e7\u00e3o = " + getDescricao() + ", cargaHoraria = " + cargaHoraria + '}';
    }

    @Override
    public double caucularxp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
