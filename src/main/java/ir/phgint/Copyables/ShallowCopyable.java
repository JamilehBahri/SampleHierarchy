package ir.phgint.Copyables;

public interface ShallowCopyable <T> {
    void shallowCopyFrom(T obj);
    T shallowCopy() throws CloneNotSupportedException;
}
