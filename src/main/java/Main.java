import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import com.sun.jdi.BooleanType;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("descricao do curso");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JavaScript");
        curso1.setDescricao("descricao do curso");
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descricao da mentoria");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" +devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteudos inscritos" +devCamila.getConteudosInscritos());
        System.out.println("Conteudos concluidos" +devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularXp());


        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" +devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteudos inscritos" +devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos" +devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularXp());
    }
}
