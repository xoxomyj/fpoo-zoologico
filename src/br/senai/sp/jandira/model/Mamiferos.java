package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;

public class Mamiferos extends Animais {

    List<Mamiferos> listMamifero = new ArrayList<>();

    public Mamiferos(String especies) {
        super(especies);
    }

    public void listarMamifero(){
        for (Mamiferos mamifero : listMamifero){
            System.out.println("id: " + mamifero.idAnimais);
            System.out.println("nome " + mamifero.nome);
            System.out.println("idade " + mamifero.idade);
            System.out.println("---------------------");
        }
    }

    public Mamiferos(){
        super ("mamifero");
    }

    public void adicionarMamiferos(Mamiferos mamifero){
        listMamifero.add(mamifero);

    }
}

