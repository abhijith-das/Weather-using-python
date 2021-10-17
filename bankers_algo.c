#include <stdio.h>

int main()
{
    char ch='n';
    do
    {
        int max[10][3],alloc[10][3],avail[3],need[10][3],n,r,i,j;
        int finish[10],p[10],present,count,k,flag,sq[10];
        
        printf("\nEnter the number of processes: ");
        scanf("%d",&n);
        
        printf("\nEnter the no of resource instances: ");
        scanf("%d",&r);
        
        printf("\nEnter the max matrix: ");
        for(i=0;i<n;i++)
            for(j=0;j<r;j++)
                scanf("%d",&max[i][j]);
        
        printf("\nEnter the allocation matrix: ");
        for(i=0;i<n;i++)
            for(j=0;j<r;j++)
                scanf("%d",&alloc[i][j]);
        
        printf("\nEnter the available resources: ");
        for(j=0;j<r;j++)
            scanf("%d",&avail[j]);
            
        for(i=0;i<n;i++)
            for(j=0;j<r;j++)
                need[i][j]=(max[i][j]-alloc[i][j]);
        
        
        
        printf("\nPROCESS   MAX     ALLOC   NEED    AVAILABLE");
        printf("\n          A B C   A B C   A B C   A B C ");
        for(i=0;i<n;i++)
        {
            printf("\nP%d       ",i);
            for(j=0;j<r;j++)
                printf("%d ",max[i][j]);
            printf("    ");
            for(j=0;j<r;j++)
                printf("%d ",alloc[i][j]);
            printf("    ");
            for(j=0;j<r;j++)
                printf("%d ",need[i][j]);
            printf("    ");
            if(i==0)
            {
                for(j=0;j<r;j++)
                    printf("%d ",avail[j]);
            }
            
        }
        
        present=0;
        count=0;
        k=0;
        for(i=0;i<n;i++)
            finish[i]=0;
        while(count<n)
        {
            present = count;
            for(i=0;i<n;i++)
            {
                flag=0;
                if(finish[i]!=1)
                {
                    for(j=0;j<r;j++)
                    {
                        if(need[i][j]>avail[j])
                            flag=1;
                    }
                    if(flag==0)
                    {
                        sq[k]=i; 
                        finish[i]=1;
                        count++;
			            k++;
                        for(j=0;j<r;j++)
                            avail[j]=avail[j]+alloc[i][j];
                    }
                }
            }
            if(present==count)
                break;
        }
        
        if(count==n)
        {
            printf("\n----SAFE STATE----");
            printf("\nSAFE SEQUENCE: ");
            for(i=0;i<n;i++)
            {
                if(i!=n-1)
                    printf("P%d--->",sq[i]);
                else
                    printf("P%d",sq[i]);
            }    
        }
        else
            printf("\n----UNSAFE STATE----");
            
    }while(ch=='y'||ch=='Y');        
    return 0;
}
