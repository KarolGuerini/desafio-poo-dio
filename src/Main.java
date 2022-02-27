import me.dio.web.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("descrição curso javascript");
        curso2.setCargaHoraria(10);

        Conteudo conteudo = new Curso(); //polimorfismo
        Conteudo conteudo1 = new Mentoria();


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria de java");
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

        Dev devKarol = new Dev();
        devKarol.setNome("Karol");
        devKarol.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Karol: " + devKarol.getConteudosInscritos());
        devKarol.progredir();
        devKarol.progredir();
        devKarol.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Karol: " + devKarol.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Karol: " + devKarol.getConteudosConcluidos());
        System.out.println("XP: " + devKarol.calcularTotalXP());

        System.out.println("----------------------------------------------------------------------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Maria: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Maria: " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXP());




    }
}
