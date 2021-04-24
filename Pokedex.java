package POO;

/* Descrição: mini Pokedex */

import java.util.ArrayList;
import java.util.Scanner;

public class Pokedex {
    private ArrayList<Pokemon> pokemons = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public Pokedex() {}

    public static void mostraMenu() {
        System.out.flush();
        System.out.println("|----------   _| |   ___ | | _____ _ __ ___   ___  _ __  \n" +
                " | '_ \\ / _ \\| |/ / _ \\ '_ ` _ \\ / _ \\| '_ \\ \n" +
                " | |_) | (_) |   <  __/ | | | | | (_) | | | |\n" +
                " | .__/ \\___/|_|\\_\\___|_| |_| |_|\\___/|_| |_|\n" +
                " |_|                                                     ----------|");
        System.out.println("|                      MENU                             |");
        System.out.println("|                                                       |");
        System.out.println("|            1- Adicionar Pokemon                       |");
        System.out.println("|            2- Pokedex                                 |");
        System.out.println("|            3- Editar Pokemon                          |");
        System.out.println("|            4- Deletar Pokemon                         |");
        System.out.println("|            0- Sair                                    |");
        System.out.println("|---------------------------                          --|");
    }

    private void sortPokedex() {
        // ordem crescente  (>) Ordem decrescente (<)
        pokemons.sort((a,b) -> {  //bubblesort
            if (a.getPokenumber() > b.getPokenumber()) return 1;
            else return -1;
        });
    }


    public void addPokemon() {
        String nome;
        String tipo;
        String habilidade;
        int Pokenumber = 0;
        System.out.println("Nome do Pokemon: ");
        nome = input.nextLine();
        System.out.println("Pokenumber: ");
        Pokenumber = Integer.parseInt(input.nextLine());
        System.out.println("Habilidade: ");
        habilidade = input.nextLine();
        System.out.println("Tipo: ");
        tipo = input.nextLine();
        Pokemon newPokemon = new Pokemon(nome, Pokenumber, habilidade, tipo);
        pokemons.add(newPokemon);

    }


    public void verPokedex() {
        // for each com função anônima  - for(pokemons) função {}
        // https://www.geeksforgeeks.org/arraylist-foreach-method-in-java/
        this.sortPokedex();           // Ordena a pokedex antes de mostrar
        pokemons.forEach((pokemon) -> {
            System.out.println("Nome:" + pokemon.getNome() + "\n" + "Pokenumber:" + pokemon.getPokenumber() + "\n" + "Habilidade:" + pokemon.getHabilidade() + "\n" + "Tipo: " + pokemon.getTipo() + "\n");
        });
    }

    public void editarPokemon() {
        String nomeParaAtualizar = input.nextLine();     // nó
        pokemons.forEach((pokemon) -> {
            if (pokemon != null) {
                if (pokemon.getNome().equals(nomeParaAtualizar)) {
                    System.out.println("Novo Nome: ");
                    String nome = input.nextLine();

                    System.out.println("Novo Pokenumber: ");
                    int Pokenumber = Integer.parseInt(input.nextLine());

                    System.out.println("Nova habilidade: ");
                    String habilidade = input.nextLine();

                    System.out.println("Nova Tipo: ");
                    String tipo = input.nextLine();

                    pokemon.setNome(nome);
                    pokemon.setPokenumber(Pokenumber);
                    pokemon.setHabilidade(habilidade);
                    pokemon.setTipo(tipo);
                }
            }
        });
    }

    public boolean deletarPokemon(){
        String nomeParaDeletar = input.nextLine();    // nó
        // https://www.geeksforgeeks.org/arraylist-removeif-method-in-java/
        boolean hasRemoved = pokemons.removeIf((pokemon) -> pokemon.getNome().equals(nomeParaDeletar));
        return hasRemoved;
    }
}

