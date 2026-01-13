import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso = new Curso();
        curso.setTitulo("Desafio Bootcamp Java");
        curso.setDescricao("Descrição do Bootcamp");
        curso.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Ex Bootcamp Java");
        curso2.setDescricao("Descrição do ex. 2");
        curso2.setCargaHoraria(4);
        System.out.println(curso);
        System.out.println(curso2);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria do Bootcamp java ");
        mentoria.setDescricao("Essa é onde fica a descrição da mentoria");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);


    }
}
