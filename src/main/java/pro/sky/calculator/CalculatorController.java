package pro.sky.calculator;

public class CalculatorController {
    private CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public Integer plus(Integer numberFirst, Integer numberSecond) {

        return calculatorService.plus(numberFirst, numberSecond);
    }

    public Integer minus(Integer numberFirst, Integer numberSecond) {
        return calculatorService.minus(numberFirst, numberSecond);
    }

    public Integer multiply(Integer numberFirst, Integer numberSecond) {

        return calculatorService.multiply(numberFirst, numberSecond);
    }

    public Double divide(Integer numberFirst, Integer numberSecond) {
        return calculatorService.divide(numberFirst, numberSecond);
    }

}