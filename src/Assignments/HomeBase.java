/* Design number of lights in a house - Use a base class as home which has a method noOfLights .
Subclasses should have the rooms and the method should print the number of lights in the room */

/*Create a parent class called home and have a method called number of lights .
Create multiple classes which would be the rooms which extends the parent class .
Override the method created in parent class and print the number of lights in room accordingly*/

public class HomeBase {
    String name = "Home";
   // int numOfRooms;
    int lightsPerRoom = 4;
    void noOfLights() {
        System.out.println("Total lights in " + name + "= " + lightsPerRoom);
    }
}

class MansionHome extends HomeBase {
    String name = "Mansion";
    int numOfRooms = 20;
    void noOfLights() {
        System.out.println("Total lights in " + name + "= " + numOfRooms * lightsPerRoom);
    }
}

class IndependentHome extends HomeBase {
    String name = "Independent";
    int numOfRooms = 3;
    void noOfLights() {
        System.out.println("Total lights in " + name + "= " + numOfRooms * lightsPerRoom);
    }
}

class DuplexHome extends HomeBase {
    String name = "Duplex";
    int numOfRooms = 4;
    void noOfLights() {
        System.out.println("Total lights in " + name + "= " + numOfRooms * lightsPerRoom);
    }
}

class HomeBaseTest {
    public static void main(String[] args) {

     //   HomeBase myHome = new MansionHome();
     //   myHome.noOfLights();
        // Mansion
        MansionHome mansionHome = new MansionHome();
        mansionHome.noOfLights();

        // Independent room
        IndependentHome independentHome = new IndependentHome();
        independentHome.noOfLights();

        // Duplex room
        DuplexHome duplexHome = new DuplexHome();
        duplexHome.noOfLights();
    }
}