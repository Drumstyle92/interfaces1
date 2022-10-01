/**
 * subclass of the CollegePerson class.
 */
public class Professor extends CollegePerson implements TeachingPerson {
    /**
     * method instanced by the TeachingPerson interface.
     */
    @Override
    public void teachToOtherPeople() {
        System.out.println(" They teach with passion. ");
    }

    /**
     * Indicates the subject they teach.
     */
    public String teachingSubject;

    /**
     *
     * @param name name of the teacher
     * @param surname surname of the teacher
     * @param id College ID.
     * @param subject variable of the class to which it belongs
     * constructor method of the Professor class.
     */
    Professor(String name,String surname,int id,String subject){
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.teachingSubject = subject;
    }
}