package lab1;

public class Multiples {
    public static void main(String[] args) {


    }

    public static void multiples(int n, int a, int b) {
        for(int i=1;i<=n;i++){
            if(i % a == 0 | i%b == 0){
                System.out.println(i);
            }
        }
    }
}
