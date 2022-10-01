/**
 * parent class.
 */
public class CollegePerson {
    public String name;
    public String surname;
    public int collegeId;

    /**
     * method to retrieve the variables of the CollegePerson class.
     */
    public void goToCollege() {
        System.out.printf(" %nName: %s %nSurname: %s %nCollege id: %d %n ", name, surname, collegeId);
    }


}
