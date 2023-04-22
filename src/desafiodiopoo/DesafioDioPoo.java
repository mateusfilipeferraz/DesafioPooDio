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
        curso1.setDescricao(" Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao(" Descrição curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso ();
        Mentoria mentoria = new Mentoria();
        

        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }

}
