public abstract class Perso2 {
    private String nom;


    private String type;


    private int vie;

    private int force;

    public Perso2() {
        this("Dr Strange");
    }

    public Perso2(String name) {
        this(name, "Magicien");
    }

    public Perso2(String nom, String type) {

        this.nom = nom;
        this.type = type;
        this.vie = 6;
        this.force = 15;
        System.out.println(this);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {this.type = type;}

    @Override
    public String toString() {
        return "Nom: " + nom + " | Points de vie : " + vie + " | Force: " + force + " |type: " + type;
    }

}

