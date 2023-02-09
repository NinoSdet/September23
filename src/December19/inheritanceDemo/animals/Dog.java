package December19.inheritanceDemo.animals;

public class Dog extends Animal{

    boolean canBeDomesticated;

    public boolean isCanBeDomesticated() {
        return canBeDomesticated;
    }

    public void setCanBeDomesticated(boolean canBeDomesticated) {
        this.canBeDomesticated = canBeDomesticated;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "canBeDomesticated=" + canBeDomesticated +
                "} ";
    }
}
