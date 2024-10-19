class CalculatorCL
{
    public static void main (String args[])
    {
        if (args.length != 3)
        {
            System.out.println("Usage: java CalculatorCL <number1> <operator> <number2>");
            return;
        }

        int a, b;

        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[2]);

        switch ( args[1] ) 
        {
            case "+" :
                System.out.println(a+b);
                break;

            case "-" : 
                System.out.println(a-b);
                break;

            case "*" :
                System.out.println(a*b);
                break;

            case "/" : 
                System.out.println(a/b);
                break;
            
            default : 
                System.out.println("Invalid Input");
        }  
    }
}