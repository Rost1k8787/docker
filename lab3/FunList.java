/**
 * Mimics functional lists.
 * @author Moskalenko Vyacheslav
 * @since JDK1.4
 */
public abstract class FunList {

    /**
     * @return the first int in the list object
     */
    public abstract int car();

    /**
     * @return the tail (all but the first element) of the list object
     */
    public abstract FunList cdr();

    /**
     * NOTE: toString() method is NOT abstract. It calls, toStringHelp(),
     * an abstract method. It represents what we call an "invariant" behavior
     * for <code>FunList</code>. It is an example of the "Template Method Pattern".
     * A "template method" is a method that makes calls to at least one abstract
     * method in its own class.
     */
    public String toString() {
        return "(" + toStringHelp() + " ) ";
    };

    public FunList insertInOrder(int i) {
    if (isEmpty()) {
        return new Cons(i, Empty.UniqueInstance());
    } else if (i <= car()) {
        return new Cons(i, this);
    } else {
        return new Cons(car(), cdr().insertInOrder(i));
    }
   };

   public FunList sort() {
    if (isEmpty()) {
        return Empty.UniqueInstance();
    } else {
        return cdr().sort().insertInOrder(car());
    }
    }
    
    /**
     * @return a String description of the list object
     */

     return new Cons(car(), cdr().append(other));
    abstract String toStringHelp();
}
