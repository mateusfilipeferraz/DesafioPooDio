/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Mateus Ferraz
 */
public class Curso {

    private   String titulo;
    private String descrição ;
    private int cargaHoraria;

    public Curso() {
    }

    public Curso(String titulo, String descrição, int cargaHoraria) {
        this.titulo = titulo;
        this.descrição = descrição;
        this.cargaHoraria = cargaHoraria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" + "titulo = " + titulo + ", descri\u00e7\u00e3o = " + descrição + ", cargaHoraria = " + cargaHoraria + '}';
    }

  
}