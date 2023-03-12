public class PetClass {
    String name, type;
    int age;
    static int total = 0;

    public PetClass() {
        total++;
    }

    public PetClass(String myName, int myAge, String myType) {
        name = myName;
        type = myType;
        age = myAge;
        total++;
    }
}
