public class Guerriers extends Perso1 {

    public Guerriers() {
        super();
        super.setNom("laleggende");
        super.setType("Guerriers");
        super.setVie(15);
        super.setForce(20);
    }

    public Guerriers(String nom) {
        super();
        super.setNom(nom);


    }

    public Guerriers(String nom, String type, int vie, int force) {
        super();
        super.setNom(nom);
        super.setType(type);
        super.setVie(vie);
        super.setForce(force);

    }

}

