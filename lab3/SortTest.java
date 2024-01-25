public class SortTest {
    public static void main(String[] args) {
        FunList list = new Cons(7, new Cons(2, new Cons(5, Empty.UniqueInstance())));

        FunList result = list.sort();

        System.out.println("Original List: " + list);
        System.out.println("Sorted List: " + result);
    }
}
