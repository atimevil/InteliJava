package calculator;

public class CircleCalculator extends Calculator {
    double radius, result;
    CircleCalculator(double radius) {
        this.radius = radius;
    }

    public double calculate(double radius) {
        result = radius * radius * 3.14;
        return result;
    }
}
