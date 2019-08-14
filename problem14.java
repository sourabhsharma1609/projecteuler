class problem14
{
    int factor(int nn)
    {
        long x;
        int c=1;
        
        x=nn;
        while(x>1)
        {
            if(x%2==0)
            {
                x=x/2;
            }
            else
            {
                x=(3*x)+1;
            }
            c++;
        }
        return(c);
    }
    
        
    public static void main()
    {
        int i,m=0,max=0,k=0;
        problem14 obj=new problem14();
        
        for(i=1;i<1000000;i++)
        {
            m=obj.factor(i);
            
            if(max<m)
            {
                max=m;
                k=i;
            }
        }
        System.out.println("no.="+m);
    
        System.out.println("no.="+k);
    }
}
        
        
            
           
            