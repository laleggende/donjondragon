public abstract class EquipementOFF {


    private String nom;

    private int nivAttaque;

    public EquipementOFF() {
        this("Epee longue");
    }

    public EquipementOFF(String name) {
        this(name, 15);
    }

    public EquipementOFF(String nom, int nivAttaque) {
        this.nom = nom;
        this.nivAttaque = nivAttaque;
        System.out.println(this);

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String typeNameWeapon) {
        this.nom = typeNameWeapon;
    }

    public int getNivAttaque() {
        return nivAttaque;
    }

    public void setNivAttaque(int nivAttaque) {
        this.nivAttaque = nivAttaque;
    }

    @Override
    public String toString() {
        return "Arme: " + nom + " - Puissance: " + nivAttaque;
    }

}




