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
    public Integer plus(Integer numberFirst, Integer numberSecond) {
        if (isNuLLNumber(numberFirst) || isNuLLNumber(numberSecond)) {
            throw new IllegalArgumentException("Значение не может быть пустым");
        }
        return numberFirst + numberSecond;
    }

    @Override
    public Integer minus(Integer numberFirst, Integer numberSecond) {
        if (isNuLLNumber(numberFirst) || isNuLLNumber(numberSecond)) {
            throw new IllegalArgumentException("Значение не может быть пустым");
        }
        return numberFirst - numberSecond;
    }

    @Override
    public Integer multiply(Integer numberFirst, Integer numberSecond) {
        if (isNuLLNumber(numberFirst) || isNuLLNumber(numberSecond)) {
            throw new IllegalArgumentException("Значение не может быть пустым");
        }
        return numberFirst * numberSecond;
    }

    @Override
    public Double divide(Integer numberFirst, Integer numberSecond) {
        if (isNuLLNumber(numberFirst) || isNuLLNumber(numberSecond)) {
            throw new IllegalArgumentException("Значение не может быть пустым");
        }
        if (numberSecond == 0) {
            throw new IllegalArgumentException("На 0 делить нельзя");
        }
        return numberFirst/(double) numberSecond;
    }
}
