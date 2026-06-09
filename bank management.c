#include<stdio.h>
int balance = 5000;

void deposit() {
    int amt;
    printf("Enter Amount: ");
    scanf("%d",&amt);

    balance += amt;
    printf("after deposit:%d\n",balance);
}

void withdraw()
{
    int amt;
    printf("Enter Amount: ");
    scanf("%d",&amt);

    if(amt <= balance)
        balance -= amt;
    else
        printf("Insufficient Balance\n");
}

void showBalance() {
    printf("Balance = %d\n", balance);
}

int main() {
    int choice;
    while(1)
    {
        printf("\n1.Deposit\n2.Withdraw\n3.Balance\n4.Exit\n");
        printf("Enter choice: ");
        scanf("%d",&choice);

        if(choice == 1)
            deposit();
        else if(choice == 2)
            withdraw();
        else if(choice == 3)
            showBalance();
        else if(choice == 4)
            break;
        else
            printf("Invalid choice\n");
    }

    return 0;
}
