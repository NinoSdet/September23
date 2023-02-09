package December19.inheritanceDemo.animals;

public class Snake extends Animal{


    boolean isVenomous;
    boolean canShedSkin;

    boolean canCamouflage;

    public boolean isVenomous() {
        return isVenomous;
    }

    public void setVenomous(boolean venomous) {
        isVenomous = venomous;
    }

    public boolean isCanShedSkin() {
        return canShedSkin;
    }

    public void setCanShedSkin(boolean canShedSkin) {
        this.canShedSkin = canShedSkin;
    }

    public boolean isCanCamouflage() {
        return canCamouflage;
    }

    public void setCanCamouflage(boolean canCamouflage) {
        this.canCamouflage = canCamouflage;
    }

    @Override
    public String toString() {
        return "Snake{" +
                "isVenomous=" + isVenomous +
                ", canShedSkin=" + canShedSkin +
                ", canCamouflage=" + canCamouflage +
                "} ";
    }
}
