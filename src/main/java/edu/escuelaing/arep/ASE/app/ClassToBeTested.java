package edu.escuelaing.arep.ASE.app;

public class ClassToBeTested {

     public static void m1(){
         System.out.println("Ok.");
     }
     @Test
     public static void  m2() throws Exception {
         throw new Exception("Error From m2");
     }
    @Test
    public static void  m3(){
        System.out.println("Ok Computer.");
    }
    @Test
    public static void  m4() throws Exception {
        throw new Exception("Error From m4");
    }
    @Test
    public static void  m5() throws Exception {
        throw new Exception("SIU");
    }
}
