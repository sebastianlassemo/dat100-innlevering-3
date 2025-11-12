package no.hvl.dat100.oppgave4;

import no.hvl.dat100.oppgave3.Blogg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SkrivBlogg {

    public static boolean skriv(Blogg samling, String mappe, String filnavn) {
        boolean skrevet = false;

        try {
            File fil = new File(mappe, filnavn);

            PrintWriter writer = new PrintWriter(fil);

            writer.print(samling.toString());

            writer.close();

            skrevet = true; // alt gikk bra

        } catch (FileNotFoundException e) {
            System.out.println("Feil ved skriving til fil: " + e.getMessage());
            skrevet = false;
        }

        return skrevet;
    }
}

