public class Main {
    //exo1
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(7, 7);

        r1.afficherRectangle();
        r2.afficherRectangle();
    }
    //exo2
     public static void main(String[] args){
        Complexes z = new Complexes();
        z.Afficher();
        Complexes z1 = new Complexes(3,2);
        z1.Afficher();
        Complexes z2 = new Complexes(3,-6);
        z2.Afficher();
        Complexes z3 = z1.Plus(z2);
        z3.Afficher();
        Complexes z4 = z2.Moins(z3);
        z4.Afficher();
    }
    
}
