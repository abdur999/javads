import java.lang.*;

public class Template {
    public static void main(String[] args) {
//        double intNum = add(2,4);
//        System.out.println(intNum);
//        double floatNum = add(2.3,4.1);
//        System.out.println(floatNum);
        // Integer Addition
        Integer sumInt = add(5, 10, value -> (int) value);
        System.out.println("Integer sum: " + sumInt);

        // Double Addition
        Double sumDouble = add(5.5, 2.3, value -> value);
        System.out.println("Double sum: " + sumDouble);

        // Float Addition
        Float sumFloat = add(3.2f, 4.8f, value -> (float) value);
        System.out.println("Float sum: " + sumFloat);

        // Long Addition
        Long sumLong = add(5L, 15L, value -> (long) value);
        System.out.println("Long sum: " + sumLong);
    }
    //Generic method return double every time
    public static <T extends Number> double add(T a, T b) {
      return a.doubleValue()+b.doubleValue();
    }

    // Generic method that adds two numbers and returns same type using a mapper
    public static <T extends Number> T add(T num1, T num2, NumberMapper<T> mapper) {
        double sum = num1.doubleValue() + num2.doubleValue();
        return mapper.fromDouble(sum);
    }
    /*
    ✔ The add method accepts two numbers of type T.
    ✔ It sums them as double for flexibility.
    ✔ A NumberMapper<T> is passed to convert the sum back to the exact type T.
    ✔ This approach preserves type safety and returns the exact same type.
     */

}
