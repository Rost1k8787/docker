/**
 * Mimics fundamental function cons for constructs memory objects which hold
 * two values or pointers to values
 * @author Vyacheslav Moskalenko
 * @since JDK1.4
 */
public class Cons extends FunList {

    private int _dat;
    private FunList _cdr;

    public Cons(int carDat, FunList cdr) {
        _dat = carDat;
        _cdr = cdr;
    }

    /**
     * @param i a left side (head) of the list.
     */
    public Cons(int i) {
        _dat = i;
        _cdr = new Empty();
    }

    /**
     * @return the first int in the list object
     */
    public int car() {
        return _dat;
    }

    /**
     * @return the tail (all but the first element) of the list object
     */
    public FunList cdr() {
        return _cdr;
    }

    /**
     * @return a String description of the list object
     */
    String toStringHelp() {
        return " " + _dat + _cdr.toStringHelp();
    }
}
