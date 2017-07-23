package ir.phgint;
import ir.phgint.Janevaran.*;

public class HumansBuilder {

    private Profile profile;
    private Humans humans;

    public static HumansBuilder getHumansInstance(Humans humans) {
        return new HumansBuilder(humans ,null);
    }

    public static HumansBuilder getHumansInstance(Profile profile) {
        return new HumansBuilder(null ,profile);
    }

    public static HumansBuilder getHumansInstance(Humans humans, Profile profile) {
        return new HumansBuilder(humans, profile);
    }

    public static HumansBuilder getHumansInstance() {
        return new HumansBuilder(null, null);
    }
    public HumansBuilder age(Ages a) {
        humans.setAge(a);
        return this;
    }
    public HumansBuilder gender(Gender g) {
        humans.setGender(g);
        return this;
    }

    public Humans build() {
        Humans a = Humans.getHumansInstance(profile);
        if (a == null) throw new NullPointerException("Profile Is Null");
        a.setProfile(profile);
        return a;
    }

    private HumansBuilder(Humans humans, Profile pb) {

        if (humans !=null)
        {
            humans.setAge(humans.getAge());
            humans.setGender(humans.getGender());
        }
        if(pb !=null)
        profile = pb;
        else
        {
            age(humans.getAge());
            gender(humans.getGender());

        }
    }



}
