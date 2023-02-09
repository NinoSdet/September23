package January13.example4;

public  abstract class Animal {  // abstract class can be empty or have no abstract methods at all

    public void nonabstractMethod(){

    }


    protected abstract void move(); // private and abstract, final and abstract are incompatible

     abstract int calculateAnimalAge();
}
  // abstract classes cannot be final since final classes cannot be extended and abstract classes are intended to be extended
  // final abstract ->  Illegal combination of modifiers: 'abstract' and 'final'
