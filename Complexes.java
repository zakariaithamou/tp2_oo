public class Complexes {
    public int a;
    public int b;
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {return b;}
    public void setB(int b) {this.b = b;}
    public Complexes() {
        this.a = 0;
        this.b = 0;
    }
    public Complexes(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public Complexes Plus(Complexes z) {
        Complexes c = new Complexes(this.a + z.getA(), this.b + z.getB());
        return c;
    }
    public Complexes Moins(Complexes z) {
        Complexes c = new Complexes(this.a - z.getA(), this.b - z.getB());
        return c;
    }
    public void Afficher(){
        if(b>=0){
            System.out.println(a+"+i*"+b);

        }else {
            System.out.println(a+"-i*"+(-b));
    }


}}
