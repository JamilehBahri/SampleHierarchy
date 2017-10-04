package ir.phgint.Classes;



public class Birds extends Janevaran {
    private boolean canFly;
    private boolean hasFeather;

    private Birds(Profile profile) {
        super(profile);
    }

    private Birds(String name, boolean canFly, boolean hasFeather, Foods foods, String t, Habitats habitats,Pregnant pregnant) {
        super(name, foods, t, habitats, pregnant);
        this.canFly = canFly;
        this.hasFeather = hasFeather;

    }

    private Birds(Birds birds) {
        super(birds);
        canFly = birds.canFly;
        hasFeather = birds.hasFeather;
    }

    private Birds(Profile p , Birds birds) {
        super(p);
        this.canFly = birds.canFly;
        this.hasFeather = birds.hasFeather;
    }

    private Birds() {
        super();
    }

    public static Birds getBirdsInstance(Profile profile) {
        return new Birds(profile);
    }
    public static Birds getBirdsInstance(Profile profile,Birds birds) {
        return new Birds(profile , birds);
    }

    public static Birds getBirdsInstance(Birds birds) {
        return new Birds(birds);
    }

    public static Birds getBirdsInstance() {
        return new Birds();
    }



    public void setCanFly(boolean value) {
        this.canFly = value;
    }

    public boolean getCanFly() {
        return canFly;
    }

    public void setHasFeather(boolean value) {
        this.hasFeather = value;
    }

    public boolean getHasFeather() {
        return hasFeather;
    }


    public Foods eat(Foods food) {
        if (food.equals(Foods.Carnivorous))
            return Foods.Carnivorous;
        else if (food.equals(Foods.Vegetarian))
            return Foods.Vegetarian;
        else
            return Foods.Unknown;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Birds{");
        sb.append("canFly=").append(canFly);
        sb.append(", hasFeather=").append(hasFeather);
        sb.append('}');
        return sb.toString();
    }


    public boolean equals(Birds birds) {
        if (this == birds) return true;
        if (birds == null) return false;

        return super.equals(birds) && (this.canFly == birds.canFly) && (this.hasFeather == birds.hasFeather);
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 31 * hash + (this.canFly == true ? 1 : 0);
        hash = 31 * hash + (this.hasFeather == true ? 1 : 0);
        return hash;
    }


    public Birds clone() throws CloneNotSupportedException {
        Birds bb = (Birds) super.clone();
        bb.canFly = canFly;
        bb.hasFeather = hasFeather;
        return bb;
    }

    public void deepCopyFrom(Birds birds) {

        super.deepCopyFrom(birds);
        this.canFly = birds.canFly;
        this.hasFeather = birds.hasFeather;

    }

    public Birds deepCopy() {

        Birds birds = (Birds) super.deepCopy();
        birds.canFly = this.canFly;
        birds.hasFeather = this.hasFeather;
        return birds;

    }

    public void shallowCopyFrom(Birds birds) {

        super.shallowCopyFrom(birds);
        this.canFly = birds.canFly;
        this.hasFeather = birds.hasFeather;
    }

    public Birds shallowCopy() {

        Birds b = (Birds) super.shallowCopy();
        b.canFly = this.canFly;
        b.hasFeather = this.hasFeather;
        return b;
    }

    public int compareTo(Birds o) {

        int res = super.compareTo(o);
        if (res == 0) {
            if (Boolean.valueOf(canFly).compareTo(Boolean.valueOf(o.canFly)) > 0)
                return 1;
            else if (Boolean.valueOf(canFly).compareTo(Boolean.valueOf(o.canFly)) < 0)
                return -1;
            else {
                if (Boolean.valueOf(hasFeather).compareTo(Boolean.valueOf(o.hasFeather)) > 0)
                    return 1;
                else if (Boolean.valueOf(hasFeather).compareTo(Boolean.valueOf(o.hasFeather)) < 0)
                    return -1;
                else return 0;
            }
        }
        return res;
    }
}
