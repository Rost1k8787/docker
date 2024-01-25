/**
 * Mimics functional empty list.
 * @author Vyacheslav Moskalenko
 * @since JDK1.4
 */
 
public class Empty extends FunList {

    public Empty() {}

    public int car() {
        throw new java.util.NoSuchElementException("car requires a non Empty Funlist");
    }

    public FunList cdr() {
        throw new java.util.NoSuchElementException("cdr requires a non Empty Funlist");
    }

    String toStringHelp() {
        return "";
    }
}
