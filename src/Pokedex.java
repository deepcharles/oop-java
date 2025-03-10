import java.util.Random;

public class Pokedex {
    final static String[] allNames = {"Abra", "Aerodactyl", "Alakazam", "Arbok", "Arcanine", "Articuno", "Beedrill", "Bellsprout", "Blastoise", "Bulbasaur", "Butterfree", "Caterpie", "Chansey", "Charizard", "Charmander", "Charmeleon", "Cloyster", "Cubone", "Dewgong", "Diglett", "Ditto", "Dodrio", "Doduo", "Drowzee", "Dugtrio", "Eevee", "Ekans", "Electabuzz", "Electrode", "Exeggcute", "Exeggutor", "Farfetchd", "Fearow", "Flareon", "Gastly", "Gengar", "Geodude", "Gloom", "Golbat", "Goldeen", "Golduck", "Golem", "Graveler", "Grimer", "Growlithe", "Gyarados", "Haunter", "Hitmonchan", "Hitmonlee", "Horsea", "Hypno", "Ivysaur", "Jigglypuff", "Jolteon", "Jynx", "Kabuto", "Kabutops", "Kadabra", "Kakuna", "Kangaskhan", "Kingler", "Koffing", "Krabby", "Lapras", "Lickitung", "Machamp", "Machoke", "Machop", "Magikarp", "Magmar", "Magnemite", "Magneton", "Mankey", "Marowak", "Meowth", "Metapod", "Mew", "Mewtwo", "Moltres", "MrMime", "Muk", "Nidoking", "Nidoqueen", "NidoranF", "NidoranM", "Nidorina", "Nidorino", "Ninetales", "Oddish", "Omanyte", "Omastar", "Onix", "Paras", "Parasect", "Persian", "Pidgeot", "Pidgeotto", "Pidgey", "Pikachu", "Pinsir", "Poliwag", "Poliwhirl", "Poliwrath", "Ponyta", "Porygon", "Primeape", "Psyduck", "Raichu", "Rapidash", "Raticate", "Rattata", "Rhydon", "Rhyhorn", "Sandshrew", "Sandslash", "Scyther", "Seadra", "Seaking", "Seel", "Shellder", "Slowbro", "Slowpoke", "Snorlax", "Spearow", "Squirtle", "Starmie", "Staryu", "Tangela", "Tauros", "Tentacool", "Tentacruel", "Vaporeon", "Venomoth", "Venonat", "Venusaur", "Victreebel", "Vileplume", "Voltorb", "Vulpix", "Wartortle", "Weedle", "Weepinbell", "Weezing", "Wigglytuff", "Zapdos", "Zubat"};

