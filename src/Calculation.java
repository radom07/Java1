public enum Calculation {
    ADD {
        @Override
        int calculate(int a, int b) {
            return a + b;
        }
    },
    SUBTRACT {
        @Override
        int calculate(int a, int b) {
            return a - b;
        }
    },
    MULTIPLY {
        @Override
        int calculate(int a, int b) {
            return a * b;
        }
    },
    DIVIDE {
        @Override
        int calculate(int a, int b) {
            return a / b;
        }
    };

    abstract int calculate(int a, int b);
}
