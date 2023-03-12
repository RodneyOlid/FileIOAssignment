import java.io.*;;
import java.util.*;

public class PetReader {
    public static ArrayList<petClass> petList = new ArrayList<petClass>();
    public static void main(String[] args){
        try {
            File myFile = new File("C:/Users/Rodney Olid/Documents/IS247TextFiles/petFile.txt");
            Scanner myReader = new Scanner(myFile);
            while(myReader.hasNextLine()) {
                try {
                    String name = myReader.next();
                    int age = myReader.nextInt();
                    String type = myReader.next();
                    petList.add(new petClass(name, age, type));
                } catch (InputMismatchException  e){
                    System.out.println("One entry was skipped due to a format error");
                }

            }
        } catch (FileNotFoundException e){
            System.out.println("File Error");
        }
    System.out.println(petClass.total);
    }
}
class petClass {
    String name, type;
    int age;
    static int total = 0;
    public petClass(){
        total++;
    }
    public petClass(String myName, int myAge, String myType){
        name = myName;
        type = myType;
        age = myAge;
        total++;
    }
}
