package GenericArrayClass;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> k = new MyList<>(3);
        k.add(1);
        k.add(2);
        k.add(3);
        k.add(4);
        k.add(5);
        k.add(4);

        System.out.println("size: " + k.size());
        System.out.println("capatiy: " + k.getCapacity());
        System.out.println(k.get(2));
        System.out.println(k.toString());
        System.out.println(k.indexOf(2));
        System.out.println(k.lastIndexOf(4));
        System.out.println(k.isEmpty());
        Object[] dizi = k.toArray();
        System.out.println(dizi[4]);
        //k.clear();
        System.out.println(k.toString());
        MyList<Integer> a = k.subList(1,4);
        System.out.println(a.toString());
        System.out.println(a.contains(5));
    }
}