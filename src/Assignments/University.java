package Assignments;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class University {
    //independent list of departments and colleges, declared private
    private List<String> departments = List.of("IT", "CS", "MECH", "ECE", "EEE", "AERO", "AUTO", "EI");
    private List<String> colleges = List.of("University of Delhi", "IIT Bombay", "Banaras Hindu University", "Jawaharlal Nehru University", "BITS Pilani");
    //key value pair of departments by college.

    private Map<String, List<String>> colMap = new HashMap<>();

    //constructor for class University
    public University(){
        //initializing data into hash map
        colMap.put("University of Delhi", List.of("IT", "CS", "MECH"));
        colMap.put("IIT Bombay", List.of("ECE", "EEE", "AERO", "AUTO", "EI"));
        colMap.put("Banaras Hindu University", List.of("AERO", "AUTO", "EI"));
        colMap.put("Jawaharlal Nehru University", List.of("IT", "ECE", "EEE", "AERO"));
        colMap.put("BITS Pilani", List.of("IT", "CS", "MECH", "ECE", "EEE", "AERO", "AUTO", "EI"));
    }

    public String getColleges(){
        return String.join(",", colleges);
    }

    public String getDepartments(){
        return String.join(",", departments);
    }

    //to print college hash map data
    public void printAllStreams(){
        for(String college: colMap.keySet()){
            System.out.println(college + " has following departments: " + String.join(",", colMap.get(college)));
        }
    }
}

class UniversityTest{
    public static void main(String[] args){
        University university = new University();
        System.out.println("List of colleges: " + university.getColleges());
        System.out.println("List of departments: " + university.getDepartments());
        System.out.println();
        university.printAllStreams();
    }
}
