package ir.phgint;

/**
 * Created by Jamile on 09/06/2017.
 */
public interface ShallowCopyable {
    void shallowCopyFrom(Janevaran janevaran);
    Janevaran shallowCopy() throws CloneNotSupportedException;
}
