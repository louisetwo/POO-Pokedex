package POO;

import java.util.Scanner;

public class Main {

    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        Pokedex pokedex = new Pokedex();
        int num;

        do {
            pokedex.mostraMenu();
            System.out.println("Escolha uma opção(1-4): ");
            num = Integer.parseInt (input.nextLine());

            switch (num) {
                case 1:
                    System.out.println("Adicionar Pokemon");
                    pokedex.addPokemon();
                    break;
                case 2:
                    System.out.println("Ver Pokedex");
                    pokedex.verPokedex();
                    break;
                case 3:
                    System.out.println(" Editar Pokemon");
                    pokedex.editarPokemon();
                    break;
                case 4:
                    System.out.println("Deletar Pokemon");
                    boolean sucesso = pokedex.deletarPokemon();
                    if(sucesso){
                        System.out.println("Pokemon deletado");
                    } else {
                        System.out.println("Erro! Pokemon não existe");
                    }
                    break;

            }
        } while (num != 0);
    }
}
