package hards;

public class hards {

    public static void swap(int[] mass, int ind1, int ind2) {
        int tmp = mass[ind1];
        mass[ind1] = mass[ind2];
        mass[ind2] = tmp;
    }

    public static int[] bubble(int[] mass) { // O(n^2)
        boolean need = true;
        while (need) {
            need = false;
            for (int i = 1; i < mass.length; i++) {
                if (mass[i] < mass[i - 1]) {
                    swap(mass, i, i-1);
                    need = true;
                }
            }
        }
        return mass;
    }
    

    public static int linear_search(int[] mass, int el) { // O(n)

        for (int index = 0; index < mass.length; index++) {
            if (mass[index] == el)
                return index;
        }
        return -1;
    }



    public static int[] fastSort(int[] array) {
        return recursionFastSort(array, 0, array.length - 1);

    }

    public static int[] recursionFastSort(int[] array, int min, int max) { // O(n*log(n))
        if (array.length == 0) {
            return array;
        }
 
        if (min >= max) {
            return array;
        }            
 
        int middle = min + (max - min) / 2;
        int middleElement = array[middle];
 
        int i = min, j = max;
        while (i <= j) {
            while (array[i] < middleElement) {
                i++;
            }
            while (array[j] > middleElement) {
                j--;
            }
 
            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
        }
 
        if (min < j) {
            recursionFastSort(array, min, j);
        }
 
        if (max > i) {
            recursionFastSort(array, i, max);
        }
        return array;
    }
}
