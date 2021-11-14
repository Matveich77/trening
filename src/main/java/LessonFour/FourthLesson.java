package LessonFour;

public class FourthLesson {
    public class LessonFour {
        public static void main(String[] args) {
            System.out.println(getSqrt(258963));
        }

        public static int getSqrt(int f) {
            int result = 1;
            for (int i = 1; i * i <= f; i++) {
                result = i;
            }
            return result;
        }
    }

}
