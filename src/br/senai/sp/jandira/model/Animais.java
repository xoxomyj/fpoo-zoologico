package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Animais {

    String nome, especies, genero;
    int idade, idAnimais;

    Scanner scanner = new Scanner(System.in);

    public Animais (String especies){
        this.especies = especies;
    }

    public Animais() {

    }

    public void cadastrarAnimais(){
        System.out.println("********* CADASTRO D0 ANIMAL *********");
        System.out.println("Insira o nome do animal: ");
        nome = scanner.nextLine();
        System.out.println("Insira o ID do animal: ");
        idAnimais = scanner.nextInt();
        System.out.println("Insira a idade do animal: ");
        idade = scanner.nextInt();
        System.out.println("Insira o gênero do animal: ");
        genero = scanner.nextLine();
        System.out.println("***************************************");

    }
}
