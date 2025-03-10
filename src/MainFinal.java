import java.util.Scanner;

public class MainFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Pokemon Fight Simulator!");
        System.out.println("Get ready for an exciting battle between your favorite Pokemons!");
        System.out.println("-------------------------------------------------------------");

        System.out.print("(Type anything to continue)");
        scanner.nextLine();

        Pokedex.printAllPokemons();


        System.out.print("\nChoose your 1st Pokemon (see list above): ");
        System.out.print("\n(leave empty for random Pokemon)");

        String userPokemonName = scanner.nextLine();
        Pokemon userPokemon1;
        if (userPokemonName.isEmpty()) {
            userPokemon1 = Pokedex.randomPokemon();
        } else {
            userPokemon1 = Pokedex.getPokemon(userPokemonName);
        }
        System.out.println("Your 1st Pokemon is " + userPokemon1.getName() + "\n");
        userPokemon1.describe();


        System.out.print("\nChoose your 2nd Pokemon (leave empty for random Pokemon): ");
        userPokemonName = scanner.nextLine();
        Pokemon userPokemon2;
        if (userPokemonName.isEmpty()) {
            userPokemon2 = Pokedex.randomPokemon();
        } else {
            userPokemon2 = Pokedex.getPokemon(userPokemonName);
        }
        System.out.println("Your 2nd Pokemon is " + userPokemon2.getName() + "\n");
        userPokemon2.describe();
        System.out.println("\n");
        System.out.print("(Type anything to start the fight)\n");
        scanner.nextLine();

        int damage;
        while (true) {
            userPokemon1.attack();
            damage = Damage.getDamage(userPokemon1, userPokemon2);
            userPokemon2.setHp(userPokemon2.getHP() - damage);
            userPokemon2.showHP();
            if (userPokemon2.getHP() == 0) {
                break;
            }

            System.out.println("\n");
            userPokemon2.attack();
            damage = Damage.getDamage(userPokemon2, userPokemon1);
            userPokemon1.setHp(userPokemon1.getHP() - damage);
            userPokemon1.showHP();
            if (userPokemon1.getHP() == 0) {
                break;
            }
            System.out.println("\n");

        }
        System.out.println("----------------- Fight's end -----------------\n");
        // --------- Q9 ---------
        // TODO: Print who the winner is

    }

}