public class Thread1 extends Thread{
    public double reyn;
    public double ed;
    public double la;
    public double lab;
    public double f;
    public int h;
    
    public void run(){
        f=eq(la, reyn, ed);
        while ((1 - f) > 0) {
            //System.out.println("bandera :D");
            la = la + 0.000001;
//            System.out.println("H"+h+" La: "+la);
            f = eq(la, reyn, ed);
            //System.out.println("2");
        }
        System.out.println("La: "+la+" F: "+f+" Yo gané prro H"+h);
    }
    
    public double eq(double seed, double reyn, double ed) {
        double f = -2 * Math.log10((ed / 3.7) + (2.51 / (reyn * Math.sqrt(seed)))) * Math.sqrt(seed);
        return f;
    }   
}