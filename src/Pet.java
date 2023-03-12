/*
Name: Rodney Olid
Date: 3/19/2023
A pet class that creates a pet object and creates a text file with the pet information.
 */
import java.io.*;
import java.util.*;
public class Pet {
    String name, type;
    int age;
    static int total = 0;
    public Pet(){
        total++;
    }
    public Pet(String myName, int myAge, String myType){
        name = myName;
        type = myType;
        age = myAge;
        total++;
    }
    public static void main(String[] args) throws IOException {
        File petFile = new File("C:/Users/Rodney Olid/Documents/IS247TextFiles/petFile.txt");
        PrintWriter out = new PrintWriter(petFile);
        out.println("Gracie " + 3 + " hamster");
        out.println("Boba " +  3 + " hamster");
        out.println("Pineapple " +  5 +  " beardeddragon");
        out.println("Caramel " + 1 + " hamster");
        out.close();
    }
}
