package by.paulent1y;

public class GenericBox <T, V>{
    public T obj1;
    public V obj2;

    public GenericBox(T оbj1, V obj2) {
        this.obj1 = оbj1;
        this.obj2 = obj2;

    }

    public T getObj1() {
        return obj1;
    }
    public V getObj2() {
        return obj2;
    }

    //public V getSum<V> ( obj2)
    public void showType() {
        System.out.println("Type T: " + obj1.getClass().getName());
        System.out.println("Type T: " + obj2.getClass().getName());
    }

}
