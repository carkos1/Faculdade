import java.util.*;

public class Ficha2 {
    public static void main(String[] args) {
        System.out.println("EX1\n");
        System.out.println(Arrays.toString(ex1()));
        System.out.println("\nEX2\n");
        System.out.println(Arrays.toString(ex2(t1,t2)));
    }

    public static double[] ex1(){
        double[] table = new double[10];
        for (int i=0;i<10;i++){
            double a = Math.random();
            table[i] = Math.round(a*100);
        }
        return table;   
    }

    public static int[] ex2(int[] t1,int[] t2){
        int[] table = new int[t1.length+t2.length];
        for(int i=0;i<t1.length;i++){
            for(int j=0;j<t2.length;j++){
                table[i+j] = i;
                table[i+j+1] = j;
            }
        }
        return table;
    }
}
