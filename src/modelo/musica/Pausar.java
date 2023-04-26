package modelo.musica;

public class Pausar implements Musica{
    @Override
    public void musica() {
        System.out.println("Pausando a Música");
    }
}