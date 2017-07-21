package ir.phgint;

import ir.phgint.Enum.*;

import java.io.Serializable;

public abstract class Mammals extends Janevaran implements DeepCopyable, ShallowCopyable {

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


    protected static Mammals getMammalsInstance(ObjectType objectType, Profile profile)
    {
        if (objectType == ObjectType.ANIMALS)
            return Animals.getAnimalsInstance(profile);
        if (objectType == ObjectType.HUMANS)
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

    public int hashCode() {
        int hash = super.hashCode();
        hash = 31 * hash + (this.hasHair == true ? 1 : 0);
        hash = 31 * hash + (this.hasBackbone == true ? 1 : 0);
        return hash;
    }

    public Mammals clone() throws CloneNotSupportedException {
        return (Mammals) super.clone();
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "hasHair=" + hasHair +
                ", hasBackbone=" + hasBackbone +
                '}';
    }
    //I know this part is incorrect
    public void deepCopyFrom(Mammals mammals) throws CloneNotSupportedException {

        super.deepCopyFrom(mammals);
    }
    //I know this part is incorrect
    public Mammals deepCopy() throws CloneNotSupportedException {

       return (Mammals) super.deepCopy();
       //return this;
    }

    public void shallowCopyFrom(Mammals mammals) {

        this.hasHair = mammals.hasHair;
        this.hasBackbone = mammals.hasBackbone;
    }

    public Mammals shallowCopy() throws CloneNotSupportedException {

        Mammals j = this.clone();
        j.hasHair = this.hasHair;
        j.hasBackbone = this.hasBackbone;
        return j;
    }


    public int compareTo(Mammals o) {
        int res = super.compareTo(o);
        if (res==0)
        {
            if (hasHair == o.hasHair && hasBackbone == o.hasBackbone)
                return 0;
//            if (this.equals(o))
//                return 0;

        }
        return res;

    }

}
