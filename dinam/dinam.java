package dinam;

public class dinam {
    public static int dinam(int[] mass) {
        int n = mass.length - 1;
		int[][] mass_res = new int[n][n];

		for (int i = 0; i < n; ++i) {
			mass_res[i][i] = 0;
		}

		for (int l = 1; l < n; l++) {
			for (int i = 0; i < n - l; i++) {
				int j = i + l;
				mass_res[i][j] = Integer.MAX_VALUE;
				for (int k = i; k < j; k++) {
					mass_res[i][j] = Math.min(mass_res[i][j], mass_res[i][k] + mass_res[k + 1][j] + mass[i] * mass[k + 1] * mass[j + 1]);
				}
			}
		}
		return mass_res[0][n - 1];
    }
}
