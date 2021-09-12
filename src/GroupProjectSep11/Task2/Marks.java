package GroupProjectSep11.Task2;

    /*
We  have  to  calculate  the  average  of  marks obtained in three subjects by student A and by student B.
 Create class 'Marks' with an abstract method  'getPercentage'  that  will  be  returning the  average  percentage  of  marks.
  Provide implementation of abstract method in classes 'A' and 'B'.
  The constructor of student A takes the marks  in  three  subjects  as  its  parameters
   and the marks in four subjects as its parameters for student B.
   Test your code
 */
    public abstract class Marks {
        double subject1;
        double subject2;
        double subject3;
        double subject4;
        double average;
        abstract void getPercentage();
    }
    class AA extends Marks {

        AA(double subject1, double subject2, double subject3) {
            this.subject1 = subject1;
            this.subject2 = subject2;
            this.subject3 = subject3;
        }
        @Override
        void getPercentage() {
            double average = (subject1 + subject2 + subject3) / 3;
            System.out.println("Average of marks for StudentA = " + average);
        }
    }
    class BB extends Marks{

        BB(double subject1, double subject2, double subject3, double subject4) {
            this.subject1 = subject1;
            this.subject2 = subject2;
            this.subject3 = subject3;
            this.subject4 = subject4;
        }
        @Override
        void getPercentage(){
            double average=(subject1+subject2+subject3+subject4)/4;
            System.out.println("Average of marks for studentB = "+average);
        }
    }

