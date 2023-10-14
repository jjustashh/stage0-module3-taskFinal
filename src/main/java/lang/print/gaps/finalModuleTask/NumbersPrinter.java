package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {
        System.out.println((number + Math.abs(number)) / 2 == number && number != 0);
    }
}
