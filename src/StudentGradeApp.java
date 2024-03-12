public class StudentGradeApp {
    private int[][] scores;

    public void collectInfo(int numberOfStudents, int numberOfSubjects){
        if (numberOfStudents<0 )throw new IllegalArgumentException("Invalid number of students");
        if (numberOfSubjects <0 )throw new IllegalArgumentException("Invalid number of subjects");
        scores = new int[numberOfStudents][numberOfSubjects];

    }

    public int getScores() {

        return scores.length;
    }

    public double calculateStudentGradeScore(int... totalScores){
        double sum = 0.0;
        for(int score : totalScores){
            sum += score;
        }
        return sum;
    }
    public double calculateAverageStudentGradeScore(int... totalScores){
        double sum = 0.0;
        for(int score : totalScores){
            sum += score;
        }
        return sum / totalScores.length;
    }

    public double calculateClassGrade(int[][] classGrade){
        double totalClassGrade = 0.0;
        for(int[] grade : classGrade){
            for (int index = 0; index<classGrade[0].length; index++ ){

            totalClassGrade += grade[index];
        }

}return totalClassGrade;
    }
    public double calculateAverageClassGrade(int[][] classGrade){
        double totalClassGrade = 0.0;
        for(int[] grade : classGrade){
            for (int index = 0; index<classGrade[0].length; index++ ){

                totalClassGrade += grade[index];
            }

        }return totalClassGrade/(classGrade.length * classGrade[0].length);
    }

}
