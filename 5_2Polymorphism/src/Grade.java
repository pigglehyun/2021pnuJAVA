
public class Grade {
    private enum GRADE{
        ONE(1), TWO(2), THREE(3), FOUR(4);
    }
    private int grade;

    public Grade(int grade) {
            this.grade = grade;
        }
    public int getGrade(){
            return this.grade;
    }
    public void upGrade(){
        (this.grade)++;
       }
}


