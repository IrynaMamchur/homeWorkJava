package homeWork1;

public class AverageValueUtils {


    public static double average(double first, double second, double third) {
        return (first + second + third) / 3;
    }

    public static double average(double first, double second) {
        return (first + second) / 2;
    }

// уникальность метода - название + парамерты. если название одно, а параметры разные, то будет работать. Это перегрузка метода
}
