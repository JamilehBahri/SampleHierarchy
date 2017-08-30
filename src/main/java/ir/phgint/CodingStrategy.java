package ir.phgint;

public interface CodingStrategy <T> {

    public T serialize(Object obj);
    public Object deserialize(T data);

}
