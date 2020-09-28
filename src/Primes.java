public class Primes {
    public static void main(String[] args) {
        for (int i=2;i<100;i++) {
            if (isPrime(i)==true)
                System.out.println(i);

        }
    }

    public static boolean isPrime(int n) {
        boolean pr = true;
        for (int j=2;j<n;j++)
        if (n%j==0){
            pr = false;
        }
        return pr;
    }
}