package qsort;
import java.util.Comparator;

public class QuickSort {
    private static final int CUTOFF = 5;

    public static <E extends Comparable<E>> void sort(E[] array) {
        QuickSort.sort(array, (x, y) -> x.compareTo(y));
    }

    public static <E> void sort(E[] array, Comparator<E> comparator) {
        quicksort( array, comparator, 0, array.length - 1 );
    }

    private static <E> void quicksort(E[] array, Comparator<E> comparator, int left, int right) {
        if( left + CUTOFF <= right ) {
            E pivot = median3( array, comparator,  left, right ); //pivot is stored in right - 1

            // Begin partitioning
            int l = left, h = right - 1;
            for( ; ; )
            {
                while( l < right - 1 && comparator.compare( array[ ++l ], pivot ) < 0 ) { }
                while( h > left && comparator.compare( array[ --h ], pivot ) > 0 ) { }
                if( l < h )
                    swap( array, l, h );
                else
                    break;
            }
            swap( array, l, right - 1 );   // Restore pivot

            quicksort( array, comparator, left, l - 1 );    // Sort small elements
            quicksort( array, comparator, l + 1, right );   // Sort large elements
        }
        else  // Do an insertion sort on the subarray (since insertion sort is faster with smaller array
            insertionSort( array, comparator, left, right );
    }

    private static <E> void swap(E[ ] a, int index1, int index2 ) {
        E tmp = a[ index1 ];
        a[ index1 ] = a[ index2 ];
        a[ index2 ] = tmp;
    }

    private static <E> void insertionSort(E[ ] array, Comparator<E> comparator, int left, int right ) {
        for( int p = left + 1; p <= right; p++ ) {
            E firstUnsortedValue = array[ p ];
            int j; //index to insert the firstUnsortedValue
            for( j = p; j > left && comparator.compare( firstUnsortedValue, array[ j - 1 ] ) < 0; j-- )
                array[ j ] = array[ j - 1 ]; //shift data to right
            array[ j ] = firstUnsortedValue; //place it to j
        }
    }

    private static <E> E median3(E[] array, Comparator<E> comparator, int left, int right){
        int center = ( left + right ) / 2;
        if( comparator.compare(array[ center ], array[ left ] ) < 0 ) //center is smaller than left
            swap( array, left, center );
        if( comparator.compare(array[ right ], array[ left ] ) < 0 ) //right is smaller than left
            swap( array, left, right );
        if( comparator.compare(array[ right ], array[ center ] ) < 0 ) //right is smaller than center
            swap( array, center, right );

        // Now center is pivot
        // but place the pivot at position right - 1
        swap( array, center, right - 1 );
        return array[ right - 1 ]; //pivot is at the right - 1!
    }

}