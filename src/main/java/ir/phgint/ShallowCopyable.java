package ir.phgint;

public interface ShallowCopyable <T> {
    void shallowCopyFrom(T obj);
    T shallowCopy() throws CloneNotSupportedException;
}
