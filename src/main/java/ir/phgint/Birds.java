package ir.phgint;

import ir.phgint.Enum.*;

import java.io.Serializable;


public class Birds extends Janevaran{
    private boolean canFly;
    private boolean hasFeather;

    private Birds(Profile profile) {
        super(profile);
    }
    private Birds(String name, boolean canFly, boolean hasFeather, Foods foods, String t, Habitats habitats, Pregnant pregnant) {
        super(name, foods, t, habitats, pregnant);
        this.canFly = canFly;
        this.hasFeather = hasFeather;

    }

    private Birds(Birds birds) {
        super(birds);
        canFly = birds.canFly;
        hasFeather = birds.hasFeather;
    }


    protected static Birds getBirdsInstance(Profile profile){
        return new Birds(profile);
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
        return "Birds{" +
                "canFly=" + canFly +
                ", hasFeather=" + hasFeather +
                '}';
    }

    public boolean equals(Birds birds) {

        if ( birds== this)
            return true;
        if(birds==null)
            return false;

        return super.equals(birds)&&  (this.canFly == birds.canFly)&& (this.hasFeather == birds.hasFeather);
    }

    public int hashCode() {
        int hash = super.hashCode();
        hash = 31 * hash + (this.canFly == true ? 1 : 0);
        hash = 31 * hash + (this.hasFeather == true ? 1 : 0);
        return hash;
    }

    public Birds clone() throws CloneNotSupportedException {
        return (Birds) super.clone();
    }

    public void deepCopyFrom(Birds birds)  {

        Birds bird=new Birds(birds);

    }

    public Birds deepCopy()  {

        return new Birds(this);
    }

    public void shallowCopyFrom(Birds birds) {

        this.canFly =birds.canFly;
        this.hasFeather=birds.hasFeather;
    }

    public Birds shallowCopy() {

        Birds j = new Birds(this);
        j.canFly = this.canFly;
        j.hasFeather=this.hasFeather;
        return j;
    }

    public int compareTo(Birds o) {

        int res= super.compareTo(o) ;
        if(res==0)
        {
            if(canFly==o.canFly && hasFeather==o.hasFeather)
              return 0;
        }
        return res;


    }
}
