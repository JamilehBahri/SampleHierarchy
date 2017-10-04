package ir.phgint.Copyables;


public interface DeepCopyable<T> {

    void deepCopyFrom(T obj) throws CloneNotSupportedException;
    T deepCopy() throws CloneNotSupportedException;
}
