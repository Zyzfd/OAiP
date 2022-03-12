import greedy.greedy;
import dinam.dinam;
import hards.hards;
import java.util.Random;

public class laba2 {
    public static void main(String[] args) {
        int[][] mass_1 = { {30, 15, 50}, {90, 60, 100} };
        int M = 80;

        System.out.printf("\nОтвет: %5d\n", greedy.greedy(5));

        int[] mass_2 = { 10, 100, 5, 50, 25, 30, 1 };
        System.out.printf("\nКоличество операций: %d\n",dinam.dinam(mass_2));

        int[] mass_3 = new int[100000];
        int[] temp_mass = new int[100000];
        Random rand = new Random();
        for (int i = 0; i < mass_3.length; i++) {
            mass_3[i] = rand.nextInt(1000);
            temp_mass[i] = mass_3[i];
        }

        long sumtime = 0;
        for (int i = 0; i < 5; i++) {
            long time0 = System.currentTimeMillis();
            int[] one = hards.bubble(mass_3);
            long time = System.currentTimeMillis() - time0;
            System.out.printf("\nВремя выполнения: %d", time);
            for (int j = 0; j < temp_mass.length; j++) {
                mass_3[j] = temp_mass[j];
            }
            sumtime += time;
        }
        System.out.printf("\nСреднее время выполнения: %d\n", sumtime/5);
        
        // for (int i = 0; i < one.length; i++) {
        //     System.out.printf("%4d", one[i]);
        // }

        System.out.printf("\n");

        sumtime = 0;
        for (int i = 0; i < 5; i++) {
            long time0 = System.currentTimeMillis();
            int[] two = hards.fastSort(mass_3);
            long time = System.currentTimeMillis() - time0;
            System.out.printf("\nВремя выполнения: %d", time);
            for (int j = 0; j < temp_mass.length; j++) {
                mass_3[j] = temp_mass[j];
            }
            sumtime += time;
        }
        System.out.printf("\nСреднее время выполнения: %d\n", sumtime/5);
        
        // for (int i = 0; i < one.length; i++) {
        //     System.out.printf("%4d", two[i]);
        // }

        sumtime = 0;
        for (int i = 0; i < 5; i++) {
            long time0 = System.currentTimeMillis();
            System.out.printf("\nИндекс элемента: %d", hards.linear_search(mass_3, 23));
            long time = System.currentTimeMillis() - time0;
            System.out.printf("\nВремя выполнения: %d", time);
            for (int j = 0; j < temp_mass.length; j++) {
                mass_3[j] = temp_mass[j];
            }
            sumtime += time;
        }
        System.out.printf("\nСреднее время выполнения: %d\n", sumtime/5);
        
    }
}