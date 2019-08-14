class problem9
{
    public static void main(String args[])
    {
        int a=1,b=1;
        int o=0,c=0,p2=1,p3=1;
        int m=0,n=0,p=1;
        boolean flag=false;
        
        
            for(b=1;b<1000;b++)
             {
                 for(a=1;a<b;a++)
                 {
                     p=a*a+b*b;
                     for(c=1;c<1000;c++)
                     {
                         p3=c*c;
                         
                         
                     
                         if((a+b+c)==1000 && p==p3)
                         {
                             m=a;
                             n=b;
                             o=c;
                             flag=true;
                             break;
                            }
                        
                        }
                        if(flag==true)
                        break;
                        
                    }
                
                    if(flag==true)
                        break;
                    }
                   
                    
                    p2=m*n*o;
                    System.out.println("Product="+p2);
                }
            }
        