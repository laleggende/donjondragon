public class Boucliers extends EquipementDef {
    public Boucliers() {
        super();
        super.setBouclier("Champs de force");
        super.setNivDeffence(9);
    }

    public Boucliers(String nom) {
        super();
        super.setBouclier(nom);
        super.setNivDeffence(9);
    }

    public Boucliers(String nom, int nivDeffence) {
        super();
        super.setBouclier(nom);
        super.setNivDeffence(nivDeffence);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}