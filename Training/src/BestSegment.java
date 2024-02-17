import java.util.Arrays;

public class BestSegment {
    public static void main(String[] args) {
        int[] array = {5, 6, 6, 8};
        int N = array.length;
        int K = 4;
        if (N == K) {
            Arrays.sort(array);
            System.out.println("Output: " + array[0]);
        } else {
            int result = maxBestSum(array, N, K);

            System.out.println("Output: " + result);
        }
    }

    public static int maxBestSum(int[] array, int N, int K) {
        // Initialize dp array to store the best sum for each partition
        int[][] dp = new int[N + 1][K + 1];

        // Calculate prefix sum for efficient segment sum calculation
        int[] prefixSum = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            prefixSum[i] = prefixSum[i - 1] + array[i - 1];
        }

        // Initialize dp array with maximum possible value
        for (int i = 0; i <= N; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }

        // Base case: with 0 segments, the best sum is 0
        for (int i = 0; i <= N; i++) {
            dp[i][0] = 0;
        }

        // Fill dp array using dynamic programming
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {
                for (int k = 0; k < i; k++) {
                    dp[i][j] = Math.min(dp[i][j], Math.max(dp[k][j - 1], prefixSum[i] - prefixSum[k]));
                }
            }
        }

        // Return the maximum best sum from the last column of dp array
        return dp[N][K];
    }
}
