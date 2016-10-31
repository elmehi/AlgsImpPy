class Equi {
    public static int Equi(int[] A) {
        // attempting 2N time
        // find sum of elements
        int sum = 0;
        int N = A.length;
        for (int i = 0; i < N; i++) {
            sum += A[i];
        }
        int left = 0;
        int right = sum;
        int eq = -1;
        for (int i = 0; i < N; i++) {
            if (left == (right - A[i])) {
                eq = i;
                break;
            }
            right = right - A[i];
            left = left + A[i];
        }
        return eq;
    }
}
