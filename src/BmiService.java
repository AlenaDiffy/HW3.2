public class BmiService {
    public double calculate(int bodyWeight, double bodyHeight) {
        double doubleHeight = bodyHeight * bodyHeight;
        double bmi = (bodyWeight / doubleHeight);
        return bmi;
    }

}

