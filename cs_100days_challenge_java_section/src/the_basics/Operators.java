package the_basics;

public class Operators {
    static void main() {
        int a = 10;
        int b = 5;


        int sum = a + b ;
        int sub = a - b ;
        int mul = a * b ;
        int div = a / b ;
        int mod = a % b ;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);

        int multiCalculation = 10 * 3 - 20 / 4 + 16 % 3;
        int multiCalculation2 = (10 * 3 - 20) / 4 + 16 % 3;

        System.out.println(multiCalculation);
        System.out.println(multiCalculation2);


        int c = 5;
        boolean comResult1 = a < b ;
        boolean comResult2 = a > b ;
        boolean comResult3 = a >= b ;
        boolean comResult4 = a <= b ;
        boolean comResult5 = a == b ;
        boolean comResult6 = c == b ;
        boolean comResult7 = c != a ;
        boolean comResult8 = c != b ;

        System.out.println(comResult1);
        System.out.println(comResult2);
        System.out.println(comResult3);
        System.out.println(comResult4);
        System.out.println(comResult5);
        System.out.println(comResult6);
        System.out.println(comResult7);
        System.out.println(comResult8);

        System.out.println("-------------------------------");

        boolean logicalResult1 = a > b && a < c ;
        boolean logicalResult2 = a > b || a < c ;

        System.out.println(logicalResult1);
        System.out.println(logicalResult2);

        boolean preResult = a + b > b / c &&  b * c < b + c ;
        System.out.println(preResult);

    }
}

//Operator
//Operator Precedence

//Arithematic Operatior >> * / % + -
//Relational Operator / Comparison => > < >= <= == !=
//Logical Operator => && ||
//Assignment Operator => =