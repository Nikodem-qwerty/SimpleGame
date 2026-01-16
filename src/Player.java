public class Player extends Entities {
    String player_name;
    int player_damage;
    int player_health;

    @Override
    void print() {
        super.print();

        System.out.println(player_name);
    }
}