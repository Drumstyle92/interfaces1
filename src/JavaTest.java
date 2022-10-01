/**
 * class containing the core of the program.
 */
public class JavaTest {
    /**
     * Main class that contains an object from the student class, the Professor class, and the Assistant class.
     */
    public static void main(String[] args){
System.out.println("----------------------------------------------------------------------------------------");
        Student s1 = new Student("Dino","Petrucci",34999,3);
        s1.studyAtHome();
        s1.goToCollege();
System.out.println("-----------------------------------------------------------------------------------------");
        Professor p1 = new Professor(" Vittoria "," Heromy ",43666," Informatics ");
        p1.teachToOtherPeople();
        p1.goToCollege();
System.out.println("-----------------------------------------------------------------------------------------");
        Assistant a1 = new Assistant(" Marco "," Rossi ",66776,false);
        a1.studyAtHome();
        a1.teachToOtherPeople();
        a1.goToCollege();
    }
}
