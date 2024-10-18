class Loop_CL
{
    public static void main (String args[])
    {
        for ( int i = 0; i < args.length; i++)
        {
            System.out.println ( i + "\t" + args[i] + "\t" + (i+1));
        }
    }
}