package generics;
public class MyList<T>{
    private T[] array;
    private int size = 0;
    private static final int CAPACITY = 1024;

    public MyList() {
        this.array = (T[]) new Object[CAPACITY];
    }

    public T get(int i){
        if(size <= i) {
            return null;
        }
        return array[i];
    }

    public void add(T item){
        if(size == CAPACITY) return;
        array[size] = item;
        size++;
    }
}
