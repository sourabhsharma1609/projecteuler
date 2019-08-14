class problem16
{
    public static void main(String args[])
    {
        int c=0,temp=0,i,j,sum=0;
        int a[]=new int[400];
        for(i=1;i<400;i++)
        {
            a[i]=0;
        }
        a[0]=1;
        
            for(j=0;j<=999;j++)
            {
                  c=0;
                  temp=0;
                  for(i=0;i<=399;i++)
                  {
                      temp=a[i]*2+c;
                      a[i]= temp%10;
                      c= temp/10;
                    }
            }
            for(j=0;j<=399;j++)
            {
                sum=sum+a[j];
            }
            System.out.println(sum);
        }
    }
                
            