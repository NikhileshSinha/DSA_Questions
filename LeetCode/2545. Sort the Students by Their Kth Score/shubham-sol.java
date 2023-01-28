class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int val, i, j, n, m;
        n = score.length;
        m = score[0].length;
        for (i = 0; i < n - 1; i++) {
            int flag = 0;
            for (j = 0; j < n - i - 1; j++) {
                if (score[j][k] < score[j + 1][k]) {
                    flag = 1;
                    exchange(score[j], score[j + 1], m);
                }
            }
            if (flag != 1)
                break;
        }
        return score;
    }
    // code to swap the list
    public void exchange(int arrOne[], int arrTwo[], int m) {
        for (int i = 0; i < m; i++) {
            int temp = arrOne[i];
            arrOne[i] = arrTwo[i];
            arrTwo[i] = temp;
        }
    }
}
