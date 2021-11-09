package LessonThree;

public class ThirdProgram {
    public static void main(String[] args) {

        double a = 7;
        double b = 2;
        double c = 1;

        double d = b * b - 4 * a * c;
        if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0");
        } else if (d < 0) {
            System.out.println("Нет действительных решений уравнения");
        } else if (d > 0) {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else {
            double x = -b / (2 * a);
            System.out.println("Корень уравнения: x = " + x);
        }

    }
}

