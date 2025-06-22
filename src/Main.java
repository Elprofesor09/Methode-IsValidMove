public class Main {
    public static void main(String[] args) {
        Reine reine = new Reine();
        reine.position = new Position(4, 4);

        Position test1 = new Position(7, 7);
        System.out.println("Déplacement vers (7,7) : " + reine.isValidMove(test1));

        Position test2 = new Position(4, 8);
        System.out.println("Déplacement vers (4,8) : " + reine.isValidMove(test2));

        Position test3 = new Position(5, 6);
        System.out.println("Déplacement vers (5,6) : " + reine.isValidMove(test3));
    }
}
