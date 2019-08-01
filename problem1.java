class problem1
{
    public static void main(String args[])
    {
        int i,s3=0,s5=0;
        int s=0;
        for(i=1;i<1000;i++)
        {
            if(i%3==0)
            {
                s3=s3+i;
            }
            else if(i%5==0 && i%3!=0)
            {
                s5=s5+i;
            }
        }
        s=s3+s5;
        System.out.println("Sum="+s);
    }
}