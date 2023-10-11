package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;

public class Aves extends Animais{

    List<Aves> listAve = new ArrayList<>();

    public Aves(String especies) {
        super(especies);
    }

    public Aves() {
        super();
    }

    public void listarAves(){
        for (Aves ave : listAve){
            System.out.println("id: " + ave.idAnimais);
            System.out.println("nome " + ave.nome);
            System.out.println("idade " + ave.idade);
            System.out.println("---------------------");
        }
    }
    public void adicionarAves(Aves ave){
        listAve.add(ave);

    }
}
