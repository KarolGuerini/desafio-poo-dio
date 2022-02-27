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

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria de java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("mentoria de javascript");
        mentoria2.setDescricao("descrição mentoria de javascript");
        mentoria2.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);


        Dev devKarol = new Dev();
        devKarol.setNome("Karol");
        String karol = devKarol.getNome();
        devKarol.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Karol: " + devKarol.getConteudosInscritos());
        devKarol.progredir();
        devKarol.progredir();
        devKarol.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Karol: " + devKarol.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Karol: " + devKarol.getConteudosConcluidos());
        System.out.println("XP: " + devKarol.calcularTotalXP());
        System.out.println("");

        System.out.println("############################################################");
        System.out.println("");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        String maria = devMaria.getNome();
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Maria: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Maria: " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXP());
        System.out.println("");


        System.out.println("DEVS INSCRITOS: " + maria + "," + karol);

    }
}
