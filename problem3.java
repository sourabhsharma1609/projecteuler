class problem3
{
    public static void main(String args[])
    {
        long n=600851475143L;
       int i=2,j,c=0;
        int max=2;
        while(n>=i)
        {
            if(n%i==0)
            {
                for(j=1;j<=i;j++)
                {
                    if(i%j==0)
                    {
                        c++;
                    }
                }
                if(c==2)
                {
                    max=i;
                }
            }
                    
                
            
            while(n%i==0)
            {
                
                n=n/i;
                
                
            }
            i++;
        }
        System.out.println("factor="+max);
    }
}
            
            
            
        