import java.util.Scanner;

public class Menu {

    public Menu() {
    }

    public void showMenuPrincipal() {
        int selection;
        Scanner input = new Scanner(System.in);
        System.out.println("Choisissez ou vous voulez allez");
        System.out.println("---------------------");
        System.out.println("1 - START");
        System.out.println("2 - Personnages");
        System.out.println("3 - Quit");

        selection = input.nextInt();
        switch (selection) {
            case 0:
                int choix = 0;

            case 1:
                System.out.println("Start");
                System.out.println("Bienvenue");
                System.out.println("Le jeu se lance");
                System.out.println("ALLEZ-Y !!!");
                Game game = new Game();
                try {
                    game.play();
                } catch (PersonnageHorsPlateauException e) {
                    System.out.println(e.getMessage());
                    showMenuPrincipal();
                }
                break;

            case 2:
                System.out.println("Personnage");
                System.out.println("Choisissez votre perso (=");
                Guerriers guerriers = new Guerriers();
                Arme equipement1 = new Arme();
                System.out.println("-----------------------");
                Magiciens magicienne = new Magiciens();
                Boucliers equipement2 = new Boucliers();
                System.out.println("-----------------------");
                System.out.println(magicienne);
                System.out.println(equipement2);
                System.out.println("-----------------------");
                System.out.println(guerriers);
                System.out.println(equipement1);


                // Perso perso = Appel a une autre fonction
                // sout (perso)

                // Par ex : private Perso chooseTypePerso
                // Perso perso = null;
                // afficher une question à l'utilisateur
                // initialiser avec le scan ( nextInt() ou nextString() )
                // switch selon la valeur de la variable du scan
                // première case -> attribuer la valeur de perso avec l'instanciation d'un nouveau guerrier
                // seconde case -> attribuer la valeur de perso avec l'instanciation d'un nouveau magicien
                // return perso
                break;


            case 3:
                System.out.println("Quit");
                System.out.println("AU REVOOOOIIIIIRRREE");
                break;

        }
    }

}




