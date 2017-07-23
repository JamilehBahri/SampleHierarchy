package ir.phgint;
import ir.phgint.Janevaran.*;

public class HumansBuilder {

    private Profile profile;
    private Humans humans;

    public static HumansBuilder getHumansInstance(Humans humans) {
        return new HumansBuilder(humans);
    }

    public static HumansBuilder getHumansInstance(Profile profile) {
        return new HumansBuilder(profile);
    }

    public static HumansBuilder getHumansInstance(Humans humans, Profile profile) {
        return new HumansBuilder(humans, profile);
    }

    public HumansBuilder age(Ages a) {
        humans.setAge(a);
        return this;
    }
    public HumansBuilder hasFeather(Gender g) {
        humans.setGender(g);
        return this;
    }

    public Humans build() {
        Humans a = Humans.getHumansInstance(profile);
        a.setProfile(profile);
        return a;
    }

    private HumansBuilder(Humans humans, Profile pb) {

        humans.setAge(humans.getAge());
        humans.setGender(humans.getGender());
        profile = pb;
    }

    private HumansBuilder(Humans humans) {

        humans.setAge(humans.getAge());
        humans.setGender(humans.getGender());
    }

    private HumansBuilder(Profile pb) {

        profile = pb;
    }


}
