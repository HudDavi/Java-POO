package modelo.telefone;

public class Atender implements Telefone{
    @Override
    public void telefone() {
        System.out.println("Atendendo a Chamada");
    }
}
