import java.io.*;;
import java.util.*;

public class PetReader {
    public static ArrayList<petClass> petList = new ArrayList<petClass>();
    public static void main(String[] args){
        try {
            File myFile = new File("C:/Users/rodne/OneDrive/Documents/IS247TextFiles/mypet.txt");
            Scanner myReader = new Scanner(myFile);
            while(myReader.hasNext()) {
                try {
                    String name = myReader.next();
                    int age = myReader.nextInt();
                    String type = myReader.next();
                    petList.add(new petClass(name, age, type));
                } catch (InputMismatchException  ex){
                    System.out.println("One entry was skipped due to a format error");
                }
            }
            myReader.close();
        } catch (FileNotFoundException e){
            System.out.println("File Error");
        } finally{
            System.out.println("There were " + petList.size() + " good entries in the file.");
            for(int i = 0; i < petList.size(); i++){
                System.out.println("my pet " + (i + 1) + " is " + petList.get(i).name + " and they are " + petList.get(i).age + " years old. They are a " +  petList.get(i).type);
            }
        }

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
//C:/Users/Rodney Olid/Documents/IS247TextFiles/petFile.txt home pc address