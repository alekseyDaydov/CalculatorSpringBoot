package pro.sky.calculator.service;
public interface CalculatorService {
    public String helloCalculator();

    public String plus(Integer numberFirst, Integer numberSecond);

    public String  minus(Integer numberFirst, Integer numberSecond);

    public String multiply(Integer numberFirst, Integer numberSecond);

    public String divide(Integer numberFirst, Integer numberSecond);
}
