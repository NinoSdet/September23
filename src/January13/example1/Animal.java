package January13.example1;

public abstract class Animal {


    // Abstraction -> hiding implementation details, and showing only what's important
                   //  instead of providing how, just provide what the method does

    /**
     * this method should be implemented by providing each animal specific noise
     */
    public abstract void makeNoise();
    // to make a method abstract, the body needs to be entirely omitted,
    // abstract keyword should be added
    // the method should be ended with semicolon



}
