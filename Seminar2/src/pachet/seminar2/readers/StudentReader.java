package pachet.seminar2.readers;

import ro.cts.pachet.seminar2.Aplicant;
import ro.cts.pachet.seminar2.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends BaseReader{

    public StudentReader(String fileName) {
        super(fileName);
    }

    public List<Aplicant> readAplicanti() throws FileNotFoundException, NumberFormatException {
        Scanner input = new Scanner(new File(super.getFileName()));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            //to do
            Student student=new Student();
            citireAplicant(input, student);

            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();
            student.setFacultate(facultate);
            student.setAn_studii(an_studii);

            //Student s = new Student(nume, prenume, varsta, punctaj, nr, vect, facultate, an_studii);
            studenti.add(student);
        }
        input.close();
        return studenti;
    }
}
