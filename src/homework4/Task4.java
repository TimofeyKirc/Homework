package homework4;

public class Task4 {
    public static void main(String[] args) {
        {
            int[] arr = { 1, 5, 1, 2, 1, 3, 3,8,10,-10,15,20,7,1,10,9,5,2,-10,4 };

            int n = arr.length;

            for ( int i = 0, m = 0; i != n; i++, n = m )
            {
                for ( int q = m = i + 1; q != n; q++ )
                {
                    if ( arr[q] != arr[i] )
                    {
                        if ( m != q ) arr[m] = arr[q];
                        m++;
                    }
                }
            }


            if ( n != arr.length )
            {
                int[] b = new int[n];
                for ( int i = 0; i < n; i++ ) b[i] = arr[i];

                arr = b;
            }

            for ( int x : arr ) System.out.print( x + " " );
            System.out.println();
        }
    }
    }
