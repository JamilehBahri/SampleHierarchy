package ir.phgint;


public interface DeepCopyable {
    void deepCopyFrom(Janevaran janevaran) throws CloneNotSupportedException;
    Janevaran deepCopy() throws IllegalAccessException, InstantiationException, CloneNotSupportedException;
}
