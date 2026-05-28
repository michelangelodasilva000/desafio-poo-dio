package src;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {

         Curso curso1 = new Curso();
         curso1.setTitulo("Curso java");
         curso1.setDescricao("descrição curso java");
         curso1.setCargaHoraria(8);

         Curso curso2 = new Curso();
         curso2.setTitulo("Curso js");
         curso2.setDescricao("descrição curso js");
         curso2.setCargaHoraria(4);

         Mentoria mentoria = new Mentoria();
         mentoria.setTitulo("mentoria de java");
         mentoria.setDescricao("descrição mentoria java");
         mentoria.setData(LocalDate.now());

         /*System.out.println(curso1);
         System.out.println(curso2);
         System.out.println(mentoria);*/

         BootCamp bootcamp = new BootCamp();
         bootcamp.setNome("Bootcamp java Developer");
         bootcamp.setDescricao("Descrição Bootcamp java Developer");
         bootcamp.getConteudos().add(curso1);
         bootcamp.getConteudos().add(curso2);
         bootcamp.getConteudos().add(mentoria);

         Dev devCamila = new Dev();
         devCamila.setNome("Camila");
         devCamila.inscreverBootcamp(bootcamp);
         System.out.println("Conteudo Inscritos Camila: " + devCamila.getConteudosInscritos());
         devCamila.progredir();
         System.out.println("Conteudo Inscritos Camila: " + devCamila.getConteudosInscritos());
         System.out.println("Conteudo Concluidos Camila: " + devCamila.getConteudosConcluidos());
         System.out.println("XP: " + devCamila.calcularTotalXp());

         System.out.println("-----------------");

         Dev devJoao = new Dev();
         devJoao.setNome("João");
         devJoao.inscreverBootcamp(bootcamp);
         System.out.println("Conteudo Inscritos João: " + devJoao.getConteudosInscritos());
         devJoao.progredir();
         System.out.println("Conteudo Inscritos João: " + devJoao.getConteudosInscritos());
         System.out.println("Conteudo Concluidos João: " + devJoao.getConteudosConcluidos());
         System.out.println("XP: " + devJoao.calcularTotalXp());
        
    }
}
