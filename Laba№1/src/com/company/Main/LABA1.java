package     com.company.Main;
public class LABA1
{
    public static void main(String[] args) {
        ///information
        int[] m = new int[5];
        m[0] = 777;
        m[1] = 666;
        m[2] = 13;
        m[3] = 3;
        int a = 0;
        ///for
        for(int i = 0; i < 5; i++)
        {
            a = a + m[i];

        }
        System.out.println(a);
        ///while
        int b = 0;
        int j = 0;
        while(j < 5)
        {
            b = b + m[j];
            j++;
        }
        System.out.println(b);
        ///do while
        int c = 0;
        int x = 0;
        do
        {
            c = c + m[x];
            x++;
        } while(x < 5);
        System.out.println(c);
    }
}

