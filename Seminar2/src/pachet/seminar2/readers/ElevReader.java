package pachet.seminar2.readers;

import ro.cts.pachet.seminar2.Aplicant;
import ro.cts.pachet.seminar2.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends BaseReader{

    public ElevReader(String fileName) {
        super(fileName);
    }

    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(super.getFileName()));
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
           //to do
            int clasa = input2.nextInt();
            String tutore = input2.next();
            Elev e = new Elev(nume, prenume, varsta, punctaj, nr, vect, clasa, tutore);
            elevi.add(e);
        }

        input2.close();
        return elevi;
    }
}
