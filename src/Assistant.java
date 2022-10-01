public class Assistant extends CollegePerson implements TeachingPerson , LearningPerson {
    /**
     * method instanced by the LearningPerson.
     */
    @Override
    public void studyAtHome() {
        System.out.println(" They have almost finished studying. ");
    }

    /**
     * method instanced by the TeachingPerson interface.
     */
    @Override
    public void teachToOtherPeople() {
        System.out.println( " They are starting to teach. ");
    }

    /**
     * indicates if he is doing his PhD.
     */
    public boolean isGoingToBeAPhd;

    /**
     *
     * @param name Assistant name.
     * @param surname Assistant surname.
     * @param id College ID.
     * @param willBeAPhd variable parameter in the assistant class.
     * constructor method of the Assistant class.
     */
    Assistant(String name,String surname,int id,boolean willBeAPhd){
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.isGoingToBeAPhd = willBeAPhd;
    }
}