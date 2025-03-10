public class Pokemon {
    String name = "Pikachu";
    String type = "Electric";
    String move = "Thunder Shock";
    int hp, maxHP, attack, defence, power;

    Pokemon(String name, String type, String move, int power, int maxHP, int attack, int defence) {
        this.name = name;
        this.type = type;
        this.move = move;
        this.power = power;
        this.attack = attack;
        this.defence = defence;
        hp = maxHP;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public String getType() {
        return type;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getHP() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, Math.min(maxHP, hp));
    }

    public int getLevel() {
        return 50;
    }

    public void describe() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Move: " + move);
        System.out.println("Power: " + power);
        System.out.println("Max HP: " + maxHP);
        System.out.println("Attack: " + attack);
        System.out.println("Defense: " + defence);
        System.out.println("More info: https://bulbapedia.bulbagarden.net/wiki/" + name);
    }

    public void showHP() {
        System.out.println(name + " " + this.getHP() + " / " + this.getMaxHP());
    }

    public void attack() {
        System.out.println(name + " used " + move);
    }
}
