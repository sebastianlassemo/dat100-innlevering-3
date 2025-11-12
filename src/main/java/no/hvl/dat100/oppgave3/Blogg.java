package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

    private Innlegg[] innleggtabell;
    private int nesteledig;

    // b) konstruktører
    public Blogg() {
        innleggtabell = new Innlegg[20];
        nesteledig = 0;
    }

    public Blogg(int lengde) {
        innleggtabell = new Innlegg[lengde];
        nesteledig = 0;
    }

    // c) antall innlegg
    public int getAntall() {
        return nesteledig;
    }

    // d) returner tabellen
    public Innlegg[] getSamling() {
        return innleggtabell;
    }

    // e) finn innlegg
    public int finnInnlegg(Innlegg innlegg) {
        for (int i = 0; i < nesteledig; i++) {
            if (innleggtabell[i].erLik(innlegg)) {
                return i;
            }
        }
        return -1;
    }

    // f) finnes
    public boolean finnes(Innlegg innlegg) {
        return finnInnlegg(innlegg) != -1;
    }

    // g) ledig plass
    public boolean ledigPlass() {
        return nesteledig < innleggtabell.length;
    }

    // h) legg til
    public boolean leggTil(Innlegg innlegg) {
        if (!finnes(innlegg) && ledigPlass()) {
            innleggtabell[nesteledig] = innlegg;
            nesteledig++;
            return true;
        }
        return false;
    }

    // i) toString
    @Override
    public String toString() {
        String result = nesteledig + "\n";
        for (int i = 0; i < nesteledig; i++) {
            result += innleggtabell[i].toString();
        }
        return result;
    }
}