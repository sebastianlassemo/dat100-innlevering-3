package no.hvl.dat100.oppgave1;
public abstract class Innlegg {
    private int id;
    private String bruker;
    private String dato;
    private int likes;

    public Innlegg(int id, String bruker, String dato, int likes) {
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = 0;
    }
    public Innlegg(int id, String bruker, String dato) {
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
    }
    public int getId() {return id;}
    public int getLikes() {return likes;}
    public void setLikes(int likes) {this.likes = likes;}

    public String getBruker() {return bruker;}

    public String getDato() {return dato;}

    public void setId(int id) {this.id = id;}

    public void setBruker(String bruker) {this.bruker = bruker;}

    public void setDato(String dato) {this.dato = dato;}

    public void doLike(){
        likes++;
    }

    public String toString(){
        return id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
    }
    public boolean erLik(Innlegg innlegg){
        if(innlegg.getId()==id){
            return true;
        }else{
            return false;
        }
    }



}
