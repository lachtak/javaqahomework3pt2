public class BmiService {
    public int calculate(double h, int m) {
        double index = m / (h * h);
        int result = (int) index;
        return result;

    }

}
