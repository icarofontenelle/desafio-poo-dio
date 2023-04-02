import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Professor professor1 = new Professor();
        professor1.setName("Josevaldo");
        professor1.setLinkedin("Linkedin/Josevaldo");

        Professor professor2 = new Professor();
        professor2.setName("Ramonita");
        professor2.setLinkedin("Linkedin/Ramonita");

        Curso curso1 = new Curso(professor1);
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso(professor2);
        curso2.setTitulo("curso html + css");
        curso2.setDescricao("descrição curso html + css");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJubileu = new Dev();
        devJubileu.setNome("Jubileu");
        devJubileu.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jubileu:" + devJubileu.getConteudosInscritos());
        devJubileu.progredir();
        devJubileu.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jubileu:" + devJubileu.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Jubileu:" + devJubileu.getConteudosConcluidos());
        System.out.println("XP:" + devJubileu.calcularTotalXp());

        System.out.println("-------");

        Dev devMaricota = new Dev();
        devMaricota.setNome("Maricota");
        devMaricota.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Maricota:" + devMaricota.getConteudosInscritos());
        devMaricota.progredir();
        devMaricota.progredir();
        devMaricota.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Maricota:" + devMaricota.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Maricota:" + devMaricota.getConteudosConcluidos());
        System.out.println("XP:" + devMaricota.calcularTotalXp());

    }

}
