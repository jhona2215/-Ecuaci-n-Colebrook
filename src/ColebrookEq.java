
public class ColebrookEq {

    public double reyn;
    public double ed;
    public double la;
    public double lab;
    public double f;
    public double fprev=1;
    public int h;

    
    public void iniciar(){
        la = 0.03;
        double fprev = eq(la, reyn, ed);
        la = la + 0.03;      
        double f = eq(la, reyn, ed);
        
        if((1-f)<(1-fprev)){
            //bien
            la = la-0.06;
            aumentar();
        } else {
            la = la-0.06;
            disminuir();
        }
    }
    public void aumentar() {
        la = 0;
        lab = 0;
        do {
           la = la + 0.03;
           f = eq(la, reyn, ed);
        } while ((1 - f) > 0.00001);
    }
    
    public void disminuir(){
        la = 0.0003;
        lab = 0;
        do {
           la = la - 0.00001;
           f = eq(la, reyn, ed);
        } while ((1 - f) > 0.00001);
    }

    public double eq(double seed, double reyn, double ed) {
        double f = -2 * Math.log10((ed / 3.7) + (2.51 / (reyn * Math.sqrt(seed)))) * Math.sqrt(seed);
        return f;
    }
}
