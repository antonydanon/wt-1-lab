package task_4;

import task_4.service.CalculatorService;

public class App {
    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService();
        calculatorService.getIndexesOfPrimeNumbers();
    }
}
