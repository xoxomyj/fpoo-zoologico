package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;

public class Alojamento {

    List<Felinos> alojamentoFelino = new ArrayList<>();

    public void adicionarFelinoAloj (Felinos felino){
        alojamentoFelino.add(felino);
    }

    List<Mamiferos> alojamentoMamifero = new ArrayList<>();

    public void adicionarMamiferoAloj (Mamiferos mamifero){
        alojamentoMamifero.add(mamifero);
    }
    List<Aves> alojamentoAve = new ArrayList<>();

    public void adicionarAveAloj (Aves ave){
        alojamentoAve.add(ave);
    }
}
