/* Design number of lights in a house - Use a base class as home which has a method noOfLights .
Subclasses should have the rooms and the method should print the number of lights in the room */

/*Create a parent class called home and have a method called number of lights .
Create multiple classes which would be the rooms which extends the parent class .
Override the method created in parent class and print the number of lights in room accordingly*/

public class HomeBase {
    String name = "Home";
    int numOfRooms = 1;
    int lightsPerRoom = 4;     //value fixed for all Subclasses
    void noOfLights() {
        System.out.println("Total lights in " + name + "= " + numOfRooms * lightsPerRoom);
    }
}

class MansionHome extends HomeBase {
    String name = "Mansion";
    MansionHome(int numOfRooms){
       this.numOfRooms = numOfRooms;
    }
    void noOfLights() {
        System.out.println("Total lights in " + name + "= " + numOfRooms * lightsPerRoom);
    }
}

class IndependentHome extends HomeBase {
    String name = "Independent";
    IndependentHome(int numOfRooms){
        this.numOfRooms = numOfRooms;
    }
    void noOfLights() {
        System.out.println("Total lights in " + name + "= " + numOfRooms * lightsPerRoom);
    }
}

class DuplexHome extends HomeBase {
    String name = "Duplex";
    DuplexHome(int numOfRooms){
        this.numOfRooms = numOfRooms;
    }
    void noOfLights() {
        System.out.println("Total lights in " + name + "= " + numOfRooms * lightsPerRoom);
    }
}
class HomeBaseTest {
    public static void main(String[] args) {
        //HomeBase
        HomeBase myHome = new HomeBase();
        myHome.noOfLights();

        // Mansion
        MansionHome mansionHome = new MansionHome(3);
        mansionHome.noOfLights();

        // Independent room
        IndependentHome independentHome = new IndependentHome(4);
        independentHome.noOfLights();

        // Duplex room
        DuplexHome duplexHome = new DuplexHome(5);
        duplexHome.noOfLights();
    }
}