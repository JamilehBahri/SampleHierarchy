package ir.phgint;

/**
 * Created by Jamile on 09/06/2017.
 */
public interface DeepCopyable {
    void deepCopyFrom(Janevaran janevaran) throws CloneNotSupportedException;
    Janevaran deepCopy() throws IllegalAccessException, InstantiationException, CloneNotSupportedException;
}
