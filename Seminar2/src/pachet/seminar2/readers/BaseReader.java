package pachet.seminar2.readers;

import ro.cts.pachet.seminar2.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class BaseReader {
    protected String fileName;

    public BaseReader(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;

    protected void citireAplicant(Scanner input2, Aplicant aplicant){
        String nume = input2.next();
        String prenume = input2.next();
        int varsta = input2.nextInt();
        int punctaj = input2.nextInt();
        int nr = input2.nextInt();
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = input2.next();
        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setNr_proiecte(nr, vect);
    }
}
