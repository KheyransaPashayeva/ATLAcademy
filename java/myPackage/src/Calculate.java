import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        System.out.println("emeliyyatlar:"
                        +"\n 1.Toplama"
                        +"\n 2.Cixma"
                        +"\n 3.Vurma"
                        +"\n 4.Bolme"
                );
        System.out.println("ededleri daxil edin:");

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("emeliyyati secin:");
        int netice = sc.nextInt();
        if(netice == 1){
            Toplama(num1,num2);
        } else if (netice == 2) {
            Cixma(num1,num2);
        } else if (netice == 3) {
            Vurma(num1,num2);
        }else if (netice==4){
            Bolme(num1,num2);
        }
    }

    public static int Toplama(int a,int b){
        int topla = a+b;
        System.out.println(topla);
        return topla;
    }
    public static int Cixma(int a,int b){
        int cixma = a-b;
        System.out.println(cixma);
        return cixma;
    }
    public static int Vurma(int a,int b){
        int vurma = a*b;
        System.out.println(vurma);
        return vurma;
    }
    public static int Bolme(int a,int b){
        int bolme = a/b;
        System.out.println(bolme);
        return bolme;
    }



}
