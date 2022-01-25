public class Calculator {
    private long number1;
    private long number2;
    private char operator;

    public void setNumber1(long number1) {
        this.number1 = number1;
    }

    public void setNumber2(long number2) {
        this.number2 = number2;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void calculate() {
        switch (operator) {
            case '+':
                System.out.println(number1 + number2);
                break;
            case '-':
                System.out.println(number1 - number2);
                break;
            case '*':
                System.out.println(number1 * number2);
                break;
            case '/':
                System.out.println(number1 / number2);
                break;
            case '%':
                System.out.println(number1 % number2);
                break;
            case '^':
                long powResult = number1;
                for (int i = 1; i < number2; i++) {
                    powResult *= number1;
                }
                System.out.println(powResult);
                break;
        }
    }
}
