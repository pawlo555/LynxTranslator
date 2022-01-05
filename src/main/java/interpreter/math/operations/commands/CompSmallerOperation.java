package interpreter.math.operations.commands;

import interpreter.math.MathValue;
import interpreter.math.operations.doubleOperation.DoubleOperatorOperation;


public class CompSmallerOperation extends DoubleOperatorOperation {

    public CompSmallerOperation(MathValue firstElement, MathValue secondElement) {
        super(firstElement, secondElement);
    }

    @Override
    public MathValue evaluate() {
        int firstCheckValue = firstElement.checkValue();
        int secondCheckValue = secondElement.checkValue();
        if(firstCheckValue == 0 || secondCheckValue == 0){
            double first = firstElement.getDoubleValue();
            double second = secondElement.getDoubleValue();
            if(first > second){
                return new MathValue(true);
            }
            return new MathValue(false);
        }
        else{
            int first = firstElement.getIntValue();
            int second = secondElement.getIntValue();
            if(first > second){
                return new MathValue(true);
            }
            return new MathValue(false);
        }
    }


}