package calculator;

public enum OperatorType {
    ADD {
        public double operate(double a, double b) {
            return a + b;
        }
    },
    SUBTRACT {
        public double operate(double a, double b) {
            return a - b;
        }
    },
    MULTIPLY {
        public double operate(double a, double b) {
            return a * b;
        }
    },
    DIVIDE {
        public double operate(double a, double b) {
            return a / b;
        }
    },
    MOD {
        public double operate(double a, double b) {
            return a % b;
        }
    };
    public abstract double operate(double a, double b);
}
