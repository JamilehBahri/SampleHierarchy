package ir.phgint.Classes;

public abstract class Mammals extends Janevaran {

    private boolean hasHair;
    private boolean hasBackbone;

    protected Mammals(Profile profile) {
        super(profile);
    }


    protected Mammals(String name, Foods foods, String t, Habitats habitats, Pregnant pregnant, boolean hasHair, boolean hasBackbone) {
        super(name, foods, t, habitats, pregnant);
        this.hasHair = hasHair;
        this.hasBackbone = hasBackbone;
    }

    protected Mammals(Mammals mammals) {
        super(mammals);
        hasHair = mammals.hasHair;
        hasBackbone = mammals.hasBackbone;
    }

    public Mammals() {
        super();

    }


    public static Mammals getMammalsInstance(ObjectType objectType, Profile profile) {
        if (objectType == ObjectType.ANIMALS)
            return Animals.getAnimalsInstance(profile);
        else if (objectType == ObjectType.HUMANS)
            return Humans.getHumansInstance(profile);
        return null;
    }

    public void setHasHair(boolean hair) {
        this.hasHair = hair;
    }

    public boolean getHasHair() {
        return hasHair;
    }

    public void setHasBackbone(boolean backbone) {
        this.hasBackbone = backbone;
    }

    public boolean getHasBackbone() {
        return hasBackbone;
    }


    public boolean equals(Mammals mammals) {

        if (mammals == this)
            return true;
        if (mammals == null)
            return false;
        return super.equals(mammals) && (this.hasHair == mammals.hasHair) && (this.hasBackbone == mammals.hasBackbone);
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 31 * hash + (this.hasHair == true ? 1 : 0);
        hash = 31 * hash + (this.hasBackbone == true ? 1 : 0);
        return hash;
    }

    @Override
    public Mammals clone() throws CloneNotSupportedException {
        Mammals mm = (Mammals) super.clone();
        mm.hasBackbone = hasBackbone;
        mm.hasHair = hasHair;
        return mm;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Mammals{");
        sb.append("hasHair=").append(hasHair);
        sb.append(", hasBackbone=").append(hasBackbone);
        sb.append('}');
        return sb.toString();
    }


    public void deepCopyFrom(Mammals mammals) {

        super.deepCopyFrom(mammals);
        this.hasHair = mammals.hasHair;
        this.hasBackbone = mammals.hasBackbone;
    }

    public Mammals deepCopy() {
        Mammals mammals = (Mammals) super.deepCopy();
        mammals.hasHair = this.hasHair;
        mammals.hasBackbone = this.hasBackbone;
        return mammals;
    }

    public void shallowCopyFrom(Mammals mammals) {

        super.shallowCopyFrom(mammals);
        this.hasHair = mammals.hasHair;
        this.hasBackbone = mammals.hasBackbone;
    }

    public Mammals shallowCopy() {

        Mammals j = (Mammals) super.shallowCopy();
        j.hasHair = this.hasHair;
        j.hasBackbone = this.hasBackbone;
        return j;
    }

    public int compareTo(Mammals o) {
        int res = super.compareTo(o);
        if (res == 0) {
            if ((Boolean.valueOf(hasHair).compareTo(Boolean.valueOf(o.hasHair))) > 0)
                return 1;
            else if ((Boolean.valueOf(hasHair).compareTo(Boolean.valueOf(o.hasHair))) < 0)
                return -1;
            else {
                if (Boolean.valueOf(hasBackbone).compareTo(Boolean.valueOf(o.hasBackbone)) > 0)
                    return 1;
                else if (Boolean.valueOf(hasBackbone).compareTo(Boolean.valueOf(o.hasBackbone)) < 0)
                    return -1;
                else return 0;
            }
        }
        return res;
    }
}
