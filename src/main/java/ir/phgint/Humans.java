package ir.phgint;



public class Humans extends Mammals {

    private A.Ages age;
    private G.Gender gender;


    private Humans(Profile profile) {
        super(profile);
    }

    private Humans(String name, G.Gender gender, A.Ages age, F.Foods foods, String t, H.Habitats habitats,
                   P.Pregnant pregnant, boolean hasHair, boolean hasBackbone) {
        super(name, foods, t, habitats, pregnant, hasHair, hasBackbone);
        this.age = age;
        this.gender = gender;
    }

    private Humans(Humans humans) {
        super(humans);
        age = humans.age;
        gender = humans.gender;
    }

    public static Humans getHumansInstance(Profile profile) {
        return new Humans(profile);
    }

    public void setAge(A.Ages age) {
        this.age = age;
    }

    public A.Ages getAge() {
        return age;
    }

    public void setGender(G.Gender gender) {
        this.gender = gender;
    }

    public G.Gender getGender() {
        return gender;
    }


    public F.Foods eat(F.Foods food) {
        if (food.equals(F.Foods.Carnivorous))
            return F.Foods.Carnivorous;
        else if (food.equals(F.Foods.Vegetarian))
            return F.Foods.Vegetarian;
        else
            return F.Foods.Unknown;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Humans{");
        sb.append("age=").append(age);
        sb.append(", gender=").append(gender);
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Humans humans) {
        if (humans == this)
            return true;
        if (humans == null)
            return false;
        return super.equals(humans) && (this.age == humans.age) && (this.gender == humans.gender);
    }
    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 31 * hash + (this.age != null ? this.age.hashCode() : 0);
        hash = 31 * hash + (this.gender != null ? this.gender.hashCode() : 0);
        return hash;
    }

    public void deepCopyFrom(Humans humans) {

        super.deepCopyFrom(humans);
        this.gender = humans.gender;
        this.age = humans.age;

    }

    public Humans clone() throws CloneNotSupportedException {
        Humans hh = (Humans) super.clone();
        hh.gender = gender;
        hh.age = age;
        return hh;
    }

    public Humans deepCopy() {

        Humans humans = (Humans) super.deepCopy();
        humans.gender = this.gender;
        humans.age = this.age;
        return humans;

    }

    public void shallowCopyFrom(Humans humans) {

        super.shallowCopyFrom(humans);
        this.gender = humans.gender;
        this.age = humans.age;
    }

    public Humans shallowCopy() {

        Humans h = (Humans) super.shallowCopy();
        h.gender = this.gender;
        h.age = this.age;
        return h;
    }

    public int compareTo(Humans o) {
        int res = super.compareTo(o);
        if (res == 0) {
            if (gender != null) {
                if (gender.compareTo(o.gender) > 0)
                    return 1;
                else if (gender.compareTo(o.gender) < 0)
                    return -1;
                else {
                    if (age != null)
                        if (age.compareTo(o.age) > 0)
                            return 1;
                        else if (age.compareTo(o.age) < 0)
                            return -1;
                        else return 0;
                }
            }
        }
        return res;
    }
}

