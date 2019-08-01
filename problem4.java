class problem4
{
    public static void main()
    {
        int a=999,b=999;
        int p,x,d,rev=0,max=0,m=0,n=0;
        
        
        for(a=999;a>=100;a--)
        {
            for(b=999;b>=100;b--)
            {
                rev=0;
                p=a*b;
                x=p;
                while(x>0)
                {
                    d=x%10;
                    rev=rev*10+d;
                    x=x/10;
                }
                if (rev==p)
                {
                   
                    if(max<rev)
                    {
                        max=rev;
                        m=a;
                        n=b;
                    }
                    
                }
                }
               
            }
            
            System.out.println("a="+m);
            System.out.println("b="+n);
              System.out.println("max"+max);
        }
    }
        