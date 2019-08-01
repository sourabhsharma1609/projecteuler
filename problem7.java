class problem7
{
       
    public static void main(String args[])
    {
        int i,a=1,c=0,j,k=0;
        
        
        for(i=1;i<=10001;)
        {
            c=0;
            for(j=1;j<=a;j++)
            {
                if(a%j==0)
                {
                    c++;
                }
            }
            
            
            if(c==2)
            {
                i++;
                k=a;
            }
            a++;
        }
        System.out.println("10001st="+k);
    }
}