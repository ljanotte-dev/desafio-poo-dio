import br.com.dio.desafil.dominio.Curso;
import br.com.dio.desafil.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curse Java");
        curso1.setDescricao("Bootcamp Java Develop");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curse JavaScript");
        curso2.setDescricao("Bootcamp JavaScritp");
        curso2.setCargaHoraria(6);

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Java Develop");
        mentoria1.setDescricao("Orientação em Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);
    }
}
