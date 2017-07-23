package ir.phgint;

public interface ShallowCopyable {
    void shallowCopyFrom(Janevaran janevaran);
    Janevaran shallowCopy() throws CloneNotSupportedException;
}
