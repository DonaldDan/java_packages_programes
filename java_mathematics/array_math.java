 public class arrayTest {
    public static void main(String[] args) {


        int sum = 0;
        double average=0;
        int[][] marks = {
                            {20, 30, 40},
                            {50, 60, 70},
                            {80, 97, 97}
                         };
        System.out.print("students\n");
        for (int i = 0; i < 3; i++) {

            System.out.print("Student " + (i + 1) + " : ");
            for (int j = 0; j < 3; j++) {
                System.out.print(marks[i][j] + "\t");
                sum += marks[i][j];
                average=sum/3;
            }
            System.out.print(":: "+sum +"\t "+ average);
            System.out.println();
        }

    }
}
