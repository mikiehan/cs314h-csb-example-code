package generics;
public class MyList<Type>{
    private Type[] array;
    private int size = 0;
    private static final int CAPACITY = 1024;

    public MyList() {
        this.array = (Type[]) new Object[CAPACITY];
    }

    public Type get(int i){
        if(size <= i) {
            return null;
        }
        return array[i];
    }

    public void add(Type item){
        if(size == CAPACITY) return;
        array[size] = item;
        size++;
    }
}
