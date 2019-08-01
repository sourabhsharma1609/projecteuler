class problem6
{
    public static void mai(String args[])
    {
        int n=100,s1=0,s2=0,df=0;
        s1=((n*(n+1))*(2*n+1))/6;
        s2=((n*(n+1))/2)*((n*(n+1))/2);
        df=s2-s1;
        System.out.println("difference="+df);
    }
}

        
        
        