package homeWork1;


import java.util.Set;
@FunctionalInterface
public interface AbleToCalculatePension {

    double calculatePension(int first, double second, double third, Set<PensionFund> pensionFund);
}