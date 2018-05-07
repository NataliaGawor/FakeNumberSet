public class Main {

    public static void main(String[] args) throws Exception {

        NumberSet set =new NumberSet();

        set.add(7);
        set.add(4);
        set.add(7);
        set.add(6);
        set.add(2);
        set.add(0);
        set.add(2);
        set.add(1);
        set.add(2);

        set.print();

        set.remove(2);
        set.remove(75);

        set.print();

        System.out.println(set.contains(51));

        set.divideAllElementsBy(2);
        System.out.print("\n");

        System.out.println("RANDOM NUMBER: "+set.getRandomValue());

        set.print();

        System.out.println(set.getSize());

        System.out.println(set.getSumOfElements());
    }
}
