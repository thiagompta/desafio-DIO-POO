import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso = new Curso();
        curso.setTitulo("Curso de Java");
        curso.setDescricao("Descrição de um curso de java");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Python");
        curso2.setDescricao("Descrição de um curso de Python");
        curso2.setCargaHoraria(4);
        //System.out.println(curso);
        //System.out.println(curso2);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Bootcamp Inter ");
        mentoria.setDescricao("Essa é onde fica a descrição da mentoria");
        mentoria.setData(LocalDate.now());

        //System.out.println(mentoria);
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição em exemplo");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devThiago = new Dev();
        devThiago.setNome("Thiago");
        devThiago.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devThiago.getConteudosInscritos());
        devThiago.progredir();
        devThiago.progredir();
        System.out.println(".");
        System.out.println("Conteudos inscritos Thiago" + devThiago.getConteudosInscritos());
        System.out.println("Conteudos concluidos Thiago" + devThiago.getConteudosConcluidos());
        System.out.println("XP:" +devThiago.calcularTotalXp());

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        Dev devJose = new Dev();
        devJose.setNome("Jose");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devJose.getConteudosInscritos());
        devJose.progredir();
        System.out.println(".");
        System.out.println("Conteudos inscritos" + devJose.getConteudosInscritos());
        System.out.println("Conteudos inscritos de José" + devJose.getConteudosConcluidos());
        System.out.println("XP:" +devJose.calcularTotalXp());


    }
}
