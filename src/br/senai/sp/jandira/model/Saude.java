package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.util.Scanner;

public class Saude extends Animais{

    String histMedico, medicacoes;
    int data, dataUm, dataDois;

    Scanner scanner = new Scanner(System.in);

    public void registroSaude(){
        System.out.println("********* REGISTRO DA SAUDE *********");
        System.out.println("Insira o histórico médico do animal: ");
        histMedico = scanner.nextLine();
        System.out.println("Insira as medicações pré-escritas do animal: ");
        medicacoes = scanner.nextLine();
        System.out.println("Insira a data da ultima revisâo médica do animal: ");
        data = scanner.nextInt();
    }

    public void revisaoData(){
            LocalDate dataUm = LocalDate.of(2023, 1, 1);
            LocalDate dataDois = LocalDate.of(2023, 12,31);

        if (dataDois.getYear() > 2023) {
            System.out.println("Visita ao Veternário necessária!!!!");

        } else {
            System.out.println("Visitas ao Veterinário em dia!!");
        }

    }



}
