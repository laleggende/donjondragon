public abstract class EquipementDef {

    private String Bouclier;

    private int nivDeffence;

    public EquipementDef() {
        this("Bouclier en titane");
    }

    public EquipementDef(String Bouclier) {
        this(Bouclier, 20);
    }

    public EquipementDef(String Bouclier, int nivDeffence) {
        this.Bouclier = Bouclier;
        this.nivDeffence = nivDeffence;
        System.out.println(this);

    }

    public String getBouclier() {
        return Bouclier;
    }

    public void setBouclier(String Bouclier) {
        this.Bouclier = Bouclier;
    }

    public int getNivDeffence() {
        return nivDeffence;
    }

    public void setNivDeffence(int nivDeffence) {
        this.nivDeffence = nivDeffence;
    }

    @Override
    public String toString() {
        return "Bouclier: " + Bouclier + " - Puissance: " + nivDeffence;
    }

}
