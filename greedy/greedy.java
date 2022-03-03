package greedy;

public class greedy {

    public static void swap(int mass[], int ind1, int ind2) {
        int temp = mass[ind1];
        mass[ind1] = mass[ind2];
        mass[ind2] = temp;

    }
    
    public static void bubble(int[] del, int[][] mass)
    {
        Boolean need = true;
        while (need) {
            need = false;
            for (int i = 0; i < del.length-1; i++) {
                if (del[i] < del[i + 1]) {
                    swap(del, i, i + 1);
                    swap(mass[0], i, i + 1);
                    swap(mass[1], i, i + 1);
                    need = true;
                }
            }
        }
    }

    public static int greedy(int[][] mass, int M) {
        int[] del = new int[mass[0].length];

        for (int i = 0; i < del.length; i++) {
            del[i] = mass[1][i] / mass[0][i];
        }
        
        bubble(del, mass);

        int sum = 0;
        int i = 0;
        while (sum < M) {
            sum += mass[1][i];
            i++;
        }

        return sum;
    }

}
