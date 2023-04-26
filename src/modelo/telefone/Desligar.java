package modelo.telefone;

public class Desligar implements Telefone{
    @Override
    public void telefone() {
        System.out.println("Desligando a Chamada");
    }
}
