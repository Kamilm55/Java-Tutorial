
public class app {
    public static void main(String args[])
    {
        int arr[][] = new int[3][4];

        for(int i = 0 ; i < 3 ;i++)
        {
            for(int j = 0 ; j < 4;j++)
            {
                arr[i][j] = (int)(Math.random() * 10) ;
            }
        }

        for(int i = 0 ; i < 3 ;i++)
        {
            for(int j = 0 ; j < 4;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //Enhanced for loop
        for(int r[] : arr) // r = row ; c = each element of the row
        {                   // r is array arr[][] first [] is r ; c is value not index
            for(int c : r)
            {
                 System.out.print(c + " ");
            }
            System.out.println();
        }
    }    
}
