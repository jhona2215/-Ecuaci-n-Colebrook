
public class Main {

    public static void main(String[] args) {
        ColebrookEq obj3 = new ColebrookEq();
        Thread1 obj1 = new Thread1();
        Thread2 obj2 = new Thread2();
        
        obj3.ed=400;
        obj3.reyn=15000;
        
        obj2.ed=obj3.ed;
        obj2.reyn=obj3.reyn;
        obj2.h=2;
        
        obj1.ed=obj3.ed;
        obj1.reyn=obj3.reyn;
        obj1.h=1;
        
        

        obj3.iniciar();
        obj1.f = obj3.f;
        obj2.f = obj3.f;
        obj1.la = obj3.lab;
        obj2.la = obj3.la;
        System.out.println("LAB: "+obj3.lab);
        System.out.println("o1la: "+obj1.la);
        
        
        obj1.start();
        obj2.start();
        
        
        
//        long startTime = System.currentTimeMillis();
//        //Codigo para contabilizar
//        long endTime = System.currentTimeMillis() - startTime; // tiempo en que se ejecuta su for
//        System.out.println("Tiempo ejecución: " + endTime);
        
        
        
        
        
        
        
        
        
//        hi obj1 = new hi();
//        hello obj2 = new hello();
//        obj1.start();
//        try {
//                Thread.sleep(10);
//            } catch (Exception e) {
//            }
//        obj2.start();
    }

}
