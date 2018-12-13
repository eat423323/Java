// simple practice on setting up operating funcitons withing a class, creating instances from that class and passing in values.
class Calculator {
  public Calculator(){

  }

  public int add(int a, int b){
    return a + b;
  }

  public int subtract(int a, int b){
    return a - b;
  }

  public int multiply(int a, int b){
    return a * b;
  }

  public int divide(int a, int b){
    if ( b == 0) {
      System.out.println("Error! Dividing by zero is not allowed.");
      return 0;
    } else {
      return a / b;
    }
  }

  public int modulo(int a, int b){
     if ( b == 0) {
      System.out.println("Error! Dividing by zero is not allowed.");
      return 0;
    } else {
      return a % b;
    }
    // the else {} is not necessary in this case. We could simply write return a % b since the return in the if would stop the function already.
  }

  public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    myCalculator.add(5, 7);
    //System.out.println(myCalculator.add(5, 7));
    myCalculator.subtract(45, 11);
   // System.out.println(myCalculator.subtract(45, 11));
  System.out.println(myCalculator.divide(45, 0));
  }
}
