package com.simple.calculator;


/**
 * Created by Tommy Delgado
 *
 */
public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opcode = 'a';
    private double result;


    private MathEquation( char op){
        this.opcode = op;
    }

    public MathEquation(double num1, double num2, char op){
        this(op);
        this.leftVal = num1;
        this.rightVal = num2;
    }

    public double getLeftVal() {
        return leftVal;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public char getOpcode() {
        return opcode;
    }

    public void setOpcode(char opcode) {
        this.opcode = opcode;
    }

    public void execute(){
        switch(opcode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Error == invalid Opcode");
                result = 0.0d;
                break;
        }
    }

    public double getResult(){
        return this.result;
    }


}
