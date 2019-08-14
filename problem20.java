class problem20
{
    public static void main(String args[])
    {
       
       int i,j,sum=0,c=0,t=0;
       int a[]=new int[400];
       for(i=1;i<400;i++)
             a[i]=0;
             
             a[0]=1;
             
       for(i=1;i<=100;i++)
       {
           c=0;
           t=0;
           for(j=0;j<400;j++)
           {
               t=a[j]*i+c;
               a[j]=t%10;
               c=t/10;
            }
            
           
        }
       for(i=0;i<400;i++)
       {
           sum+=a[i];
        }
        
        System.out.println("sum="+sum);
    }
}