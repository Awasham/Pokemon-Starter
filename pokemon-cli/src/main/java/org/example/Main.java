package org.example;

import org.example.model.Pokemon;
import org.example.model.PokemonDetail;
import org.example.service.PokemonService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    private static PokemonService service = new PokemonService();

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        List<Pokemon> pokemon = new ArrayList<>();

        do {
            System.out.println("Welcome To Pokemon. Gotta Catch em All!");
            System.out.println("1. Catch first 20 Pokemon");
            System.out.println("2. Catch 20 more Pokemon");
            System.out.println("3. Catch 20 more Pokemon");
            System.out.println("4. Leave Game");
            System.out.println("What will you do?");
            int choice = Integer.parseInt(input.nextLine());
            if (choice == 4) {
                break;
            }
            switch (choice){
                case 1: // if (choice == 1)
                    pokemon = service.getMorePokemon(0);
                    System.out.println(pokemon);
                    break;
                case 2:
                    pokemon = service.getMorePokemon(20);
                    System.out.println(pokemon);
                    break;
                case 3:
                    pokemon = service.getMorePokemon(40);
                    System.out.println(pokemon);
                    break;
            }
            getPokemonDetail(pokemon);

        } while (true);
    }

    public static void getPokemonDetail(List<Pokemon> pokemons){
        System.out.println("Choose pokemon: ");
        for(Pokemon p: pokemons){
            System.out.println(p.getId() + "   " + p.getName());
        }
        System.out.print("Enter choice: ");
        int id = Integer.parseInt(input.nextLine());
        PokemonDetail detail = service.getPokemonDetailById(id);
        System.out.println(detail);
    }

}
