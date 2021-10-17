#include <stdio.h>

void fifo();
void lru();
void optimal();

int ref[20],frame[5],rno,fno,fault;
int front=0;
int time[5];

int main()
{
    int i,opt;
    char ch;
    printf("\nEnter no. of references and frames : ");
    scanf("%d %d",&rno,&fno);
    printf("Enter the references: ");
    for(i=0;i<rno;i++)
        scanf("%d",&ref[i]);
    do
    {
        for(i=0;i<fno;i++)
        {
            frame[i]=-1;
            time[i]=-1;
        }    
        fault=0;    
        printf("\nMENU\n1.FIFO\n2.LRU\n3.Optimal\nEnter your choice number. ");
        scanf("%d",&opt);
        switch(opt)
        {
            case 1: fifo();
                    break;
            case 2: lru();
                    break; 
            case 3: optimal();
                    break;
            default:printf("\nInvalid Choice!");
        }
        printf("\nDo you want to continue?(y/n) ");
        scanf(" %c",&ch);
    }while(ch=='y'||ch=='Y');   

    return 0;
}

void fifo()
{
    int i,j,flag;
    for(i=0;i<rno;i++)
    {
        flag=0;
        for(j=0;j<fno;j++)
        {
            if(ref[i]==frame[j])
            {
                flag=1;    
            }
        }
        if(flag==0)
        {
            fault++;
            frame[front]=ref[i];
            front=(front+1)%fno;
            printf("\nFault %d: ",fault);
            for(j=0;j<fno;j++)
            {
                if(frame[j]!=-1)
                    printf("%d   ",frame[j]);
                else
                    printf("_   ");
            }    
        }
    }
    printf("\nTotal number of faults: %d",fault);
}   

void lru()
{
    int i,j,flag,check,min,index; 
    for(i=0;i<rno;i++)
    {
        flag=0;
        for(j=0;j<fno;j++)
        {
            if(frame[j]==ref[i])
            {
                flag=1;
                time[j]=i;
            }    
        }
        if(flag!=1)
        {
            check=0;
            for(j=0;j<fno;j++)
            {
                if(frame[j]==-1)
                {
                    check=1;
                    time[j]=i;
                    frame[j]=ref[i];
                    break;
                }
            }
            if(check!=1)
            {
                min=time[0];
                index=0;
                for(j=1;j<fno;j++)
                {
                    if(time[j]<min)
                    {
                        min=time[j];
                        index=j;
                    }
                }
                time[index]=i;
                frame[index]=ref[i];
            }
            fault++;
            printf("\nFault %d: ",fault);
            for(j=0;j<fno;j++)
            {
                if(frame[j]!=-1)
                    printf("%d   ",frame[j]);
                else
                    printf("_   ");
            }    
        }
    }
    printf("\nTotal number of faults: %d",fault);
}

void optimal()
{
    int i,j,k;
    int flag0,flag1,flag2;
    int occur[10],max,index;
    for(i=0;i<rno;i++)
    {
        flag0=0;
        for(j=0;j<fno;j++)
        {
            if(frame[j]==ref[i])
                flag0=1;
                
                
        }
        if(flag0!=1)
        {
            fault++;
            flag1=0;
            for(j=0;j<fno;j++)
            {
                if(frame[j]==-1)
                {
                    flag1=1;
                    frame[j]=ref[i];
                    break;
                }
            }
            if(flag1!=1)
            {
                for(j=0;j<fno;j++)
                {
                    occur[j]=-1;
                    for(k=i+1;k<rno;k++)
                    {
                        
                        if(ref[k]==frame[j])
                        {
                            occur[j]=k;
                            break;
                        }    
                    }
                }
                flag2=0;
                for(j=0;j<fno;j++)
                {
                    if(occur[j]==-1)
                    {
                        frame[j]=ref[i];
                        flag2=1;
                        break;
                    }    
                }
                if(flag2!=1)
                {
                    max=occur[0];
                    index=0;
                    for(j=0;j<fno;j++)
                    {
                        if(occur[j]>max)
                        {
                            max=occur[j];
                            index=j;
                           
                        }
                    }  
                    frame[index]=ref[i];
                }
            }
            printf("\nFault %d: ",fault);
            for(j=0;j<fno;j++)
            {
                if(frame[j]!=-1)
                    printf("%d   ",frame[j]);
                else
                    printf("_   ");
            }    
        }
        
    } 
    printf("\nTotal number of faults: %d",fault);
}


