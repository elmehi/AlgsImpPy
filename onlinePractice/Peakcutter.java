class Peakcutter {
    public static int peakcutter(int[] A) {
        int N = A.length;
        int blocks = 0;
        boolean[] peaks = new boolean[N];
        for (int i = 1; i < N - 1; i++) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                peaks[i] = true;
            }
        }

        for (int k = N; k > 1; k--) {
            if (N % k != 0) {
                continue;
            }

            int containsPeak = 0;
            boolean peakFound = false;
            for (int start = 0; start < N; start += k) {
                for (int i = start; i < (start + k); i++) {
                    if (peaks[i]) {
                        containsPeak++;
                        peakFound = true;
                        break;
                    }
                }
            }
            if (!peakFound)
                break;
            else if (containsPeak == N / k)
                blocks = N / k;
        }
        return blocks;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
        int[] B = {-1, 3, -1};
        int[] C = {0, 0, 0};
        int[] D = {-1, 3, -1};
        System.out.println(Solution.solution(A));
        System.out.println(Solution.solution(B));
        System.out.println(Solution.solution(C));
        System.out.println(Solution.solution(D));
    }
}
