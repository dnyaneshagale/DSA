class Solution {
    int n;
    int[][][] t = new int[2][101][101];

    private int solveForAlice(int[] piles, int person, int i, int M) {
        if (i >= n) {
            return 0;
        }

        if (t[person][i][M] != -1) {
            return t[person][i][M];
        }

        int result = (person == 1) ? -1 : Integer.MAX_VALUE;
        int stones = 0;

        for (int x = 1; x <= Math.min(2 * M, n - i); x++) {
            stones += piles[i + x - 1];

            if (person == 1) {
                result = Math.max(result, stones + solveForAlice(piles, 0, i + x, Math.max(M, x)));
            } else {
                result = Math.min(result, solveForAlice(piles, 1, i + x, Math.max(M, x)));
            }
        }

        t[person][i][M] = result;
        return result;
    }

    public int stoneGameII(int[] piles) {
        n = piles.length;
        for (int[][] person : t) {
            for (int[] row : person) {
                Arrays.fill(row, -1);
            }
        }
        return solveForAlice(piles, 1, 0, 1);
    }
}