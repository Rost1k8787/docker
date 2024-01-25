public class AppendTest {
    public static void main(String[] args) {
        FunList list1 = new Cons(1, new Cons(2, Empty.UniqueInstance()));
        FunList list2 = new Cons(3, new Cons(4, Empty.UniqueInstance()));

        FunList result = list1.append(list2);

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Result: " + result);
    }
}
