import java.util.*;

public class Ficha1{


    public static int div(int n,int k, int sum){
        k++;
        if(n%k==0){
            sum+=k;
        }
        if(n > k){
            sum = div(n,k,sum);
        }
        return sum;
    }



    public static void main(String args[]){
        //ex2(10110);
        System.out.print(div(284,0,0)-284);
        //ex4();
    }   

    public static int ex1(){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt((sc.nextLine()));
        sc.close();

        int sum = 0;
        int value = 0;
        while(value < n){
            sum += 1;
            value += sum;
        }
        return value;
    }

    public static void ex2(int b){
        int one = 0,zero = 0,dec=0,aux,time=0;
        while(b>0){
            aux = b % 10;
            System.out.print(aux);
            if (aux == 1){
                dec += Math.pow(2, time);
                one++;
            }
            if (aux == 0){
                zero++;
            }
            b=b/10;
            time++;
        }
        System.out.print("\n" + one + "\n");
        System.out.print(zero+ "\n");
        System.out.print(dec+ "\n");
    }

    public static void ex3(){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt((sc.nextLine()));
        sc.close();
        for(int i=0;i<4;i++){
            System.out.print(i*n + "\n");
        }
    }

    public static void ex4(){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt((sc.nextLine()));
        int m = Integer.parseInt((sc.nextLine()));
        sc.close();

        int sumM=0,sumN=0,k=1;
        while(k < n || k < m){
            k++;
            if(m%k==0){
                sumM+=k;
            }
            if(n%k==0){
                sumN+=k;
            }
        }

        if(sumN == sumM) System.out.println("Números são amigos");
    }

    // public static void ex5(){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Digite n:");
    //     int n = Integer.parseInt((sc.nextLine()));
    //     sc.close();
    //     while(n <= 3){
    //         System.out.println("Number must be greater than 3");
    //         n = Integer.parseInt((sc.nextLine()));
    //     }
    //     for(int i=3;i<n;i++){
    //         if()
    //     }

    // }

}