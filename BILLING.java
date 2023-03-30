package DINESH; 
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
class BILLING
{
    static int total;
    static	int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10=0;
    static	int r1,r2,r3,r4,r5,r6,r7,r8,r9,r10=0;
    static  int flag=0,flag1,flag2,flag3,flag4,flag5,flag6,flag7,flag8,flag9=0;
    static  int nn=0;
    static  void menu()
    {   Scanner s1=new Scanner(System.in);
        int choice;
        String email;
        String password;
        System.out.println("|____________|");
        System.out.println("|                                |");
        System.out.println("|   WELCOME TO DJS SUPERMARKET   |");
        System.out.println("|____________|");
        LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter newnow=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String for_date=now.format(newnow);
        System.out.println("| IST : "+for_date+"      |");
        System.out.println("|--------------------------------|");
        System.out.println("     Supermarket Main Menu       |");
        System.out.println("|--------------------------------|");
        System.out.println("|    1) Admin                    |");
        System.out.println("|                                |");
        System.out.println("|    2) Buyer                    |");
        System.out.println("|                                |");
        System.out.println("|    3) Exit                     |");
        System.out.println("|--------------------------------|");
        System.out.println("| Please Select Your Choice!     |");
        System.out.println("|--------------------------------|");
        choice=s1.nextInt();
        if(choice==1)
        {           System.out.println("|--------------------------------|");
            System.out.println("|     Enter Login Details        |");
            System.out.println("|--------------------------------|");
            System.out.println("|____________|");
            System.out.println("|     Enter Valid Email          |");
            System.out.println("|____________|");
            email=s1.next();
            System.out.println("|____________|");
            System.out.println("|      Enter password            |");
            System.out.println("|____________|");
            password=s1.next();
            System.out.println("|____________|");
            if(email.equalsIgnoreCase("dineshmaddi2025@gmail.com") && password.equalsIgnoreCase("dinesh@123"))
            {
                BUY();
            }
            else
            {   System.out.println("|____________|");
                System.out.println("| INVALID USERNAME AND PASSWORD  |");
                System.out.println("|____________|");
                System.out.println("| SO PLEASE ENTER VALID PASSWORD |");
                System.out.println("|____________|");
                menu();
            }
        }
        else if(choice ==2)
        {
            Buyer();
        }
        else if(choice ==3) {

            System.exit(0);
        }
        else
        {   System.out.println("|--------------------------------|\n");
            System.out.println("Please select valid option \t\t\t\n");
            System.out.println("|--------------------------------|\n");
            menu();
        }
    }
    static void Admin()
    {
        Scanner s2=new Scanner(System.in);
        System.out.println("\t\t\t\t--------------------------------\n");
        System.out.println("\t\t\t\t____________\n");
        System.out.println("\n\t\t\t        Admin Menu              \n");
        System.out.println("\t\t\t\t____________\n");
        System.out.println("\t\t\t\t--------------------------------\n");
        System.out.println("\t\t\t\t|    1) Add Product    |\n");
        System.out.println("\t\t\t\t|                      |\n");
        System.out.println("\t\t\t\t|    2) Remove product |\n");
        System.out.println("\t\t\t\t|                      |\n");
        System.out.println("\t\t\t\t|    3) Replace product|\n");
        System.out.println("\t\t\t\t|                      |\n");
        System.out.println("\t\t\t\t|    4) Back to Mainmenu|\n");
        System.out.println("\t\t\t\t|                      |\n");
        System.out.println("\n\t\t\t Please Select Your Choice!");

    }
    static void  Buyer()
    {  int choice;
        Scanner s3=new Scanner(System.in);
        System.out.println("|____________|");
        System.out.println("|____________|");
        System.out.println("|        Buyer Menu              |");
        System.out.println("|____________|");
        System.out.println("|--------------------------------|");
        System.out.println("|    1) Buy Product              |");
        System.out.println("|                                |");
        System.out.println("|    2) Go  Back                 |");
        System.out.println("|--------------------------------|");
        System.out.println("|--------------------------------|");
        System.out.println("| Please Select Your Choice!     |");
        System.out.println("|--------------------------------|");
        choice=s3.nextInt();
        if(choice==1)
        {
            BUY();
        }
        else if(choice ==2)
        {
            menu();

        }
        else
        {
            System.out.println("\t\t\t\t Please select valid option \t\t\t");
            Buyer();
        }
    }
    public static void BUY()
    {
        int choice;
        int n=100;
        int []items=new int[n];
        int c=-2;
        Scanner s4=new Scanner(System.in);
        System.out.println("|_____________|");
        System.out.println("|---------------------------------------|");
        System.out.println("|    LIST OF PRODUCTS        || COST    |");
        System.out.println("|---------------------------------------|");
        System.out.println("|_____________|");
        System.out.println("|    1) Millets              | 80.00/kg |");
        System.out.println("|                                       |");
        System.out.println("|    2) Pulses               | 70.00/kg |");
        System.out.println("|                                       |");
        System.out.println("|    3) Soap                 | 30.00    |");
        System.out.println("|                                       |");
        System.out.println("|    4) Detergent            | 100.00   |");
        System.out.println("|                                       |");
        System.out.println("|    5) Shampoo              | 150.00   |");
        System.out.println("|                                       |");
        System.out.println("|    6) Perfume              | 250.00   |");
        System.out.println("|                                       |");
        System.out.println("|    7) Rice Bag             | 1000.00  |");
        System.out.println("|                                       |");
        System.out.println("|    8) Cooking Oil          | 2000.00  |");
        System.out.println("|                                       |");
        System.out.println("|    9) Cookies              | 200.00   |");
        System.out.println("|                                       |");
        System.out.println("|    10)Milk Powder          | 100.00   |");
        System.out.println("|---------------------------------------|");
        System.out.println("| You can Purchase these Products       |");
        System.out.println("|---------------------------------------|");
        System.out.println("|---------------------------------------|");
        System.out.println("| Please Select Your Choice!            |");
        System.out.println("|---------------------------------------|");
        System.out.println("|---------------------------------------|");
        System.out.println("| !!!NOTE : PRESS -1 TO EXIT CART LOBBY |");
        System.out.println("|------------------------------------------------------------------------------------------|");
        System.out.println("|!!!NOTE :YOU CAN CHOOSE QUANTITY AT THE TIME OF BILLING.SO PLEASE SELECT THE ITEMS YOU WANT");
        System.out.println("|------------------------------------------------------------------------------------------|");
        for(int i=0;i<10;i++)
        {
            choice=s4.nextInt();
            if(choice==-1)
            {
                break;
            }
            else
            {
                switch(choice)
                {
                    case 1:
                        c=0;
                        items[i]=c;
                        nn++;
                        break;
                    case 2:
                        c=1;
                        items[i]=c;
                        nn++;
                        break;
                    case 3:
                        c=2;
                        items[i]=c;
                        nn++;
                        break;
                    case 4:
                        c=3;
                        items[i]=c;
                        nn++;
                        break;
                    case 5:
                        c=4;
                        items[i]=c;
                        nn++;
                        break;
                    case 6:
                        c=5;
                        items[i]=c;
                        nn++;
                        break;
                    case 7:
                        c=6;
                        items[i]=c;
                        nn++;
                        break;
                    case 8:
                        c=7;
                        items[i]=c;
                        nn++;
                        break;
                    case 9:
                        c=8;
                        items[i]=c;
                        nn++;
                        break;
                    case 10:
                        c=9;
                        items[i]=c;
                        nn++;
                        break;
                    default:
                        System.out.println("\tPlease choose items within the list");
                }
            }
        }
        Receipt(items,nn);
    }
    public static void quantity(int []items,int n)
    {     Scanner s10=new Scanner(System.in);
        System.out.println("|---------------------------------------------|");
        System.out.println("|Enter the quantity of each product you chosen|");
        System.out.println("|---------------------------------------------|");

        for(int i=0;i<n;i++)
        {
            if(items[i]==0)
            {
                flag=1;
            }
            else if(items[i]==1)
            {
                flag1=2;
            }
            else if(items[i]==2)
            {
                flag2=3;
            }
            else if(items[i]==3)
            {
                flag3=4;
            }
            else if(items[i]==4)
            {
                flag4=5;
            }
            else if(items[i]==5)
            {
                flag5=6;
            }
            else if(items[i]==6)
            {
                flag6=7;
            }
            else if(items[i]==7)
            {
                flag7=8;
            }
            else if(items[i]==8)
            {
                flag8=9;
            }
            else if(items[i]==9)
            {
                flag9=10;
            }
        }
        if(flag==1)
        {   System.out.println("|____________|");
            System.out.println("|    Enter the quantity of Millets   |");

            n1=s10.nextInt();
            System.out.println("|____________|");
            r1=n1*80;
        }
        if(flag1==2)
        {   System.out.println("|____________|");
            System.out.println("|    Enter the quantity of Pulses    |");
            n2=s10.nextInt();
            System.out.println("|____________|");
            r2=n2*70;
        }
        if(flag2==3)
        {
            System.out.println("|____________|");
            System.out.println("|    Enter the quantity of Soap      |");
            n3=s10.nextInt();
            System.out.println("|____________|");
            r3=n3*30;
        }
        if(flag3==4)
        {
            System.out.println("|____________|");
            System.out.println("|    Enter the quantity of Detergent |");
            n4=s10.nextInt();
            System.out.println("|____________|");
            r4=n4*100;
        }
        if(flag4==5)
        {
            System.out.println("|____________|");
            System.out.println("|    Enter the quantity of Shampoo   |");
            n5=s10.nextInt();
            System.out.println("|____________|");
            r5=n5*150;
        }
        if(flag5==6)
        {
            System.out.println("|____________|");
            System.out.println("|    Enter the quantity of Perfumes  |");
            n6=s10.nextInt();
            System.out.println("|____________|");
            r6=n6*250;

        }
        if(flag6==7)
        {
            System.out.println("|____________|");
            System.out.println("|    Enter the quantity of Rice Bag  |");
            n7=s10.nextInt();
            System.out.println("|____________|");
            r7=n7*1000;
        }

        if(flag7==8)
        {
            System.out.println("|____________|");
            System.out.println("|   Enter the quantity of Cooking Oil|");
            n8=s10.nextInt();
            System.out.println("|____________|");
            r8=n8*2000;
        }

        if(flag8==9)
        {
            System.out.println("|____________|");
            System.out.println("|    Enter the quantity of Cookies    |");
            n9=s10.nextInt();
            System.out.println("|____________|");
            r9=n9*200;
        }
        if(flag9==10)
        {
            System.out.println("|____________|");
            System.out.println("|   Enter the quantity of Milk Powder|");
            n10=s10.nextInt();
            System.out.println("|____________|");
            r10=n10*100;
        }
        total=r1+r2+r3+r4+r5+r6+r7+r8+r9+r10;
    }
    public static void Receipt(int []items,int n)//n means how many purchased
    {Scanner s5=new Scanner(System.in);
        int []quan=new int[n];
        for(int i=0;i<n;i++)
        {
            quan[i]=items[i];
        }

        System.out.println("|-----------------------------------|");
        System.out.println("|_____________|");
        System.out.println("|       BILLING   SECTION           |");
        System.out.println("|_____________|");
        System.out.println("|-----------------------------------|");
        System.out.println("|1) Add OR REMOVE OR CHANGE PRODUCT |");
        System.out.println("|                                   |");
        System.out.println("|2) PRINT BILL                      |");
        System.out.println("|-----------------------------------|");
        System.out.println("| Please Select Your Choice!        |");
        System.out.println("|-----------------------------------|");
        int choice=s5.nextInt();

        if(choice==1)
        {
            confirm(quan,n);
        }
        else if(choice ==2)
        {
            quantity(items, n);
            System.out.println("-------------------------------------------------------|");
            System.out.println("           RECEIPT  FOR YOUR PURCHASE                  |");
            System.out.println("___________________|");
            LocalDateTime now=LocalDateTime.now();
            DateTimeFormatter newnow=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String for_date=now.format(newnow);
            System.out.println("|                             IST : "+for_date+"|");
            System.out.println("-------------------------------------------------------|");
            System.out.println("       LIST OF PRODUCTS       || Quantity  ||  COST    |");
            System.out.println("-------------------------------------------------------|");
            System.out.println("___________________|");
            if(flag==1){
                System.out.println("|    -> Millets              |"+"        "+n1 +"    ||   "+r1+"     |");
            }
            if(flag1==2){
                System.out.println("|    -> Pulses               |"+"        "+n2 +"    ||   "+r2+"    |");
            }
            if(flag2==3){
                System.out.println("|    -> Soap                 |"+"        "+n3 +"    ||   "+r3+"     |");
            }
            if(flag3==4) {
                System.out.println("|    -> Detergent            |"+"        "+n4 +"    ||   "+r4+"     |");
            }
            if(flag4==5){
                System.out.println("|    -> Shampoo              |"+"        "+n5 +"    ||   "+r5+"     |");
            }
            if(flag5==6){
                System.out.println("|    -> Perfume              |"+"        "+n6 +"    ||   "+r6+"     |");
            }
            if(flag6==7) {
                System.out.println("|    -> Rice Bag             |"+"        "+n7 +"    ||   "+r7+"   |");
            }
            if(flag7==8) {
                System.out.println("|    -> Cooking Oil          |"+"        "+n8 +"    ||   "+r8+"   |");
            }
            if(flag8==9) {
                System.out.println("|    -> Cookies              |"+"        "+n9 +"    ||   "+r9+"    |");
            }
            if(flag9==10){
                System.out.println("|    -> Milk Powder          |"+"        "+n10+"    ||   "+r10+"    |");
            }
            System.out.println("-------------------------------------------------------|");
            System.out.println("          Total Cost          |"+"                    "+total);
            System.out.println("___________________|");
            System.out.println("-------------------------------------------------------|");
            System.out.println("          THANK YOU FOR PURCHASING VISIT US AGAIN      |");
            System.out.println("___________________|");
        }
    }
    static void confirm(int[] items,int purchased)
    {   int remaning=100-purchased;
        Scanner s7=new Scanner(System.in);
        int []itemsadd=new int[remaning];
        int choice;
        int c=-2;
        int lo=0;
        System.out.println("----------------------------------------------------|");
        System.out.println("           CONFIRM  YOUR PURCHASE                   |");
        System.out.println("__________________|");
        System.out.println("|    1) Add Product                                 |");
        System.out.println("|                                                   |");
        System.out.println("|    2) Remove product                              |");
        System.out.println("|                                                   |");
        System.out.println("|    3) Replace product                             |");
        System.out.println("|                                                   |");
        System.out.println("|    4) BacktoMainmenu                              |");
        System.out.println("|                                                   |");
        System.out.println("|---------------------------------------------------|");
        System.out.println("| Please Select Your Choice!                        |");
        System.out.println("|---------------------------------------------------|");
        choice=s7.nextInt();
        if(choice==1)
        {
            System.out.println("|--------------------------------------------------------------------------------------|");
            System.out.println("|       Please Choose the Product You Want to Add in Your Cart From the mentioned List |");
            System.out.println("|--------------------------------------------------------------------------------------|");
            //BUY();
            System.out.println("|_____________|");
            System.out.println("|---------------------------------------|");
            System.out.println("|    LIST OF PRODUCTS        || COST    |");
            System.out.println("|---------------------------------------|");
            System.out.println("|_____________|");
            System.out.println("|    1) Millets              | 80.00/kg |");
            System.out.println("|                                       |");
            System.out.println("|    2) Pulses               | 70.00/kg |");
            System.out.println("|                                       |");
            System.out.println("|    3) Soap                 | 30.00    |");
            System.out.println("|                                       |");
            System.out.println("|    4) Detergent            | 100.00   |");
            System.out.println("|                                       |");
            System.out.println("|    5) Shampoo              | 150.00   |");
            System.out.println("|                                       |");
            System.out.println("|    6) Perfume              | 250.00   |");
            System.out.println("|                                       |");
            System.out.println("|    7) Rice Bag             | 1000.00  |");
            System.out.println("|                                       |");
            System.out.println("|    8) Cooking Oil          | 2000.00  |");
            System.out.println("|                                       |");
            System.out.println("|    9) Cookies              | 200.00   |");
            System.out.println("|                                       |");
            System.out.println("|    10)Milk Powder          | 100.00   |");
            System.out.println("|---------------------------------------|");
            System.out.println("| You can Purchase these Products       |");
            System.out.println("|---------------------------------------|");
            System.out.println("|---------------------------------------|");
            System.out.println("| Please Select Your Choice!            |");
            System.out.println("|---------------------------------------|");
            System.out.println("|---------------------------------------|");
            System.out.println("| !!!NOTE : PRESS -1 TO EXIT CART LOBBY |");
            System.out.println("|------------------------------------------------------------------------------------------------------------------------|");
            System.out.println("Kindly mentioning you have alreadypurchased  "+":   "+ purchased +"   products ,so you have left to purchase "+"   "+remaning+":   "+"products only");
            System.out.println("|------------------------------------------------------------------------------------------------------------------------|");
            for(int i=0;i<10;i++)
            {
                choice=s7.nextInt();
                if(choice==-1)
                {
                    break;
                }
                else
                {
                    switch(choice)
                    {
                        case 1:
                            c=0;
                            itemsadd[i]=c;
                            lo++;
                            break;
                        case 2:
                            c=1;
                            itemsadd[i]=c;
                            lo++;
                            break;
                        case 3:
                            c=2;
                            itemsadd[i]=c;
                            lo++;
                            break;
                        case 4:
                            c=3;
                            itemsadd[i]=c;
                            lo++;
                            break;
                        case 5:
                            c=4;
                            itemsadd[i]=c;
                            lo++;
                            break;
                        case 6:
                            c=5;
                            itemsadd[i]=c;
                            lo++;
                            break;
                        case 7:
                            c=6;
                            itemsadd[i]=c;
                            lo++;
                            break;
                        case 8:
                            c=7;
                            itemsadd[i]=c;
                            lo++;
                            break;
                        case 9:
                            c=8;
                            itemsadd[i]=c;
                            lo++;
                            break;
                        case 10:
                            c=9;
                            itemsadd[i]=c;
                            lo++;
                            break;
                        default:
                            System.out.println("\tPlease choose items within the list");
                    }
                }
            }
            int ravan=lo+purchased;
            int []totalbill=new int[ravan];
            for(int i=0;i<purchased;i++)
            {
                totalbill[i]=items[i];
            }
            for(int i=0;i<lo;i++)
            {
                totalbill[purchased+i]=itemsadd[i];
            }
            System.out.println("-----------------------------------------------------------------------------------------------------|");
            System.out.println("Is their anything you want to ADD OR REMOVE OR CHANGE IF THEN ENTER [Y] FOR YES ELSE ENTER [N] FOR NO ");
            System.out.println("___________________________________|");
            String ch=s7.next();

            if(ch.equalsIgnoreCase("Y"))
            {
                confirm(totalbill,ravan);
            }
            else if(ch.equalsIgnoreCase("N")){
                quantity(totalbill, ravan);
                System.out.println("-------------------------------------------------------|");
                System.out.println("           RECEIPT  FOR YOUR PURCHASE                  |");
                System.out.println("___________________|");
                LocalDateTime now=LocalDateTime.now();
                DateTimeFormatter newnow=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                String for_date=now.format(newnow);
                System.out.println("|                             IST : "+for_date+" |");
                System.out.println("-------------------------------------------------------|");
                System.out.println("       LIST OF PRODUCTS       || Quantity  ||  COST    |");
                System.out.println("-------------------------------------------------------|");
                System.out.println("___________________|");
                if(flag==1){
                    System.out.println("|    -> Millets              |"+"        "+n1 +"    ||   "+r1+"     |");
                }
                System.out.println("|                                                   |");
                if(flag1==2){
                    System.out.println("|    -> Pulses               |"+"        "+n2 +"    ||   "+r2+"   |");
                }
                System.out.println("|                                                   |");
                if(flag2==3){
                    System.out.println("|    -> Soap                 |"+"        "+n3 +"    ||   "+r3+"     |");
                }
                System.out.println("|                                                   |");
                if(flag3==4) {
                    System.out.println("|    -> Detergent            |"+"        "+n4 +"    ||   "+r4+"     |");
                }
                System.out.println("|                                                   |");
                if(flag4==5){
                    System.out.println("|    -> Shampoo              |"+"        "+n5 +"    ||   "+r5+"     |");
                }
                System.out.println("|                                                   |");
                if(flag5==6){
                    System.out.println("|    -> Perfume              |"+"        "+n6 +"    ||   "+r6+"     |");
                }
                System.out.println("|                                                   |");
                if(flag6==7) {
                    System.out.println("|    -> Rice Bag             |"+"        "+n7 +"    ||   "+r7+"   |");
                }
                System.out.println("|                                                   |");
                if(flag7==8) {
                    System.out.println("|    -> Cooking Oil          |"+"        "+n8 +"    ||   "+r8+"   |");
                }
                System.out.println("|                                                   |");
                if(flag8==9) {
                    System.out.println("|    -> Cookies              |"+"        "+n9 +"    ||   "+r9+"   |");
                }
                System.out.println("|                                                   |");
                if(flag9==10){
                    System.out.println("|    -> Milk Powder          |"+"        "+n10+"    ||   "+r10+"    |");
                }
                System.out.println("-------------------------------------------------------|");
                System.out.println("          Total Cost          |"+"                    "+total);
                System.out.println("___________________|");
                System.out.println("-------------------------------------------------------|");
                System.out.println("          THANK YOU FOR PURCHASING VISIT US AGAIN      |");
                System.out.println("___________________|");
            }

        }
        else if(choice==2)
        {
            System.out.println("|-------------------------------------------------------------------------------------------------------------------|");
            System.out.println("|       Please Choose the Product You Want to Remove from Your Cart  mentioned below According to the product code  |");
            System.out.println("|-------------------------------------------------------------------------------------------------------------------|");
            for(int i=0;i<purchased;i++)
            {
                if(items[i]==0)
                {
                    flag=1;

                }
                else if(items[i]==1)
                {
                    flag1=2;

                }
                else if(items[i]==2)
                {
                    flag2=3;
                }
                else if(items[i]==3)
                {
                    flag3=4;
                }
                else if(items[i]==4)
                {
                    flag4=5;
                }
                else if(items[i]==5)
                {
                    flag5=6;
                }
                else if(items[i]==6)
                {
                    flag6=7;
                }
                else if(items[i]==7)
                {
                    flag7=8;
                }
                else if(items[i]==8)
                {
                    flag8=9;
                }
                else if(items[i]==9)
                {
                    flag9=10;
                }
            }

            System.out.println("-------------------------------------------------------|");
            System.out.println("           RECEIPT  FOR YOUR PURCHASE                  |");
            System.out.println("___________________|");
            LocalDateTime now=LocalDateTime.now();
            DateTimeFormatter newnow=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String for_date=now.format(newnow);
            System.out.println("|                             IST : "+for_date+" |");
            System.out.println("-------------------------------------------------------|");
            System.out.println("       LIST OF PRODUCTS       ||   Product code        |");
            System.out.println("-------------------------------------------------------|");
            System.out.println("___________________|");
            if(flag==1)
            {
                System.out.println("|    -> Millets               ||         0             |");
            }
            if(flag1==2)
            {
                System.out.println("|    -> Pulses                ||         1             |");
            }
            if(flag2==3){
                System.out.println("|    -> Soap                  ||         2             |");
            }
            if(flag3==4) {
                System.out.println("|    -> Detergent             ||         3             |");
            }
            if(flag4==5){
                System.out.println("|    -> Shampoo               ||         4             |");
            }
            if(flag5==6){
                System.out.println("|    -> Perfume               ||         5             |");
            }
            if(flag6==7) {
                System.out.println("|    -> Rice Bag              ||         6             |");
            }
            if(flag7==8) {
                System.out.println("|    -> Cooking Oil           ||         7             |");
            }
            if(flag8==9) {
                System.out.println("|    -> Cookies               ||         8             |");
            }
            if(flag9==10){
                System.out.println("|    -> Milk Powder           ||         9             |");
            }
            System.out.println("-------------------------------------------------------|");
            System.out.println("___________________|");
            System.out.println("|----------------------------------------------------------|");
            System.out.println("|please enter the product code that you wish to remove     |");
            System.out.println("|----------------------------------------------------------|");
            int removecode=s7.nextInt();
            Integer indexrey=null;
            for(int i=0;i<purchased;i++)
            {

                if(items[i]==removecode)
                {
                    indexrey=i;

                }
            }
            for(int i=indexrey;i<purchased;i++)
            {
                items[i]=items[i+1];
            }
            int []realitems=new int[purchased-1];
            for(int i=0;i<purchased-1;i++)
            {
                realitems[i]=items[i];
            }
            int f=0;
            int f1=0;
            int f2=0;
            int f3=0;
            int f4=0;
            int f5=0;
            int f6=0;
            int f7=0;
            int f8=0;
            int f9=0;
            for(int i=0;i<purchased-1;i++)
            {
                if(realitems[i]==0)
                {
                    f=1;

                }
                else if(realitems[i]==1)
                {
                    f1=2;

                }
                else if(realitems[i]==2)
                {
                    f2=3;
                }
                else if(realitems[i]==3)
                {
                    f3=4;
                }
                else if(realitems[i]==4)
                {
                    f4=5;
                }
                else if(realitems[i]==5)
                {
                    f5=6;
                }
                else if(realitems[i]==6)
                {
                    f6=7;
                }
                else if(realitems[i]==7)
                {
                    f7=8;
                }
                else if(realitems[i]==8)
                {
                    f8=9;
                }
                else if(realitems[i]==9)
                {
                    f9=10;
                }
            }
            if(f==1)
            {   System.out.println("|____________|");
                System.out.println("|    Enter the quantity of Millets   |");

                n1=s7.nextInt();
                System.out.println("|____________|");
                r1=n1*80;



            }
            if(f1==2)
            {   System.out.println("|____________|");
                System.out.println("|    Enter the quantity of Pulses    |");
                n2=s7.nextInt();
                System.out.println("|____________|");
                r2=n2*70;
            }
            if(f2==3)
            {
                System.out.println("|____________|");
                System.out.println("|    Enter the quantity of Soap      |");
                n3=s7.nextInt();
                System.out.println("|____________|");
                r3=n3*30;
            }
            if(f3==4)
            {
                System.out.println("|____________|");
                System.out.println("|    Enter the quantity of Detergent |");
                n4=s7.nextInt();
                System.out.println("|____________|");
                r4=n4*100;
            }
            if(f4==5)
            {
                System.out.println("|____________|");
                System.out.println("|    Enter the quantity of Shampoo   |");
                n5=s7.nextInt();
                System.out.println("|____________|");
                r5=n5*150;
            }
            if(f5==6)
            {
                System.out.println("|____________|");
                System.out.println("|    Enter the quantity of Perfumes  |");
                n6=s7.nextInt();
                System.out.println("|____________|");
                r6=n6*250;

            }
            if(f6==7)
            {
                System.out.println("|____________|");
                System.out.println("|    Enter the quantity of Rice Bag  |");
                n7=s7.nextInt();
                System.out.println("|____________|");
                r7=n7*1000;
            }

            if(f7==8)
            {
                System.out.println("|____________|");
                System.out.println("|   Enter the quantity of Cooking Oil|");
                n8=s7.nextInt();
                System.out.println("|____________|");
                r8=n8*2000;
            }

            if(f8==9)
            {
                System.out.println("|____________|");
                System.out.println("|    Enter the quantity of Cookies    |");
                n9=s7.nextInt();
                System.out.println("|____________|");
                r9=n9*200;
            }
            if(f9==10)
            {
                System.out.println("|____________|");
                System.out.println("|   Enter the quantity of Milk Powder|");
                n10=s7.nextInt();
                System.out.println("|____________|");
                r10=n10*100;
            }
            total=r1+r2+r3+r4+r5+r6+r7+r8+r9+r10;
            System.out.println("-------------------------------------------------------|");
            System.out.println("           RECEIPT  FOR YOUR PURCHASE                  |");
            System.out.println("___________________|");
            LocalDateTime now1=LocalDateTime.now();
            DateTimeFormatter newnow1=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String for_date1=now1.format(newnow1);
            System.out.println("|                             IST : "+for_date1+" |");
            System.out.println("-------------------------------------------------------|");
            System.out.println("       LIST OF PRODUCTS       || Quantity  ||  COST    |");
            System.out.println("-------------------------------------------------------|");
            System.out.println("___________________|");
            if(f==1){
                System.out.println("|    -> Millets              |"+"        "+n1 +"    ||   "+r1+"        |");
            }
            if(f1==2){
                System.out.println("|    -> Pulses               |"+"        "+n2 +"    ||   "+r2+"      |");
            }
            if(f2==3){
                System.out.println("|    -> Soap                 |"+"        "+n3 +"    ||   "+r3+"        |");
            }
            if(f3==4) {
                System.out.println("|    -> Detergent            |"+"        "+n4 +"    ||   "+r4+"        |");
            }
            if(f4==5){
                System.out.println("|    -> Shampoo              |"+"        "+n5 +"    ||   "+r5+"        |");
            }
            if(f5==6){
                System.out.println("|    -> Perfume              |"+"        "+n6 +"    ||   "+r6+"     |");
            }
            if(f6==7) {
                System.out.println("|    -> Rice Bag             |"+"        "+n7 +"    ||   "+r7+"   |");
            }
            if(f7==8) {
                System.out.println("|    -> Cooking Oil          |"+"        "+n8 +"    ||   "+r8+"   |");
            }
            if(f8==9) {
                System.out.println("|    -> Cookies              |"+"        "+n9 +"    ||   "+r9+"   |");
            }
            if(f9==10){
                System.out.println("|    -> Milk Powder          |"+"        "+n10+"    ||   "+r10+"    |");
            }
            System.out.println("-------------------------------------------------------|");
            System.out.println("          Total Cost          |"+"                    "+total);
            System.out.println("___________________|");
            System.out.println("-------------------------------------------------------|");
            System.out.println("          THANK YOU FOR PURCHASING VISIT US AGAIN      |");
            System.out.println("___________________|");

        }
        else if(choice==3)
        {
            Replace(items,purchased);
        }
    }
    static void Replace(int []replaceitems,int purchased)
    {   Scanner s11=new Scanner(System.in);
        System.out.println("|-------------------------------------------------------------------------------------------------------------------|");
        System.out.println("|       Please Choose the Product You Want to change from Your Cart According to the product code    mentioned below|");
        System.out.println("|-------------------------------------------------------------------------------------------------------------------|");
        for(int i=0;i<purchased;i++)
        {
            if(replaceitems[i]==0)
            {
                flag=1;

            }
            else if(replaceitems[i]==1)
            {
                flag1=2;

            }
            else if(replaceitems[i]==2)
            {
                flag2=3;
            }
            else if(replaceitems[i]==3)
            {
                flag3=4;
            }
            else if(replaceitems[i]==4)
            {
                flag4=5;
            }
            else if(replaceitems[i]==5)
            {
                flag5=6;
            }
            else if(replaceitems[i]==6)
            {
                flag6=7;
            }
            else if(replaceitems[i]==7)
            {
                flag7=8;
            }
            else if(replaceitems[i]==8)
            {
                flag8=9;
            }
            else if(replaceitems[i]==9)
            {
                flag9=10;
            }
        }
        System.out.println("----------------------------------------------------|");
        System.out.println("           RECEIPT  FOR YOUR PURCHASE               |");
        System.out.println("__________________|");
        System.out.println("----------------------------------------------------|");
        System.out.println("       LIST OF PRODUCTS       ||   Product code     |");
        System.out.println("----------------------------------------------------|");
        System.out.println("__________________|");
        if(flag==1)
        {
            System.out.println("|    1) Millets               ||         0          |");
        }
        if(flag1==2)
        {
            System.out.println("|    2) Pulses                ||         1          |");
        }
        if(flag2==3){
            System.out.println("|    3) Soap                  ||         2          |");
        }
        if(flag3==4) {
            System.out.println("|    4) Detergent             ||         3          |");
        }
        if(flag4==5){
            System.out.println("|    5) Shampoo               ||         4          |");
        }
        if(flag5==6){
            System.out.println("|    6) Perfume               ||         5          |");
        }
        if(flag6==7) {
            System.out.println("|    7) Rice Bag              ||         6          |");
        }
        if(flag7==8) {
            System.out.println("|    8) Cooking Oil           ||         7          |");
        }
        if(flag8==9) {
            System.out.println("|    9) Cookies               ||         8          |");
        }
        if(flag9==10){
            System.out.println("|    10)Milk Powder           ||         9          |");
        }
        System.out.println("----------------------------------------------------|");
        System.out.println("|-------------------------------------------------------|");
        System.out.println("|please enter the product code that you wish to remove  |");
        System.out.println("|-------------------------------------------------------|");
        int replaceprocode=s11.nextInt();
        int replaceindex=0;
        for(int i=0;i<purchased;i++)
        {
            if(replaceitems[i]==replaceprocode)
            {
                replaceindex=i;
            }
        }
        int remaning =100-purchased;

        System.out.println("|------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("Kindly mentioning you have alreadypurchased  "+":   "+ purchased +"   products ,so you have left to purchase "+"   "+remaning+":   "+"products only");
        System.out.println("|------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("----------------------------------------------------|");
        System.out.println("           RECEIPT  FOR YOUR PURCHASE               |");
        System.out.println("__________________|");
        System.out.println("----------------------------------------------------|");
        System.out.println("       LIST OF PRODUCTS       ||   Product code     |");
        System.out.println("----------------------------------------------------|");
        System.out.println("__________________|");

        System.out.println("|    1) Millets               ||         0          |");

        System.out.println("|                                                   |");

        System.out.println("|    2) Pulses                ||         1          |");

        System.out.println("|                                                   |");

        System.out.println("|    3) Soap                  ||         2          |");

        System.out.println("|                                                   |");

        System.out.println("|    4) Detergent             ||         3          |");

        System.out.println("|                                                   |");

        System.out.println("|    5) Shampoo               ||         4          |");

        System.out.println("|                                                   |");

        System.out.println("|    6) Perfume               ||         5          |");

        System.out.println("|                                                   |");

        System.out.println("|    7) Rice Bag              ||         6          |");

        System.out.println("|                                                   |");

        System.out.println("|    8) Cooking Oil           ||         7          |");

        System.out.println("|                                                   |");

        System.out.println("|    9) Cookies               ||         8          |");

        System.out.println("|                                                   |");

        System.out.println("|    10)Milk Powder           ||         9          |");

        System.out.println("----------------------------------------------------|");
        System.out.println("|---------------------------------------------------------------------------|");
        System.out.println("|please enter the product code that you wish to replace from the given list |");
        System.out.println("|---------------------------------------------------------------------------|");
        int replacemaincode=s11.nextInt();
        replaceitems[replaceindex]=replacemaincode;
        for(int i=0;i<purchased;i++)
        {
            System.out.println(replaceitems[i]);
        }
    }
    public static void main(String[] args)
    {
        menu();
    }
}