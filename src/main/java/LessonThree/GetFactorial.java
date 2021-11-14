package LessonThree;

public class GetFactorial {
    public static void main(String[] args) {
        System.out.println(getFactorial(6));
    }
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}





