public class GameApp {
    public static void main(String[] args) {

        Character knight = new Knight();

        System.out.println("Knight");
        knight.attack();
        System.out.println();
        knight.defend();
        System.out.println("-------------------------");

        Character wizard = new Wizard();
        System.out.println("Wizard");
        wizard.attack();
        System.out.println();
        wizard.defend();
        System.out.println("-------------------------");

        Character archer = new Archer();
        System.out.println("Archer");
        archer.attack();
        System.out.println();
        archer.defend();
    }
}
