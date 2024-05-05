import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import domain.Bootcamp;
import domain.Curso;
import domain.Dev;
import domain.Mentorias;

public class App {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setCargaHoraria(199);
        curso1.setDescricao("curso basico");
        curso1.setTitulo("Javascript");

        Curso curso2 = new Curso();
        curso2.setCargaHoraria(299);
        curso2.setDescricao("curso basico");
        curso2.setTitulo("PHP");

        Mentorias mentoria1 = new Mentorias();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setData(LocalDate.now());

        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Javali developer");
        bootcamp.setDescricao("curso basico");
        bootcamp.getConteudos().add(mentoria1);

        Dev dev = new Dev();
        dev.setNome("Jao");
        dev.increverBootcamp(bootcamp);
        System.out.println(dev.getConteudosIncritos());
    }
}
