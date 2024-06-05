    interface Maths{
        int operate(int a,int b);
    }

    public class Lambda {
        public static void main(String args[]) {
        Maths addition = (a,b)->a+b;
        Maths subtraction = (a,b)->a+b;
        Maths multiply = (a,b)->a*b;
        Maths division = (a,b)->a/b;
        Maths modulus = (a,b)->a%b;
        
        int add = addition.operate(20,30);
        int sub=subtraction.operate(30,20);
        int mul = multiply.operate(20,5);
        int div = division.operate(45,5);
        int mod = modulus.operate(30,7);
    
       System.out.println("Addition of two number  "+add);
       System.out.println("Subtraction of two number  "+sub);
       System.out.println("Multiply of two number  "+mul);
       System.out.println("Division of two number  "+div);
       System.out.println("Modulus of two number  "+mod);
    
        }
    }
    
