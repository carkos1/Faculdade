/**
 * @author Igor Reis
 * @version 1.0
 */


 /**
  * Class to execute main program
  */
public class App {
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Angulo ang = new Angulo();
        Angulo ang2 = new Angulo();
        Angulo ang3 = new Angulo();

        ang.setAngulo(45);
        
        ang2.setAngulo(135);


        ang3.setAngulo(ang2.getAngulo());

        ang3.setAngulo(ang3.adicao(ang.getAngulo()));



        // System.out.println(ang);
        // System.out.println(ang2);
        // System.out.println((ang.adicao(ang2.getAngulo())));
        // // System.out.println(ang.subtracao(ang2.getAngulo()));
        // System.out.println(ang3.radianos());
        System.out.println(ang.equals(ang2));

        ang3.setAngulo(ang3.radianos());

        System.out.println(ang3.sin());
        System.out.println(ang3.cos());
        System.out.println(ang3.tg());
    }
}
