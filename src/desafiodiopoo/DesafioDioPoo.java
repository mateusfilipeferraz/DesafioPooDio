package desafiodiopoo;

import dominio.Curso;
import dominio.Mentoria;
import java.time.LocalDate;

/**
 *
 * @author Mateus Ferraz
 */
public class DesafioDioPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescrição(" Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescrição(" Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoria java");
        mentoria.setDescrição("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }

}
