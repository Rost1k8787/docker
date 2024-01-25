public class InOrderTest {
    public static void main(String[] args) {
        FunList list = new Cons(3, new Cons(5, new Cons(8, Empty.UniqueInstance())));

        FunList result = list.insertInOrder(4);

        System.out.println("Original List: " + list);
        System.out.println("Result: " + result);
    }
}
