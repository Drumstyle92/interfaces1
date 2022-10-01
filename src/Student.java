/**
 * subclass of the CollegePerson class.
 */
public class Student extends CollegePerson implements LearningPerson {

    /**
     * method instanced by the LearningPerson.
     */
    public void studyAtHome() {
        System.out.println(" They study a lot. ");
    }

    /**
     * student academy years.
     */
    public int academyYear;

    /**
     *
     * @param name student's name.
     * @param surname student's surname.
     * @param id College ID.
     * @param year Student class variable.
     * constructor method of the Student class.
     */
    Student (String name,String surname,int id,int year){
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.academyYear = year;



    }
}
