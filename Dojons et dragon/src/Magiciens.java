public class Magiciens extends Perso2 {

    public Magiciens() {
        super();
        this.setType("magicienne");
        this.setNom("Reyna");
       this.setVie(15);
       this.setForce(25);

    }

    public Magiciens(String nom) {
        super();
        super.setNom(nom);

    }

    public Magiciens(String nom, String type, int vie, int force) {
        super();
        super.setNom(nom);
        super.setType(type);
        super.setVie(vie);
        super.setForce(force);
    }
    @Override
    public String toString() {
        return super.toString();
    }

}
