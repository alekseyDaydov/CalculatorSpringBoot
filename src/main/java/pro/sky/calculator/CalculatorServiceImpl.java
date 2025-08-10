package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    private boolean isNuLLNumber(Integer number) {
        return number == null;
    }

    @Override
    public String helloCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String plus(Integer numberFirst, Integer numberSecond) {
        if (isNuLLNumber(numberFirst) || isNuLLNumber(numberSecond)) {
            throw new IllegalArgumentException("Значение не может быть пустым");
        }
        return String.valueOf(numberFirst + numberSecond);
    }

    @Override
    public String minus(Integer numberFirst, Integer numberSecond) {
        if (isNuLLNumber(numberFirst) || isNuLLNumber(numberSecond)) {
            throw new IllegalArgumentException("Значение не может быть пустым");
        }
        return String.valueOf(numberFirst - numberSecond);
    }

    @Override
    public String multiply(Integer numberFirst, Integer numberSecond) {
        if (isNuLLNumber(numberFirst) || isNuLLNumber(numberSecond)) {
            throw new IllegalArgumentException("Значение не может быть пустым");
        }
        return String.valueOf(numberFirst * numberSecond);
    }

    @Override
    public String divide(Integer numberFirst, Integer numberSecond) {

        if (isNuLLNumber(numberFirst) || isNuLLNumber(numberSecond)) {
            throw new IllegalArgumentException("Значение не может быть пустым");
        }
        if (numberSecond == 0) {
            throw new IllegalArgumentException("На 0 делить нельзя");
        }
        return String.valueOf(numberFirst / (double) numberSecond);
    }
}
