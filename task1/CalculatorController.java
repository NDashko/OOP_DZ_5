public class CalculatorController {

    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }
    public double inputValueOne(){
        return view.userInputOne();
    }
    public double inputValueTwo(){
        return view.userInputTwo();
    }
    public String inputOperator() {
        return view.userInputOperator();
    }
    public void calc() {
        double result;
        try {
            switch (inputOperator()){
                case "+":
                    result = model.add(inputValueOne(), inputValueTwo());
                    break;
                case "-":
                    result = model.subtract(inputValueOne(), inputValueTwo());
                    break;
                case "*":
                    result = model.multiply(inputValueOne(), inputValueTwo());
                    break;
                case "/":
                    result = model.divide(inputValueOne(), inputValueTwo());
                    break;
                default:
                    view.printError("Введен неверный оператор!");
                    return;
            }
            view.printResult(result);
        } catch (ArithmeticException er) {
            view.printError(er.getMessage());
        }
    }
}