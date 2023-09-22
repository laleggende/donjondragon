import java.util.Scanner;

public class Game {

    Scanner scanner = new Scanner(System.in);
    private int position = 0;
    private int de;

    public void play() throws PersonnageHorsPlateauException {
        while (position < 64) {
            System.out.print("Appuyez sur Entrée pour lancer le dé : ");
            scanner.nextLine();

            de = (int) (Math.random() * 6) + 1;
            position += de;

            System.out.println("Vous avez obtenu un " + de + " et Votre nouvelle position est " + position + ".");

            if (position == 64) {
                System.out.println("Félicitations, vous avez atteint la position 64 !");
            }
            if (position > 64) {
                throw new PersonnageHorsPlateauException();
            }
        }
    }
}