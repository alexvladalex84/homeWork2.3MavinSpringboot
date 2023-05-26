package demoprojectforsprihgboot;


import org.springframework.stereotype.Service;
@Service
public class CalculatorServiceImpl implements CalculatorService{


    public  String greetings() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public  String CalculatorGreetings() {
        return "<b>Добро пожаловать в калькулятор!</b>";
    }


    public String plus(int n1, int n2) {

            return n1 + " + " + n2 + " = " + (n1 + n2);
        }

    public String minus(int n1, int n2) {

        return n1+ " - " + n2 + " = " + (n1 - n2);
    }
    public String multiply(int n1, int n2) {

        return n1+ " * " + n2 + " = " + (n1 * n2);
    }
    public String divide(int n1, int n2) {
        if (n1 == 0 || n2 == 0) {
            return n1 + " / " + n2 + " = 0 ";
        } else {
            return n1 + " / " + n2 + " = " + (n1 / n2);
        }

    }/*n*/
    }