    static PokemonFinal randomPokemon(){
        Random random = new Random();
        String name = allNames[random.nextInt(allNames.length)];
        return getPokemon(name);
    }
    static void printAllPokemons() {
        System.out.println("""
                Here is the list of available Pokemons:\
                
                Abra (Psychic)\
                
                Aerodactyl (Rock)\
                
                Alakazam (Psychic)\
                
                Arbok (Poison)\
                
                Arcanine (Fire)\
                
                Articuno (Ice)\
                
                Beedrill (Bug)\
                
                Bellsprout (Grass)\
                
                Blastoise (Water)\
                
                Bulbasaur (Grass)\
                
                Butterfree (Bug)\
                
                Caterpie (Bug)\
                
                Chansey (Normal)\
                
                Charizard (Fire)\
                
                Charmander (Fire)\
                
                Charmeleon (Fire)\
                
                Cloyster (Water)\
                
                Cubone (Ground)\
                
                Dewgong (Water)\
                
                Diglett (Ground)\
                
                Ditto (Normal)\
                
                Dodrio (Normal)\
                
                Doduo (Normal)\
                
                Drowzee (Psychic)\
                
                Dugtrio (Ground)\
                
                Eevee (Normal)\
                
                Ekans (Poison)\
                
                Electabuzz (Electric)\
                
                Electrode (Electric)\
                
                Exeggcute (Grass)\
                
                Exeggutor (Grass)\
                
                Farfetchd (Normal)\
                
                Fearow (Normal)\
                
                Flareon (Fire)\
                
                Gastly (Ghost)\
                
                Gengar (Ghost)\
                
                Geodude (Rock)\
                
                Gloom (Grass)\
                
                Golbat (Poison)\
                
                Goldeen (Water)\
                
                Golduck (Water)\
                
                Golem (Rock)\
                
                Graveler (Rock)\
                
                Grimer (Poison)\
                
                Growlithe (Fire)\
                
                Gyarados (Water)\
                
                Haunter (Ghost)\
                
                Hitmonchan (Fighting)\
                
                Hitmonlee (Fighting)\
                
                Horsea (Water)\
                
                Hypno (Psychic)\
                
                Ivysaur (Grass)\
                
                Jigglypuff (Normal)\
                
                Jolteon (Electric)\
                
                Jynx (Ice)\
                
                Kabuto (Rock)\
                
                Kabutops (Rock)\
                
                Kadabra (Psychic)\
                
                Kakuna (Bug)\
                
                Kangaskhan (Normal)\
                
                Kingler (Water)\
                
                Koffing (Poison)\
                
                Krabby (Water)\
                
                Lapras (Water)\
                
                Lickitung (Normal)\
                
                Machamp (Fighting)\
                
                Machoke (Fighting)\
                
                Machop (Fighting)\
                
                Magikarp (Water)\
                
                Magmar (Fire)\
                
                Magnemite (Electric)\
                
                Magneton (Electric)\
                
                Mankey (Fighting)\
                
                Marowak (Ground)\
                
                Meowth (Normal)\
                
                Metapod (Bug)\
                
                Mew (Psychic)\
                
                Mewtwo (Psychic)\
                
                Moltres (Fire)\
                
                MrMime (Psychic)\
                
                Muk (Poison)\
                
                Nidoking (Poison)\
                
                Nidoqueen (Poison)\
                
                NidoranF (Poison)\
                
                NidoranM (Poison)\
                
                Nidorina (Poison)\
                
                Nidorino (Poison)\
                
                Ninetales (Fire)\
                
                Oddish (Grass)\
                
                Omanyte (Rock)\
                
                Omastar (Rock)\
                
                Onix (Rock)\
                
                Paras (Bug)\
                
                Parasect (Bug)\
                
                Persian (Normal)\
                
                Pidgeot (Normal)\
                
                Pidgeotto (Normal)\
                
                Pidgey (Normal)\
                
                Pikachu (Electric)\
                
                Pinsir (Bug)\
                
                Poliwag (Water)\
                
                Poliwhirl (Water)\
                
                Poliwrath (Water)\
                
                Ponyta (Fire)\
                
                Porygon (Normal)\
                
                Primeape (Fighting)\
                
                Psyduck (Water)\
                
                Raichu (Electric)\
                
                Rapidash (Fire)\
                
                Raticate (Normal)\
                
                Rattata (Normal)\
                
                Rhydon (Ground)\
                
                Rhyhorn (Ground)\
                
                Sandshrew (Ground)\
                
                Sandslash (Ground)\
                
                Scyther (Bug)\
                
                Seadra (Water)\
                
                Seaking (Water)\
                
                Seel (Water)\
                
                Shellder (Water)\
                
                Slowbro (Water)\
                
                Slowpoke (Water)\
                
                Snorlax (Normal)\
                
                Spearow (Normal)\
                
                Squirtle (Water)\
                
                Starmie (Water)\
                
                Staryu (Water)\
                
                Tangela (Grass)\
                
                Tauros (Normal)\
                
                Tentacool (Water)\
                
                Tentacruel (Water)\
                
                Vaporeon (Water)\
                
                Venomoth (Bug)\
                
                Venonat (Bug)\
                
                Venusaur (Grass)\
                
                Victreebel (Grass)\
                
                Vileplume (Grass)\
                
                Voltorb (Electric)\
                
                Vulpix (Fire)\
                
                Wartortle (Water)\
                
                Weedle (Bug)\
                
                Weepinbell (Grass)\
                
                Weezing (Poison)\
                
                Wigglytuff (Normal)\
                
                Zapdos (Electric)\
                
                Zubat (Poison)""");
    }

