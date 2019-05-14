package com.simple.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
//        double[] rightVals = {50.0d, 92.0d, 175.0d, 3.0d};
//        char[] opcode = {'d', 'a', 's', 'm'};
//        double[]  results = new double[opcode.length];

        Scanner in = new Scanner(System.in);
        boolean keepGoing = true;
//        MathEquation[] equations = new MathEquation[4];
        while(keepGoing){
            System.out.print("Please enter a number: ");
            double num1 = in.nextDouble();
            System.out.print("Please enter another number: ");
            double num2 = in.nextDouble();
            System.out.print("Please enter an operation ( a s d m): ");
            String op = in.next();

            MathEquation equation = new MathEquation(num1, num2, op.charAt(0));
            equation.execute();
            System.out.println("The Result = " + equation.getResult());


            System.out.print("Keep Going? (Y / N): ");
            String loop = in.next();
            if(loop.charAt(0) != 'Y')
                if(loop.charAt(0) != 'y')
                    keepGoing =  false;
        }

    }

}
