// Last updated: 9/1/2026, 9:31:18 PM
class Solution {
    public int minMoves(String[] classroom, int energy) {
        int m = classroom.length;
        int n = classroom[0].length();
        int startR = -1, startC = -1;
        
        int[][] litterId = new int[m][n];
        for (int[] row : litterId) Arrays.fill(row, -1);
        
        int litterCount = 0;
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                char ch = classroom[r].charAt(c);
                if (ch == 'S') {
                    startR = r;
                    startC = c;
                } else if (ch == 'L') {
                    litterId[r][c] = litterCount++;
                }
            }
        }

        if (litterCount == 0) return 0;
        int fullMask = (1 << litterCount) - 1;

        // maxEnergy[r][c][mask] stores max remaining energy for that state
        int[][][] maxEnergy = new int[m][n][1 << litterCount];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(maxEnergy[i][j], -1);
            }
        }

        Queue<int[]> queue = new ArrayDeque<>();
        // {r, c, energy, mask, steps}
        queue.offer(new int[]{startR, startC, energy, 0, 0});
        maxEnergy[startR][startC][0] = energy;

        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0], c = curr[1], e = curr[2], mask = curr[3], steps = curr[4];

            if (e == 0) continue; // Cannot make another move from here

            for (int[] d : dirs) {
                int nr = r + d[0];
                int nc = c + d[1];

                if (nr < 0 || nr >= m || nc < 0 || nc >= n || classroom[nr].charAt(nc) == 'X') {
                    continue;
                }

                int nextEnergy = e - 1;
                char cell = classroom[nr].charAt(nc);
                int nextMask = mask;

                if (cell == 'R') {
                    nextEnergy = energy;
                } else if (cell == 'L') {
                    nextMask |= (1 << litterId[nr][nc]);
                }

                if (nextMask == fullMask) {
                    return steps + 1;
                }

                if (nextEnergy > maxEnergy[nr][nc][nextMask]) {
                    maxEnergy[nr][nc][nextMask] = nextEnergy;
                    queue.offer(new int[]{nr, nc, nextEnergy, nextMask, steps + 1});
                }
            }
        }

        return -1;
    }
}