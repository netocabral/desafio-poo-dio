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

        Desafio desafio = new Desafio("Romano para Inteiro", "Converta de Romano para Inteiro", "java", "facil");

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

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        devCamila.iniciarDesafio(desafio);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Desafios Iniciados Camila:" + devCamila.getDesafiosIniciados());

        devCamila.progredir();
        devCamila.progredir();
        devCamila.completarDesafio(desafio);
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("Desafios Iniciados Camila:" + devCamila.getDesafiosIniciados());
        System.out.println("Desafios Concluídos Camila:" + devCamila.getDesafiosConcluidos());

        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Neto");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Neto:" + devNeto.getConteudosInscritos());
        System.out.println("Desafios Iniciados Neto:" + devNeto.getDesafiosIniciados());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Neto:" + devNeto.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Neto:" + devNeto.getConteudosConcluidos());
        System.out.println("Desafios Iniciados Neto:" + devNeto.getDesafiosIniciados());
        System.out.println("Desafios Concluídos Neto:" + devNeto.getDesafiosConcluidos());

        System.out.println("XP:" + devNeto.calcularTotalXp());

    }

}
