public class Rectangle {
    private int longueur ;
    private int  largeur ;

    public int getlongueur (){
        return longueur;
    }
    public void setlongueur( int longueur){
        this.longueur=longueur;
    }
    public int getlargeur (){
        return largeur ;
    }
    public void setlargeur (int largeur){
        this.largeur=largeur ;
    }

    // Constructeur
    public Rectangle(int longueur, int largeur) {
        this.longueur=longueur;
        this.largeur=largeur;

    }
    public int perimetre() {
        return 2 * (longueur + largeur);
    }
    public int aire() {
        return longueur * largeur;
    }
    public boolean estCarre() {
        return longueur == largeur;
    }
    public void afficherRectangle() {
        System.out.println(
                "Longueur : " + longueur +
                        " - Largeur : " + largeur +
                        " - Périmètre : " + perimetre() +
                        " - Aire : " + aire() +
                        " - " + (estCarre() ? "Il s’agit d’un carré" : "Il ne s’agit pas d’un carré")
        );
    }
}
