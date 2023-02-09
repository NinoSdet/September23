/* Create a class Student with the following:

  Variables (private):
  -firstName
  -lastName
  -id (the type should be String)

   Constructor:
  - initializes firstName and lastName

  Methods:
  -getters and setters
  -generateId() - abstract method, subclass logic is to generate specific id for the student and return it as a String.
  -toString() - override it to return firstName and lastName


Create a class OnlineStudent as a subclass of Student with the following:

  Variables (private):
  String state

   Constructor:
  - initializes firstName and lastName and state
  - also in the body of the constructor initialize the id by calling the generateId() method


  Methods:
  -public String generateId() - override super class's method -> student's first and last name's first 3 letters + state
   Example: "Joe Biden" and "DE"   ->  joebidde
  -toString() override Student class's toString to add id and state


  Create a class OnCampusStudent as a subclass of Student with the following:

  Variables (private):
  int badgeNo

   Constructor:
  - initializes firstName and lastName and badgeNo
  - also in the body of the constructor initialize the id by calling the generateId() method


  Methods:
  -public String generateId() - override super class's method -> student's first and last name's first 3 letters + badgeNo
   Example: "Joe Biden" badgeNo - 122  -> joebid122
  -toString() override Student class's toString to add badgeNo and id


  In the Main class:

   Create a List of Students.
   Add 4 different students(both online and oncampus) to the list.
   Use a loop to go through your List and call each object's toString() method
*/
package January13;

import java.util.ArrayList;

public class Classtask067a {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new OnCampusStudent("Nick", "Jones", 12));
        students.add(new OnCampusStudent("Valerie", "Smith", 1));
        students.add(new OnlineStudent("Dennis", "Wallas", "MD"));
        students.add(new OnlineStudent("Michael", "Jordan", "Ca"));

        for (Student student: students){
            System.out.println(student.toString());
        }
    }
}
