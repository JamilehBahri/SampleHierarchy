package ir.phgint;

import ir.phgint.Janevaran.*;

public class BirdsBuilder {

    private Profile profile;
    private Birds birds;

    public static BirdsBuilder getBirdsInstance(Birds birds) {
        return new BirdsBuilder(birds);
    }

    public static BirdsBuilder getBirdsInstance(Profile profile) {
        return new BirdsBuilder(profile);
    }

    public static BirdsBuilder getBirdsInstance(Birds birds, Profile profile) {
        return new BirdsBuilder(birds, profile);
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
        a.setProfile(profile);
        return a;
    }

    private BirdsBuilder(Birds birds, Profile pb) {

        birds.setCanFly(birds.getCanFly());
        birds.setHasFeather(birds.getHasFeather());
        profile = pb;
    }

    private BirdsBuilder(Birds birds) {

        birds.setCanFly(birds.getCanFly());
        birds.setHasFeather(birds.getHasFeather());
    }

    private BirdsBuilder(Profile pb) {

        profile = pb;
    }


}
