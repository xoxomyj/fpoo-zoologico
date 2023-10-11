package br.senai.sp.jandira.model;

import java.util.Scanner;



public class Menu {

    Scanner scanner = new Scanner(System.in);

    Aves refAve = new Aves();
    Mamiferos refMamifero = new Mamiferos();
    Felinos refFelino = new Felinos();

    Alojamento alojamento = new Alojamento();

    public void executarMenu() {

        boolean continuar = true;
        while (continuar) {

            System.out.println("*************** MENU **************** ");
            System.out.println(" 1 - Cadastrar animal                 ");
            System.out.println(" 2 - Listar Animais                   ");
            System.out.println(" 3 - Pesquisar animais                ");
            System.out.println(" 4 - Cadastrar Informações de Saúde   ");
            System.out.println(" 5 - Sair                             ");
            System.out.println("************************************  ");

            System.out.println("Escolha uma opção: ");
            int optionMenu = scanner.nextInt();
            scanner.nextLine();

            switch (optionMenu) {
                case 1:
                    System.out.println("Qual espécie deseja cadastrar?");
                    System.out.println(" 1- Aves");
                    System.out.println(" 2- Felinos");
                    System.out.println(" 3- Mmamiferos");

                    int optionCadastro = scanner.nextInt();
                    scanner.nextInt();

                    switch (optionCadastro) {
                        case 1:
                            Aves ave = new Aves();
                            ave.cadastrarAnimais();
                            refAve.adicionarAves(ave);
                            alojamento.adicionarAveAloj(ave);
                            break;
                        case 2:
                            Felinos felino = new Felinos();
                            felino.cadastrarAnimais();
                            refFelino.adicionarFelinos(felino);
                            alojamento.adicionarFelinoAloj(felino);
                            break;
                        case 3:
                            Mamiferos mamifero = new Mamiferos();
                            mamifero.cadastrarAnimais();
                            refMamifero.adicionarMamiferos(mamifero);
                            alojamento.adicionarMamiferoAloj(mamifero);
                            break;

                int optionLista = scanner.nextInt();
                scanner.nextInt();

                    }

                        default:
                            System.out.println();
                    }

            }
        }
    }
