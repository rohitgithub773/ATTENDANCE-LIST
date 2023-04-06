import java.util.*;
class name_age
{
    String name[];
    int age[];int n;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.println("ENTER SIZE:");
        n=sc.nextInt();
        System.out.println("ENTER NAMES WITH CORRESPONDING AGE");
        name=new String[n];
        age=new int[n];
        for(int i=0;i<n;i++)
        {
            name[i]=sc.next();
            age[i]=sc.nextInt();
        }
        
    }
    void arrange()
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(age[j]<age[i])
                {
                    int t= age[j];
                    age[j]=age[i];
                    age[i]=t;
                    String s=name[j];
                    name[j]=name[i];
                    name[i]=s;
                }
                int temp=age[i];
                String s=name[i];
                for(int k=i+1;k>0;k--)
                {
                    if(temp==age[k-1])
                    {
                        if(s.compareTo(name[k-1])<0)
                        {
                            
                            String p=name[k-1];
                            name[k-1]=s;
                            name[k]=p;
                        }
                    }
                }
        }
    }
    
    
}
void main()
{
    System.out.println("INPUT:");
    input();
    arrange();
    System.out.println("OUTPUT:");
    System.out.println("NAME:\tAGE:");
    for(int i=0;i<n;i++)
    System.out.println(name[i]+"\t"+age[i]);
}
}