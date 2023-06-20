package GenericArrayClass;

public class MyList<T> {
    private T[] Array;
    private int capacity;
    private int size = 0;

    public MyList() {
        setCapacity(10);
        setArr(new Object[getCapacity()]);
    }

    public MyList(int capacity) {
        setCapacity(capacity);
        setArr(new Object[getCapacity()]);
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public int lastIndexOf(T value) {
        for (int i = Array.length - 1; i > 0; i--) {
            if (Array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int indexOf(T value) {
        for (int i = 0; i < size(); i++) {
            if (Array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public MyList<T> subList(int start, int finish) {
        MyList<T> subList = new MyList(finish - start);

        for (int i = start; i < finish; i++) {
            subList.add(this.Array[i]);
        }
        return subList;
    }
    public boolean contains(T value){
        for (int i = 0; i < size(); i++){
            if (value == this.Array[i]){
                return true;
            }
        }
        return false;
    }

    public Object[] toArray() {
        Object[] newArray = new Object[size()];
        for (int i = 0; i < size(); i++) {
            newArray[i] = this.get(i);
        }
        return newArray;
    }

    public void clear() {
        for (int i = 0; i < size(); i++) {
            Array[i] = null;
        }
        setSize(0);
    }

    @Override
    public String toString() {
        System.out.print("[");
        for (int i = 0; i < size(); i++) {
            System.out.print(Array[i] + ",");
        }
        return "]";
    }

    public Object set(int index, T value) {
        if (index > 0 && index < size()) {
            for (int i = index; i < index + 1; i++) {
                Array[i] = value;
            }
            return Array[index];
        }
        return null;
    }

    public Object remove(int index) {
        if (index > 0 && index < size()) {
            for (int i = index; i < (size() - 1); i++) {
                Array[i] = Array[i + 1];
            }
            this.size--;
            return Array[index];
        }
        return null;
    }

    public Object get(int index) {
        for (int i = 0; i < size(); i++) {
            if (index == i) {
                return this.Array[i];
            }
        }
        return null;
    }

    public void add(T value) {
        if (size() == getCapacity()) {
            setCapacity(getCapacity() * 2);
            Object[] newArray = new Object[getCapacity()];
            for (int i = 0; i < size(); i++) {
                newArray[i] = this.Array[i];
            }
            this.setArr(newArray);
        }
        this.Array[size] = value;
        this.size++;
    }

    public T[] getArr() {
        return Array;
    }

    public void setArr(Object[] arr) {
        this.Array = (T[]) arr;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int size() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
