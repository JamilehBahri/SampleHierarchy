package ir.phgint.Classes;
import ir.phgint.Classes.Janevaran.*;

public class HumansBuilder {

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

        if (humans.getAge() == null) throw new NullPointerException("Age Is Null");
        if (humans.getGender() == null) throw new NullPointerException("Gender Is Null");
        return humans;
    }

    private HumansBuilder(Humans h, Profile pb) {


        if (h != null) {
            humans= Humans.getHumansInstance(h);
        } else if (pb != null)
            humans =Humans.getHumansInstance(pb);
        else if (h != null && pb != null){
            humans = Humans.getHumansInstance(pb, h);

        }
        else {
            humans = Humans.getHumansInstance();
        }
    }



}
