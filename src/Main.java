package src;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {

         Curso curso1 = new Curso();
         curso1.setTitulo("Curso java");
         curso1.setDescricao("descricao curso java");
         curso1.setCargaHoraria(8);

         Curso curso2 = new Curso();
         curso2.setTitulo("Curso js");
         curso2.setDescricao("descricao curso js");
         curso2.setCargaHoraria(8);

         Mentoria mentoria = new Mentoria();
         mentoria.setTitulo("mentoria de java");
         mentoria.setDescricao("descricao mentoria java");
         mentoria.setData(LocalDate.now());

         System.out.println(curso1);
         System.out.println(curso2);
         System.out.println(mentoria);
        
    }
}