    static PokemonFinal getPokemon(String name) {
        return switch (name) {
            case "Abra" -> new PokemonFinal("Abra", "Psychic", "Psybeam", 65, 25, 20, 15);
            case "Aerodactyl" -> new PokemonFinal("Aerodactyl", "Rock", "Rock Throw", 50, 80, 105, 65);
            case "Alakazam" -> new PokemonFinal("Alakazam", "Psychic", "Psychic", 90, 55, 50, 45);
            case "Arbok" -> new PokemonFinal("Arbok", "Poison", "Sludge", 65, 60, 95, 69);
            case "Arcanine" -> new PokemonFinal("Arcanine", "Fire", "Ember", 40, 90, 110, 80);
            case "Articuno" -> new PokemonFinal("Articuno", "Ice", "Aurora Beam", 65, 90, 85, 100);
            case "Beedrill" -> new PokemonFinal("Beedrill", "Bug", "Pin Missile", 25, 65, 90, 40);
            case "Bellsprout" -> new PokemonFinal("Bellsprout", "Grass", "Solar Beam", 120, 50, 75, 35);
            case "Blastoise" -> new PokemonFinal("Blastoise", "Water", "Bubble Beam", 65, 79, 83, 100);
            case "Bulbasaur" -> new PokemonFinal("Bulbasaur", "Grass", "Petal Dance", 120, 45, 49, 49);
            case "Butterfree" -> new PokemonFinal("Butterfree", "Bug", "Twineedle", 25, 60, 45, 50);
            case "Caterpie" -> new PokemonFinal("Caterpie", "Bug", "Leech Life", 80, 45, 30, 35);
            case "Chansey" -> new PokemonFinal("Chansey", "Normal", "Swift", 60, 250, 5, 5);
            case "Charizard" -> new PokemonFinal("Charizard", "Fire", "Fire Blast", 110, 78, 84, 78);
            case "Charmander" -> new PokemonFinal("Charmander", "Fire", "Ember", 40, 39, 52, 43);
            case "Charmeleon" -> new PokemonFinal("Charmeleon", "Fire", "Fire Punch", 75, 58, 64, 58);
            case "Cloyster" -> new PokemonFinal("Cloyster", "Water", "Surf", 90, 50, 95, 180);
            case "Cubone" -> new PokemonFinal("Cubone", "Ground", "Earthquake", 100, 50, 50, 95);
            case "Dewgong" -> new PokemonFinal("Dewgong", "Water", "Hydro Pump", 110, 90, 70, 80);
            case "Diglett" -> new PokemonFinal("Diglett", "Ground", "Dig", 80, 10, 55, 25);
            case "Ditto" -> new PokemonFinal("Ditto", "Normal", "Scratch", 40, 48, 48, 48);
            case "Dodrio" -> new PokemonFinal("Dodrio", "Normal", "Scratch", 40, 60, 110, 70);
            case "Doduo" -> new PokemonFinal("Doduo", "Normal", "Slash", 70, 35, 85, 45);
            case "Drowzee" -> new PokemonFinal("Drowzee", "Psychic", "Dream Eater", 100, 60, 48, 45);
            case "Dugtrio" -> new PokemonFinal("Dugtrio", "Ground", "Dig", 80, 35, 100, 50);
            case "Eevee" -> new PokemonFinal("Eevee", "Normal", "Tri Attack", 80, 55, 55, 50);
            case "Ekans" -> new PokemonFinal("Ekans", "Poison", "Smog", 30, 35, 60, 44);
            case "Electabuzz" -> new PokemonFinal("Electabuzz", "Electric", "Thunder Punch", 75, 65, 83, 57);
            case "Electrode" -> new PokemonFinal("Electrode", "Electric", "Thunder", 110, 60, 50, 70);
            case "Exeggcute" -> new PokemonFinal("Exeggcute", "Grass", "Petal Dance", 120, 60, 40, 80);
            case "Exeggutor" -> new PokemonFinal("Exeggutor", "Grass", "Absorb", 20, 95, 95, 85);
            case "Farfetchd" -> new PokemonFinal("Farfetchd", "Normal", "Hyper Fang", 80, 52, 90, 55);
            case "Fearow" -> new PokemonFinal("Fearow", "Normal", "Swift", 60, 65, 90, 65);
            case "Flareon" -> new PokemonFinal("Flareon", "Fire", "Ember", 40, 65, 130, 60);
            case "Gastly" -> new PokemonFinal("Gastly", "Ghost", "Lick", 30, 30, 35, 30);
            case "Gengar" -> new PokemonFinal("Gengar", "Ghost", "Lick", 30, 60, 65, 60);
            case "Geodude" -> new PokemonFinal("Geodude", "Rock", "Rock Throw", 50, 40, 80, 100);
            case "Gloom" -> new PokemonFinal("Gloom", "Grass", "Petal Dance", 120, 60, 65, 70);
            case "Golbat" -> new PokemonFinal("Golbat", "Poison", "Acid", 40, 75, 80, 70);
            case "Goldeen" -> new PokemonFinal("Goldeen", "Water", "Surf", 90, 45, 67, 60);
            case "Golduck" -> new PokemonFinal("Golduck", "Water", "Surf", 90, 80, 82, 78);
            case "Golem" -> new PokemonFinal("Golem", "Rock", "Rock Throw", 50, 80, 120, 130);
            case "Graveler" -> new PokemonFinal("Graveler", "Rock", "Rock Throw", 50, 55, 95, 115);
            case "Grimer" -> new PokemonFinal("Grimer", "Poison", "Sludge", 65, 80, 80, 50);
            case "Growlithe" -> new PokemonFinal("Growlithe", "Fire", "Fire Punch", 75, 55, 70, 45);
            case "Gyarados" -> new PokemonFinal("Gyarados", "Water", "Clamp", 35, 95, 125, 79);
            case "Haunter" -> new PokemonFinal("Haunter", "Ghost", "Lick", 30, 45, 50, 45);
            case "Hitmonchan" -> new PokemonFinal("Hitmonchan", "Fighting", "Submission", 80, 50, 105, 79);
            case "Hitmonlee" -> new PokemonFinal("Hitmonlee", "Fighting", "Submission", 80, 50, 120, 53);
            case "Horsea" -> new PokemonFinal("Horsea", "Water", "Clamp", 35, 30, 40, 70);
            case "Hypno" -> new PokemonFinal("Hypno", "Psychic", "Psybeam", 65, 85, 73, 70);
            case "Ivysaur" -> new PokemonFinal("Ivysaur", "Grass", "Vine Whip", 45, 60, 62, 63);
            case "Jigglypuff" -> new PokemonFinal("Jigglypuff", "Normal", "Hyper Beam", 150, 115, 45, 20);
            case "Jolteon" -> new PokemonFinal("Jolteon", "Electric", "Thunderbolt", 90, 65, 65, 60);
            case "Jynx" -> new PokemonFinal("Jynx", "Ice", "Blizzard", 110, 65, 50, 35);
            case "Kabuto" -> new PokemonFinal("Kabuto", "Rock", "Rock Throw", 50, 30, 80, 90);
            case "Kabutops" -> new PokemonFinal("Kabutops", "Rock", "Rock Slide", 75, 60, 115, 105);
            case "Kadabra" -> new PokemonFinal("Kadabra", "Psychic", "Confusion", 50, 40, 35, 30);
            case "Kakuna" -> new PokemonFinal("Kakuna", "Bug", "Leech Life", 80, 45, 25, 50);
            case "Kangaskhan" -> new PokemonFinal("Kangaskhan", "Normal", "Quick Attack", 40, 105, 95, 80);
            case "Kingler" -> new PokemonFinal("Kingler", "Water", "Crabhammer", 100, 55, 130, 115);
            case "Koffing" -> new PokemonFinal("Koffing", "Poison", "Sludge", 65, 40, 65, 95);
            case "Krabby" -> new PokemonFinal("Krabby", "Water", "Hydro Pump", 110, 30, 105, 90);
            case "Lapras" -> new PokemonFinal("Lapras", "Water", "Surf", 90, 130, 85, 80);
            case "Lickitung" -> new PokemonFinal("Lickitung", "Normal", "Bind", 15, 90, 55, 75);
            case "Machamp" -> new PokemonFinal("Machamp", "Fighting", "Karate Chop", 50, 90, 130, 80);
            case "Machoke" -> new PokemonFinal("Machoke", "Fighting", "Karate Chop", 50, 80, 100, 70);
            case "Machop" -> new PokemonFinal("Machop", "Fighting", "Submission", 80, 70, 80, 50);
            case "Magikarp" -> new PokemonFinal("Magikarp", "Water", "Surf", 90, 20, 10, 55);
            case "Magmar" -> new PokemonFinal("Magmar", "Fire", "Fire Punch", 75, 65, 95, 57);
            case "Magnemite" -> new PokemonFinal("Magnemite", "Electric", "Thunder Punch", 75, 25, 35, 70);
            case "Magneton" -> new PokemonFinal("Magneton", "Electric", "Thunder Punch", 75, 50, 60, 95);
            case "Mankey" -> new PokemonFinal("Mankey", "Fighting", "High Jump Kick", 130, 40, 80, 35);
            case "Marowak" -> new PokemonFinal("Marowak", "Ground", "Bonemerang", 50, 60, 80, 110);
            case "Meowth" -> new PokemonFinal("Meowth", "Normal", "Mega Punch", 80, 40, 45, 35);
            case "Metapod" -> new PokemonFinal("Metapod", "Bug", "Pin Missile", 25, 50, 20, 55);
            case "Mew" -> new PokemonFinal("Mew", "Psychic", "Psychic", 90, 100, 100, 100);
            case "Mewtwo" -> new PokemonFinal("Mewtwo", "Psychic", "Dream Eater", 100, 106, 110, 90);
            case "Moltres" -> new PokemonFinal("Moltres", "Fire", "Flamethrower", 90, 90, 100, 90);
            case "MrMime" -> new PokemonFinal("Mr-Mime", "Psychic", "Psybeam", 65, 40, 45, 65);
            case "Muk" -> new PokemonFinal("Muk", "Poison", "Smog", 30, 105, 105, 75);
            case "Nidoking" -> new PokemonFinal("Nidoking", "Poison", "Poison Sting", 15, 81, 102, 77);
            case "Nidoqueen" -> new PokemonFinal("Nidoqueen", "Poison", "Smog", 30, 90, 92, 87);
            case "NidoranF" -> new PokemonFinal("Nidoran-F", "Poison", "Acid", 40, 55, 47, 52);
            case "NidoranM" -> new PokemonFinal("Nidoran-M", "Poison", "Poison Sting", 15, 46, 57, 40);
            case "Nidorina" -> new PokemonFinal("Nidorina", "Poison", "Poison Sting", 15, 70, 62, 67);
            case "Nidorino" -> new PokemonFinal("Nidorino", "Poison", "Smog", 30, 61, 72, 57);
            case "Ninetales" -> new PokemonFinal("Ninetales", "Fire", "Ember", 40, 73, 76, 75);
            case "Oddish" -> new PokemonFinal("Oddish", "Grass", "Solar Beam", 120, 45, 50, 55);
            case "Omanyte" -> new PokemonFinal("Omanyte", "Rock", "Rock Slide", 75, 35, 40, 100);
            case "Omastar" -> new PokemonFinal("Omastar", "Rock", "Rock Throw", 50, 70, 60, 125);
            case "Onix" -> new PokemonFinal("Onix", "Rock", "Rock Throw", 50, 35, 45, 160);
            case "Paras" -> new PokemonFinal("Paras", "Bug", "Twineedle", 25, 35, 70, 55);
            case "Parasect" -> new PokemonFinal("Parasect", "Bug", "Pin Missile", 25, 60, 95, 80);
            case "Persian" -> new PokemonFinal("Persian", "Normal", "Egg Bomb", 100, 65, 70, 60);
            case "Pidgeot" -> new PokemonFinal("Pidgeot", "Normal", "Hyper Beam", 150, 83, 80, 75);
            case "Pidgeotto" -> new PokemonFinal("Pidgeotto", "Normal", "Slam", 80, 63, 60, 55);
            case "Pidgey" -> new PokemonFinal("Pidgey", "Normal", "Bind", 15, 40, 45, 40);
            case "Pikachu" -> new PokemonFinal("Pikachu", "Electric", "Thunder Shock", 40, 35, 55, 40);
            case "Pinsir" -> new PokemonFinal("Pinsir", "Bug", "Leech Life", 80, 65, 125, 100);
            case "Poliwag" -> new PokemonFinal("Poliwag", "Water", "Bubble Beam", 65, 40, 50, 40);
            case "Poliwhirl" -> new PokemonFinal("Poliwhirl", "Water", "Surf", 90, 65, 65, 65);
            case "Poliwrath" -> new PokemonFinal("Poliwrath", "Water", "Waterfall", 80, 90, 95, 95);
            case "Ponyta" -> new PokemonFinal("Ponyta", "Fire", "Flamethrower", 90, 50, 85, 55);
            case "Porygon" -> new PokemonFinal("Porygon", "Normal", "Constrict", 10, 65, 60, 70);
            case "Primeape" -> new PokemonFinal("Primeape", "Fighting", "Jump Kick", 100, 65, 105, 60);
            case "Psyduck" -> new PokemonFinal("Psyduck", "Water", "Crabhammer", 100, 50, 52, 48);
            case "Raichu" -> new PokemonFinal("Raichu", "Electric", "Thunder", 110, 60, 90, 55);
            case "Rapidash" -> new PokemonFinal("Rapidash", "Fire", "Fire Blast", 110, 65, 100, 70);
            case "Raticate" -> new PokemonFinal("Raticate", "Normal", "Dizzy Punch", 70, 55, 81, 60);
            case "Rattata" -> new PokemonFinal("Rattata", "Normal", "Swift", 60, 30, 56, 35);
            case "Rhydon" -> new PokemonFinal("Rhydon", "Ground", "Dig", 80, 105, 130, 120);
            case "Rhyhorn" -> new PokemonFinal("Rhyhorn", "Ground", "Dig", 80, 80, 85, 95);
            case "Sandshrew" -> new PokemonFinal("Sandshrew", "Ground", "Dig", 80, 50, 75, 85);
            case "Sandslash" -> new PokemonFinal("Sandslash", "Ground", "Dig", 80, 75, 100, 110);
            case "Scyther" -> new PokemonFinal("Scyther", "Bug", "Pin Missile", 25, 70, 110, 80);
            case "Seadra" -> new PokemonFinal("Seadra", "Water", "Clamp", 35, 55, 65, 95);
            case "Seaking" -> new PokemonFinal("Seaking", "Water", "Surf", 90, 80, 92, 65);
            case "Seel" -> new PokemonFinal("Seel", "Water", "Clamp", 35, 65, 45, 55);
            case "Shellder" -> new PokemonFinal("Shellder", "Water", "Clamp", 35, 30, 65, 100);
            case "Slowbro" -> new PokemonFinal("Slowbro", "Water", "Crabhammer", 100, 95, 75, 110);
            case "Slowpoke" -> new PokemonFinal("Slowpoke", "Water", "Water Gun", 40, 90, 65, 65);
            case "Snorlax" -> new PokemonFinal("Snorlax", "Normal", "Stomp", 65, 160, 110, 65);
            case "Spearow" -> new PokemonFinal("Spearow", "Normal", "Constrict", 10, 40, 60, 30);
            case "Squirtle" -> new PokemonFinal("Squirtle", "Water", "Water Gun", 40, 44, 48, 65);
            case "Starmie" -> new PokemonFinal("Starmie", "Water", "Water Gun", 40, 60, 75, 85);
            case "Staryu" -> new PokemonFinal("Staryu", "Water", "Surf", 90, 30, 45, 55);
            case "Tangela" -> new PokemonFinal("Tangela", "Grass", "Absorb", 20, 65, 55, 115);
            case "Tauros" -> new PokemonFinal("Tauros", "Normal", "Cut", 50, 75, 100, 95);
            case "Tentacool" -> new PokemonFinal("Tentacool", "Water", "Crabhammer", 100, 40, 40, 35);
            case "Tentacruel" -> new PokemonFinal("Tentacruel", "Water", "Surf", 90, 80, 70, 65);
            case "Vaporeon" -> new PokemonFinal("Vaporeon", "Water", "Hydro Pump", 110, 130, 65, 60);
            case "Venomoth" -> new PokemonFinal("Venomoth", "Bug", "Pin Missile", 25, 70, 65, 60);
            case "Venonat" -> new PokemonFinal("Venonat", "Bug", "Twineedle", 25, 60, 55, 50);
            case "Venusaur" -> new PokemonFinal("Venusaur", "Grass", "Mega Drain", 40, 80, 82, 83);
            case "Victreebel" -> new PokemonFinal("Victreebel", "Grass", "Vine Whip", 45, 80, 105, 65);
            case "Vileplume" -> new PokemonFinal("Vileplume", "Grass", "Solar Beam", 120, 75, 80, 85);
            case "Voltorb" -> new PokemonFinal("Voltorb", "Electric", "Thunder Shock", 40, 40, 30, 50);
            case "Vulpix" -> new PokemonFinal("Vulpix", "Fire", "Flamethrower", 90, 38, 41, 40);
            case "Wartortle" -> new PokemonFinal("Wartortle", "Water", "Surf", 90, 59, 63, 80);
            case "Weedle" -> new PokemonFinal("Weedle", "Bug", "Pin Missile", 25, 40, 35, 30);
            case "Weepinbell" -> new PokemonFinal("Weepinbell", "Grass", "Vine Whip", 45, 65, 90, 50);
            case "Weezing" -> new PokemonFinal("Weezing", "Poison", "Poison Sting", 15, 65, 90, 120);
            case "Wigglytuff" -> new PokemonFinal("Wigglytuff", "Normal", "Double Edge", 120, 140, 70, 45);
            case "Zapdos" -> new PokemonFinal("Zapdos", "Electric", "Thunder Punch", 75, 90, 90, 85);
            case "Zubat" -> new PokemonFinal("Zubat", "Poison", "Poison Sting", 15, 40, 45, 35);
            default -> {
                System.out.println("Pokemon " + name + " not found, defaulting to Pikachu");
                yield new PokemonFinal("Pikachu", "Electric", "Thunder Shock", 40, 35, 55, 40);
            }
        };
    }
}

