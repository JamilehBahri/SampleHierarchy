package ir.phgint;

import java.util.Collection;
import java.util.List;


public class CopyUtils <T extends DeepCopyable<T>>{

    public void copy(List<? super T> dest,List<? extends T> src) {

        try {
            for (T obj : src)
            {
               T dObj = obj.deepCopy();
                dest.add(dObj);
            }

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }

}
