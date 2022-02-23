import java.util.Scanner;
import greedy.greedy;
import dinam.dinam;

public class laba2 {
    public static void main(String[] args) {
        int[][] mass = { {30, 15, 50}, {90, 60, 100} };
        int M = 80;

        System.out.println(greedy.greedy(mass, M));

        dinam.dinam(mass, M);
    }
}