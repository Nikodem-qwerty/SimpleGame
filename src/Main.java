

void main() {

    // Enemy stats
    Enemy gorlock = new Enemy();
    gorlock.name = "Gorlock";
    gorlock.damage = 20;
    gorlock.health = 20;

    // Player stats
    Player forklift = new Player();
    forklift.name = "Forklift";
    forklift.damage = 15;
    forklift.health = 50;

    Scanner sc = new Scanner(System.in);
    System.out.println("Czyje statystyki chcesz wyświetlić, 1-gracz 2-gorlock:");
    String choice = sc.nextLine();

    if (Objects.equals(choice, "a")){
        forklift.stats();
    }
    else if (Objects.equals(choice, "b")) {
        gorlock.stats();
    }
    else{
        System.out.println("ERROR");
    }

     /*Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

   String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);
     // Output user input
    */
}



