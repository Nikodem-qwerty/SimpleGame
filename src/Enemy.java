public class Enemy extends Entities  {
     String enemy_name = name;
     int enemy_damage = damage;
     int enemy_health = health;

    @Override
    void print() {
        super.print();

        System.out.println(enemy_name);
    }


}

