import greedy.greedy;
import dinam.dinam;
import hards.hards;
import java.util.Random;


public class laba2 {
    public static void time(int[] mass, int[] temp_mass, int n, int x) {
        long sumtime = 0;
        for (int i = 0; i < n; i++) {
            long time0 = System.currentTimeMillis();

            switch (x) {
                case 1:
                    hards.bubble(mass);
                    break;
                case 2:
                    hards.fastSort(mass);
                    break;
                case 3:
                    hards.linear_search(mass, 23);
                    break;
                default:
                    break;
            }
            
            long time = System.currentTimeMillis() - time0;
            System.out.printf("\nВремя выполнения: %d", time);
            for (int j = 0; j < temp_mass.length; j++) {
                mass[j] = temp_mass[j];
            }
            sumtime += time;
        }
        System.out.printf("\nСреднее время выполнения: %d\n", sumtime/n);
    }

    public static void main(String[] args) {
        int[][] mass_1 = { {30, 15, 50}, {90, 60, 100} };
        int M = 80;

        System.out.printf("\nОтвет: %5d\n", greedy.greedy(5));

        int[] mass_2 = { 10, 100, 5, 50, 25, 30, 1 };
        System.out.printf("\nКоличество операций: %d\n",dinam.dinam(mass_2));

        int[] mass_3 = new int[30];
        int[] temp_mass = new int[30];
        Random rand = new Random();
        for (int i = 0; i < mass_3.length; i++) {
            mass_3[i] = rand.nextInt(1000);
            temp_mass[i] = mass_3[i];
        }

        for (int i = 1; i < 4; i++) {
            time(mass_3, temp_mass, 5, i);
        }

    }
}