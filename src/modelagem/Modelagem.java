package modelagem;

import modelo.musica.Musica;
import modelo.musica.Parar;
import modelo.musica.Pausar;
import modelo.musica.Selecionar;
import modelo.musica.Tocar;

import modelo.navegador.Navegador;
import modelo.navegador.Abrir;
import modelo.navegador.Adicionar;
import modelo.navegador.Atualizar;
import modelo.navegador.Exibir;
import modelo.navegador.Fechar;

import modelo.telefone.Telefone;
import modelo.telefone.Atender;
import modelo.telefone.Desligar;
import modelo.telefone.Ligar;
import modelo.telefone.Ouvir;

public class Modelagem{
    public static void main(String[] args) throws Exception {
        Musica parar = new Parar();
        Musica pausar = new Pausar();
        Musica selecionar = new Selecionar();
        Musica tocar = new Tocar();

        Navegador abrir = new Abrir();
        Navegador adicionar = new Adicionar();
        Navegador atualizar = new Atualizar();
        Navegador exibir = new Exibir();
        Navegador fechar = new Fechar();

        Telefone atender = new Atender();
        Telefone ligar = new Ligar();
        Telefone ouvir = new Ouvir();
        Telefone desligar = new Desligar();

        selecionar.musica();
        tocar.musica();
        pausar.musica();
        parar.musica();

        abrir.navegador();
        adicionar.navegador();
        exibir.navegador();
        atualizar.navegador();
        fechar.navegador();

        atender.telefone();
        ouvir.telefone();
        ligar.telefone();
        desligar.telefone();
    }
}