import greedy.greedy;
import dinam.dinam;
import hards.hards;

public class laba2 {
    public static void main(String[] args) {
        int[][] mass_1 = { {30, 15, 50}, {90, 60, 100} };
        int M = 80;

        System.out.println(greedy.greedy(mass_1, M));

        int[] mass_2 = { 10, 100, 5, 50, 25, 30, 1 };
        System.out.println(dinam.dinam(mass_2));

        int[] mass_3 = { 2, 4, 23, 1, 0, 45, 100, 34, 2 };

        int[] one = hards.bubble(mass_3);
        for (int i = 0; i < one.length; i++) {
            System.out.printf("%3d", one[i]);
        }

        System.out.printf("\n");

        int[] two = hards.fastSort(mass_3);
        for (int i = 0; i < one.length; i++) {
            System.out.printf("%3d", two[i]);
        }

        System.out.printf("\nИндекс элемента: %d", hards.linear_search(mass_3, 23));
    }
}