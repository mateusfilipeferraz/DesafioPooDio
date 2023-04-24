package desafiodiopoo;

import dominio.Bootcamp;
import dominio.Conteudos;
import dominio.Curso;
import dominio.Devs;
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

        Conteudos conteudo = new Curso();

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("mentoria java");
        mentoria.setData(LocalDate.now());

        /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer ");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Devs mateus = new Devs();

        mateus.setNome("Mateus");
        System.out.println(mateus.getNome());
        System.out.println("");
        mateus.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + mateus.getConteudosInscritos());
        mateus.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + mateus.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + mateus.getConteudosConcluidos());
        System.out.println("-------------");
        System.out.println("");
        System.out.println("Xp: " + mateus.calcularTotalXp());

        Devs camila = new Devs();

        camila.setNome("Camila");
        System.out.println(camila.getNome());
        System.out.println("");
        camila.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + mateus.getConteudosInscritos());
        camila.progredir();
        camila.progredir();
        camila.progredir();

        System.out.println("-");
        System.out.println("Conteudos Inscritos" + camila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + camila.getConteudosConcluidos());
        System.out.println("Xp: " + camila.calcularTotalXp());
    }

}
