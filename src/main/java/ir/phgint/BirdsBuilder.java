package ir.phgint;

import ir.phgint.Janevaran.*;

import java.security.InvalidParameterException;

public class BirdsBuilder {

    private Profile profile;
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
        Birds a = Birds.getBirdsInstance(profile);
        if (a == null) throw new NullPointerException("Profile Is Null");
        a.setProfile(profile);
        return a;
    }

    private BirdsBuilder(Birds birds, Profile pb) {

        if (birds != null) {
            birds.setCanFly(birds.getCanFly());
            birds.setHasFeather(birds.getHasFeather());
            if (birds.getCanFly() == true && birds.getHasFeather() == false) {
                throw new InvalidParameterException("CanFly  true  , HasFeather  False");
            }
        }  if (pb != null)
            profile = pb;
        else {
            canFly(birds.getCanFly());
            hasFeather(birds.getHasFeather());
        }
    }


}
