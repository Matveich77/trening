package LessonTwo;

public class SecondProgram {

public static void main (String[] args){
    System.out.println("Привет, мир!");

    double result1=result(8);
    System.out.println(result1);

    long summa1=summa(28, 62);
    System.out.println(summa1);

    long minus1=minus(10,25);
    System.out.println(minus1);
}

    public static double result (long r){
        return r*r*3.14;
        }
    public static long summa(long arg1,long arg2){
            return arg1+arg2;
                }
    public static long minus(long arg1,long arg2){
        return arg1-arg2*arg2;
    }


}
