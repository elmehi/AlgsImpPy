// finds largest 6 digit palindrome that is a multiple of 2 3-digit numbers

public class ThreeDigPalindrom {
    public ThreeDigPalindrom() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        boolean done = false;
        for (int i = 999; i > 0; i--) {
            StringBuilder half = new StringBuilder(String.valueOf(i));
            int pal = Integer.parseInt(half + half.reverse().toString());
            for (int j = 999; j >= 100; j--) {
                if (pal % j == 0 && pal / j >= 100 && pal / j < 1000) {
                    System.out.println(pal);
                    done = true;
                    break;

                }
            }
            if (done == true)
                break;
        }
        System.out.println(System.currentTimeMillis() - t1);
    }
}
