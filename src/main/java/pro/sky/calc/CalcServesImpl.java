package pro.sky.calc;

import org.springframework.stereotype.Service;

@Service
public class CalcServesImpl implements CalcServes {
@Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }


    @Override
    public String plus(int num1, int num2) {
        return num1+"+"+num2+"="+(num1+num2);
    }

    @Override
    public String minus(int num1, int num2) {
        return num1+"-"+num2+"="+(num1-num2);
    }

    @Override
    public String multiply(int num1, int num2) {
        return num1+"*"+num2+"="+(num1*num2);
    }

    @Override
    public String divide(int num1, int num2) {
    if (num2 == 0) {
        return "Делить на 0 нельзя!";
    } else {
        return num1 + "/" + num2 + "=" + (num1 / num2);
    }
    }
}
