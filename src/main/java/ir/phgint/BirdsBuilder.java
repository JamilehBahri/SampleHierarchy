package ir.phgint;

import ir.phgint.Janevaran.*;

import java.security.InvalidParameterException;

public class BirdsBuilder {

    private Birds birds;




    public static BirdsBuilder getBirdsInstance(Birds birds) {
        return new BirdsBuilder(birds, null);
    }

    public static BirdsBuilder getBirdsInstance(Profile profile) {
        return new BirdsBuilder(null, profile);
    }

    public static BirdsBuilder getBirdsInstance(Birds birds, Profile profile) {
        return new BirdsBuilder(birds, profile);
    }

    public static BirdsBuilder getBirdsInstance() {
        return new BirdsBuilder(null, null);
    }


    public BirdsBuilder canFly(boolean x) {
        birds.setCanFly(x);
        return this;
    }

    public BirdsBuilder hasFeather(boolean y) {
        birds.setHasFeather(y);
        return this;
    }

    public Birds build() {


        if (birds.getCanFly() && !birds.getHasFeather()) {
            throw new InvalidParameterException("CanFly  true  , HasFeather  False");
        }
        return birds;
    }

    private BirdsBuilder(Birds b, Profile pb) {

        if (b != null) {
            birds = Birds.getBirdsInstance(b);
        } else if (pb != null)
            birds = Birds.getBirdsInstance(pb);
        else if (b != null && pb != null){
            birds = Birds.getBirdsInstance(pb, b);
        }
        else {
            birds = Birds.getBirdsInstance();
        }
    }


}
