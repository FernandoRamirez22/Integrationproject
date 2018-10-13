//Name : Fernando Ramirez
//Purpose: Runs every basic function in java wihtout scanner

public class IntegrationProject{
  
  public static void main (String[] args){
    
    String name = "Fernando Ramirez";
    System.out.println("Hello!, user, my name is " + name); // greeting
    
    System.out.println( " byte = -128 to 127 (with 0) \n short = -32768 to 32767 \n "
                      + "int = -2^31 to 2^31-1 \n long = -2^63 to 2^63-1 "
                      + "\n double = 4.20  \n boolean = true or false \n char = letters % numbers" );
    
    
    
    System.out.println("Variable = a location in memory.");
    System.out.println("Scope = location to use variable.");
    
    
    boolean check = false; // boolean
    int integer = 0; // int
    double decimal = 0.00; // double
    
    final int MY_FINGERS = 20;
    System.out.printf("A human being has %d fingers \n" , MY_FINGERS);
    
    
    System.out.printf("boolean check value is %b \nint integer value is %d \n double decimal value is %f \n", check, integer, decimal); // printf
    
    System.out.println("name.charAt(2) : " + name.charAt(2)); // charAt()
    System.out.println("name.substring(2 , 5) : " + name.substring(2 , 5)); // substring()
    System.out.println("name.length() : " + name.length() ); // length()
    
    boolean doesWantNumber = true;
    
    int aNumber = getNumber(doesWantNumber); // calling getNumber int method for variable aNumber , doesWantNumber is the argument
    System.out.println(aNumber + " from getNumber() method");
    getStringVoid(); // calling getNumber void method
    
    doesWantNumber = false;
    
    String numberWish = null;
    System.out.println("The next line is an output from a ternary operator.");
    System.out.println(numberWish = (doesWantNumber == false) ? "No number for you!"
        : "You got your number!"); // ternary
    
    System.out.println("I WILL COMPARE STRINGS");
    
    String a = "Gupta"; String b = "Guptaaaaa";  String c = ("Gupta");
    
    
    System.out.println(a.equals(b));
    System.out.println(a.equals(c)); // if lexical order true
    
    System.out.println(a == b);
    System.out.println(a == c); 
    
    int zeroIsLexiSame = a.compareTo(c);
    
    System.out.println("zero means the same lexico... " + zeroIsLexiSame);
    
    System.out.println("DONE");
    
    
    
    
    
    
  }

  private static void getStringVoid() { //  header
    // TODO Auto-generated method stub
    System.out.println("6 from getStringVoid()");
    
  } // getStringVoid

  private static int getNumber(boolean b) { //  header inside of ; boolean b is the parameter

    if(b == true) // (== Equal To ; relational operator) 
      return 6;

    else 
      return 0;
  } // getStringVoid
  
}


  
  