class problem2
{
    public static void main(String args[])
    {
        int s=0,st=2;
        int a=1,b=2;
        while(b<4000000)
        {
            s=a+b;
            if(s%2==0)
            {
                st=st+s;
            }
            a=b;
            b=s;
        }
        System.out.println("Sum="+st);
    }
}