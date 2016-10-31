public class PrimeFactorFinder {
    public static void main(String[] args){
        long x = Long.parseLong(args[0]);
        long factor = 0;
        long t1 = System.currentTimeMillis();
        while (x % 2 == 0) {
            x = x / 2;
        }
        for (long i = 3; i * i <= x; i += 2) {
            while (x % i == 0) {
                factor = i;
                x = x / i;
            }
        }

        long t2 = System.currentTimeMillis();
        System.out.println("time (s): " + (t2 - t1) / 1000);
        System.out.println(Math.max(factor, x));
    }
}

