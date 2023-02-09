package January18.interfaceDemos.edible;

public interface Edible {


     void eat(); // all interface methods are public and abstract by default


     // 2 benefits of interfaces over abstract classes:

     // a) abstract classes are restricted with "IS-A" relationship
     //   meaning subclasses should be related (Subclass of Fruit should be some kind of Fruit like Apple)
     // Interface implementing classes do not have to be related since they represent "CAN-DO" relationship
     //  Edible can be implemented by Apple or Chicken or anything that is edible

     //  b) Classes cannot have more than one abstract super class
     //  But they can implement as many interfaces as they can
     // In that sense interfaces allow multiple inheritance whereas it is not possible with abstract classes




}
