package dominio;

import java.time.LocalDate;

/**
 *
 * @author Mateus Ferraz
 */
public class Mentoria extends Conteudos {

    LocalDate data;

    public double calcularxp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public Mentoria(LocalDate data) {

        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Curso{" + "titulo = " + getTitulo() + ", descri\u00e7\u00e3o = " + getDescricao() + "data=" + data + '}';

    }

    @Override
    public double caucularxp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
