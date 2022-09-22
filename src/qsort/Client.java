package qsort;

public class Client {
    public static void main(String[] args) {
        Integer[] a = {5, 5, 5, 5, 5, 5, 5, 5, 5};
        QuickSort.sort(a);
        for(int i: a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

