import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria("mentoria de java", "descricao mentoria java", LocalDate.now());


//        System.out.println(curso1);
//        System.out.println();
//        System.out.println(curso2);
//        System.out.println();
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devWilson = new Dev();
        devWilson.setNome("Wilson");
        devWilson.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila " + devWilson.getConteudosInscritos());
        devWilson.progredir();
        devWilson.progredir();
        devWilson.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Camila " + devWilson.getConteudosInscritos());
        System.out.println();
        System.out.println("Conteudos Concluidos Camila " + devWilson.getConteudosConcluidos());
        System.out.println();
        System.out.println("XP: " + devWilson.calcularTotalXp());

        System.out.println("--------------------------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Joao " + devJoao.getConteudosInscritos());
        System.out.println();
        System.out.println("Conteudos Concluidos Joao " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());




    }
}
