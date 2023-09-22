public class Arme extends EquipementOFF {
    public Arme(){
        super();
        super.setNom("Couteau de cuisine");
        super.setNivAttaque(10);
    }
    public Arme(String nom){
        super();
        super.setNom("Couteau de cuisine");
        super.setNivAttaque(10);
    }
    public Arme(String nom, int nivAttaque){
        super();
        super.setNom(nom);
        super.setNivAttaque(nivAttaque);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
