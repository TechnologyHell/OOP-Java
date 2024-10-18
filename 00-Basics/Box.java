class Box
{
    public static void main (String args[])
    {
        int row = 3, col = 5;

        for (int i=0; i<col; i++)
        {
            for (int j=0; j<row; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}