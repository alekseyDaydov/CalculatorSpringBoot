package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String HelloCalculator() {
        return calculatorService.helloCalculator();
    }

    @GetMapping(path = "/calculator/plus")
    public Integer plus(@RequestParam("num1") Integer numberFirst, @RequestParam("num2") Integer numberSecond) {

        return calculatorService.plus(numberFirst, numberSecond);
    }

    @GetMapping(path = "/calculator/minus")
    public Integer minus(@RequestParam("num1") Integer numberFirst, @RequestParam("num2") Integer numberSecond) {
        return calculatorService.minus(numberFirst, numberSecond);
    }

    @GetMapping(path = "/calculator/multiply")
    public Integer multiply(@RequestParam("num1") Integer numberFirst, @RequestParam("num2") Integer numberSecond) {

        return calculatorService.multiply(numberFirst, numberSecond);
    }

    @GetMapping(path = "/calculator/divide")
    public Double divide(@RequestParam("num1") Integer numberFirst, @RequestParam("num2") Integer numberSecond) {
        return calculatorService.divide(numberFirst, numberSecond);
    }
}