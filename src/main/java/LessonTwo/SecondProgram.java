package LessonTwo;

public class SecondProgram {
long r;
long arg2; long arg1;
public static void main (String[] args){
    System.out.println("Привет, мир!");
    double result1=result(4);
    System.out.println(result1);

    long summa1=summa(2, 10);
    System.out.println(summa1);
}
    public static double result (long r){
        double result=r*r*3.14;
        return result;
        }
        public static long summa(long arg1,long arg2){
        long summa=arg1+arg2;
        return summa;

    }

}
