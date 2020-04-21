import java.util.ArrayList;

public class ArrayListMadeByMe<T> {
    private static int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object[] elements = new Object[DEFAULT_CAPACITY];
    public void ensureCapacity(){
        Object [] newArrays = new Object[elements.length+10];
        for (int i=0; i<elements.length; i++){
            newArrays[i] = elements[i];
        }
        elements = newArrays;
    }
    public void add(T data){
        if(size>=elements.length) ensureCapacity();
        this.elements[size] = data;
        size++;
    }
    public void add(int index, T data){
        if (index<0||index>=elements.length) throw new RuntimeException("Index is illegal");
        if(size>elements.length) ensureCapacity();
        for (int i= elements.length-1; i>index; i--) elements[i] = elements[i-1];
        this.elements[index] = data;
        size++;
    }
    public void remove(int index){
        if (index<0||index>=size) throw new RuntimeException("Index is illegal");
        for (int i=index; i<size-1; i++){
            elements[i] = elements[i+1];
        }
        size--;
    }
    public int size(){
        return size;
    }
    public Boolean contains(T data){
        for (int i=0; i<size; i++){
            if(elements[i] == data) return true;
        }return false;
    }
    public int indexOf(T data){
        for (int i=0; i<size; i++){
            if (elements[i] == data) return 0;
        }return -1;
    }
    public Object cloneList(){
        Object[] cloneList = new Object[size];
        for (int i=0; i<size; i++){
            cloneList[i] = elements[i];
        }return cloneList;
    }
    public T get(int index){
        if (index<0||index>=size) throw new RuntimeException("Index is illegal");
        return (T) elements[index];
    }
    public void clear(){
        Object[] elements = new Object[DEFAULT_CAPACITY];
    }

}
