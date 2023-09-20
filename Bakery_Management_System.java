package com.company;


import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Bakery_Management_System {
    public static void main(String[]args) throws FileNotFoundException {
        System.out.println();
        System.out.println("                ****Project By Saima Rani, Javeria Hassan, Anum Naz, Hassaan Ali and Sameer Nadeem****");
        System.out.println();
        System.out.println("                                  // Username: Admin & Password: 12345");
        System.out.println();
        System.out.println("================================================================================================================================================================");
        System.out.println("                                    B A K E R Y   M A N A G M E N T    S Y S T E M !!");
        System.out.println("================================================================================================================================================================");

        select_Option();

    }
    //THIS METHOD SHOWS THE MAIN MENU
    public static void select_Option() throws FileNotFoundException {

        System.out.println("                                    ****************************************");
        System.out.println("                                                 M A I N   M E N U        ");
        System.out.println("                                    ****************************************");

        Scanner input = new Scanner(System.in);
        int choice=0;
        boolean bool = true;
        while (bool) {
            try {
                System.out.println("1= ADMIN");
                System.out.println("2= CUSTOMER FEEDBACK");
                System.out.println("ENTER ANY OTHER NUMBER TO EXIT");
                System.out.println();
                System.out.print("PLEASE ENTER ONE OF THE ABOVE OPTIONS:");
                choice = input.nextInt();
                bool = false;
            } catch (InputMismatchException ex) {
                System.out.println("TRY AGAIN! INPUT MUST BE INTEGER");
                input.nextLine();
            }
        }
        if (choice == 1)
            Admin();
        else if (choice == 2)
            Customer_Feedback();
        else {
            System.out.println(" *** Thank you and GOOD BYE  ***");
            System.out.println(" ***  Program terminated successfully  ***");
            System.exit(0);
        }
    }


    //ADMIN BLOCK
    public static void Admin() throws FileNotFoundException {
        System.out.println("=====================================================================================================");
        System.out.println("                                           A D M I N    B L O C K !!          ");
        System.out.println("=====================================================================================================");
        System.out.println();
        System.out.println("                                            * * * * L O G I N * * * * ");

        //USERNAME AND PASSWORD MUST BE ENTERED TO LOGIN THE ADMIN BLOCK
        Scanner input = new Scanner(System.in);
        String Username;
        String Password;
        Username = "Admin";
        Password = "12345";
        int chance = 0;
        // 3 CHANCES ARE GIVEN TO ACCESS THE ADMIN BLOCK THROUGH THE USERNAME AND PASSWORD
        while (chance < 3) {
            Scanner input1 = new Scanner(System.in);
            System.out.println("Only Admin can access this block!!");
            System.out.print("Enter Username : ");
            String username = input1.next();
            Scanner input2 = new Scanner(System.in);
            System.out.print("Enter Password : ");
            String password = input2.next();
            if (username.equals(Username) && password.equals(Password)) {
                System.out.println();
                System.out.println("                                         ACCESS GRANTED! W E L C O M E!");
                System.out.println();
                Choices();
            } else if (username.equals(Username)) {
                System.out.println("Invalid Password!");
            } else if (password.equals(Password)) {
                System.out.println("Invalid Username!");
            } else {
                System.out.println("Invalid Username & Password!");
                chance++;
            }
        }
    }

    //METHOD TO SHOW THE ENTITIES INSIDE THE ADMIN BLOCK
    public static void Choices() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        int ans=0;
        boolean bool=true;
        while (bool){
            try{
                System.out.println("1= BUDGET  AND  SALARY BLOCK");
                System.out.println("2= EMPLOYEE BLOCK");
                System.out.println("3= ORDER BLOCK");
                System.out.println("4= BAKERY STOCK BLOCK");
                System.out.println("5= EXIT");
                System.out.println();
                System.out.print("PLEASE ENTER YOUR OPTION:");
                ans=input.nextInt();
                bool=false;
            }
            catch (InputMismatchException ex){
                System.out.println("TRY AGAIN, INPUT MUST BE AN INTEGER!");
                input.nextLine();
            }

            if (ans==1){
                Budget_and_Salary_Block();
            }

            else if (ans==2){
                Employee_Block();
            }

            else if (ans == 3){
                Customer_Block();
            }
            else if (ans == 4){
                Bakery_Stock__block();
            }
            else if(ans == 5){
                System.out.println("Returning back to the main menu!");
                select_Option();
            }

        }
    }

    //METHODS FOR THE BUDGET AND SALARY BLOCK
    public static void Budget_and_Salary_Block() throws FileNotFoundException {


        System.out.println("=============================================================================================================");
        System.out.println("                              B U D G E T   A N D  S A L A R I E S  B L O C K");
        System.out.println("=============================================================================================================");
        System.out.println();
        Scanner input = new Scanner(System.in);
        int choice = 0;
        boolean bool = true;
        while (true) {
            try {
                System.out.println();
                //THIS BLOCK HAS THREE ENTITIES WHICH CAN BE ACCESSED BY THE ADMIN
                System.out.println("1= BUDGET");
                System.out.println("2= SALARY");
                System.out.println("3= EXIT");
                System.out.println();
                System.out.print("ENTER YOUR OPTION:");
                choice = input.nextInt();
                bool = false;
            } catch (InputMismatchException ex) {
                System.out.println("INVALID INPUT!! INPUT MUST BE AN INTEGER");
                input.nextLine();
            }

            if (choice == 1)
                Budget();
            else if (choice == 2)
                Salary();
            else if (choice == 3) {
                System.out.println("Thank you and GOOD BYE!!!");
                System.out.println();
                Choices();
            }

        }
    }

    //METHOD FOR BUDGET
    public static void Budget() throws FileNotFoundException {
        Scanner input=new Scanner(System.in);
        System.out.println("==============================================================================================================");
        System.out.println("                                                      B U D G E T");
        System.out.println("==============================================================================================================");
        //A SECURITY KEY IS SET. TO ACCESS THE BUDGET THE SECURITY KEY MUST BE ENTERED CORRECTLY
        int key = 0;
        int security_key=0;
        long total_budget=0;
        boolean bool1=true;
        boolean bool2=true;
        int chance = 0;
        while (chance < 2) {
            while (bool1){
                try{
                    System.out.println("Enter Security key(1**4):");
                    security_key=input.nextInt();
                    bool1=false;
                }catch(InputMismatchException ex){
                    System.out.println("TRY AGAIN, INPUT MUST BE AN INTEGER!");
                    input.nextLine();
                }
            }

            if (security_key==1234){
                System.out.println("You can access the salary block!!");

                while (bool2){
                    try{
                        System.out.print("Enter the TOTAL BUDGET(Donot exceed with 1000000000):");
                        total_budget=input.nextInt();
                        bool2=false;
                    }catch(InputMismatchException ex){
                        System.out.println("TRY AGAIN, INPUT MUST BE AN INTEGER!");
                        input.nextLine();
                    }
                }

                int choice=0;
                while (choice!=6){
                    try{
                        System.out.println();
                        System.out.println("1= Add an EXPENSE");
                        System.out.println("2= Remove an EXPENSE");
                        System.out.println("3= Add an REVENUE");
                        System.out.println("4= Remove an RENENUE");
                        System.out.println("5= Check Budget");
                        System.out.println("6= EXIT");
                        System.out.print("ENTER YOUR OPTION:");
                        choice=input.nextInt();
                        System.out.println();
                    }
                    catch(InputMismatchException ex){
                        System.out.println("TRY AGAIN, INPUT MUST BE AN INTEGER!");
                        input.nextLine();
                        System.out.println();
                    }
                    if (choice==1)
                        total_budget=Add_EXPENSE(total_budget);
                    else if(choice==2)
                        total_budget=Remove_EXPENSE(total_budget);
                    else if(choice==3)
                        total_budget=Add_REVENUE(total_budget);
                    else if(choice==4)
                        total_budget=Remove_REVENUE(total_budget);
                    else if(choice==5)
                        total_budget=Check_BUDGET(total_budget);
                    else if(choice==6){
                        System.out.println("THANK YOU and GOOD BYE!");
                        Budget_and_Salary_Block();
                    }

                    else
                        System.out.print("Invalid entry! Please enter 1-6");
                }
            }
            else
                System.out.println("You cannot access the Salary Block! Retry");
            chance ++;
        }
    }

    //METHOD FOR ADDING THE EXPENSE
    public static long Add_EXPENSE( long TotalBudget){
        long Bill=0;
        long ManyBills=0;
        long TotalBill;
        boolean bool1=true;
        boolean bool2=true;
        Scanner input=new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.println("                 A D D - E X P E N S E");
        System.out.println("=======================================================");
        while (bool1){
            try{
                System.out.print("Enter the Expense amount:");
                Bill=input.nextInt();
                bool1=false;
            }catch(InputMismatchException ex){
                System.out.println("INVALID ENTRY!! PLEASE ENTER AN INTEGER!");
                input.nextLine();
            }

        }
        while (bool2){
            try{
                System.out.print("Enter the frequency of the Expense per month:");
                ManyBills=input.nextInt();
                bool2=false;
            }catch(InputMismatchException ex){
                System.out.println("INVALID ENTRY!! PLEASE ENTER AN INTEGER!");
                input.nextLine();
            }

        }

        TotalBill= Bill*ManyBills;
        TotalBudget= TotalBudget - TotalBill;
        System.out.print("Now after the addition in Expense: " + TotalBudget);
        return TotalBudget;
    }

    //METHOD FOR REMOVING THE EXPENSE
    public static long Remove_EXPENSE(long TotalBudget){
        long LessBill=0;
        long ManyLessBills=0;
        long TotalLessBill;
        boolean bool1=true;
        boolean bool2=true;
        Scanner input=new Scanner(System.in);
        System.out.println("========================================================");
        System.out.println("                 R E M O V E - E X P E N S E");
        System.out.println("========================================================");
        while(bool1){
            try {
                System.out.print("Enter the amount to remove:");
                LessBill=input.nextInt();
                bool1=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID ENTRY!! PLEASE ENTER AN INTEGER!");
                input.nextLine();
            }
        }
        while(bool2){
            try {
                System.out.print("Enter the frequency of Expense Removal per month:");
                ManyLessBills=input.nextInt();
                bool2=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID ENTRY!! PLEASE ENTER AN INTEGER!");
                input.nextLine();
            }
        }

        TotalLessBill=LessBill*ManyLessBills;
        System.out.print("Now after the removal of Expense: "+ TotalLessBill);
        if (TotalLessBill <= TotalBudget){
            TotalBudget= TotalBudget + TotalLessBill;
        }else
            System.out.print("ERROR!! RECHECK PLZ");
        return TotalBudget;
    }

    //METHOD FOR ADDING THE REVENUE
    public static long Add_REVENUE(long TotalBudget ){
        long Income=0;
        Scanner input=new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.println("                A D D - R E V E N U E");
        System.out.println("=======================================================");
        boolean bool=true;
        while(bool){
            try{
                System.out.print("Enter the amount of additional income:");
                Income=input.nextInt();
                bool=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID ENTRY!! PLEASE ENTER AN INTEGER!");
                input.nextLine();
            }
        }

        TotalBudget= TotalBudget + Income;
        System.out.print("Now after the addition in Revenue:"+TotalBudget);
        return TotalBudget;
    }

    //METHOD FOR REMOVING TEH REVENUE
    public static long Remove_REVENUE(long TotalBudget){
        long LossIncome=0;
        Scanner input=new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.println("                R E M O V E -R E V E N U E");
        System.out.println("=======================================================");
        boolean bool=true;
        while (bool){
            try{
                System.out.print("Enter the amount of income to be removed:");
                LossIncome=input.nextInt();
                bool=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID ENTRY!! PLEASE ENTER AN INTEGER!");
                input.nextLine();
            }
        }
        TotalBudget= TotalBudget - LossIncome;
        System.out.print("Now After the removal of Revenue: " + TotalBudget);
        return TotalBudget;
    }

    //METHOD FOR CHECKING THE BUDGET
    public static long Check_BUDGET(long TotalBudget){
        if (TotalBudget>=0){
            System.out.println("==============================================");
            System.out.println("        C H E C K - B U D G E T");
            System.out.println("==============================================");
            System.out.print("The remaining budget is:" + TotalBudget);

        }
        else{
            System.out.println("You have exceeded the monthly budget");
            System.out.println("");
            System.out.println("Re-evaluate your expenses and balance the budget");
            System.out.println("CURRENT BALANCE:"+TotalBudget);
        }

        return TotalBudget;
    }

    //METHODS FOR THE SALARY BLOCK
    public static void Salary()throws FileNotFoundException{
        Scanner input=new Scanner(System.in);
        double total_salary=10000000;
        System.out.println("==============================================================================================================");
        System.out.println("                                                    S A L A R I E S");
        System.out.println("==============================================================================================================");
        // LIKE THE BUDGET BLOCK, THE SALARY BLOCK IS ALSO PASSWORD PROTECTED
        int security_key=0;
        int chance=0;
        boolean bool1=true;
        boolean bool2=true;
        while(bool1){
            try{
                System.out.println("Enter Security key(5**8):");
                security_key=input.nextInt();
                bool1=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID ENTRY!! PLEASE ENTER AN INTEGER!");
                input.nextLine();

            }
        }
        if (security_key==5678){
            System.out.println("You can access the salary block!!");
            int occupation=0;
            while (occupation!=7){
                System.out.println();
                System.out.println("1:occ_1 = Manager ");
                System.out.println("2:occ_2 = Chef");
                System.out.println("3:occ_3 = Baker_Chef");
                System.out.println("4:occ_4 = Salesman");
                System.out.println("5:occ_5 = Kitchen_Staff");
                System.out.println("6:occ_6 = Receptionist");
                System.out.println("7       = EXIT");
                while(bool2){
                    try{
                        System.out.print("ENTER YOUR OPTION:");
                        occupation=input.nextInt();
                        bool2=false;
                    }catch (InputMismatchException ex){
                        System.out.println("INVALID ENTRY!! PLEASE ENTER AN INTEGER!");
                        input.nextLine();
                    }
                }

                System.out.println();
                if (occupation==1){
                    total_salary = Manager_Salary(total_salary);
                    break;
                }
                else if(occupation==2){
                    total_salary= Chef_Salary(total_salary);
                    break;
                }
                else if(occupation==3){
                    total_salary= Baker_chef_Salary(total_salary);
                    break;
                }
                else if(occupation==4){
                    total_salary= Salesman_Salary(total_salary);
                    break;
                }
                else if(occupation==5){
                    total_salary=Kitchen_Staff_Salary(total_salary);
                    break;
                }
                else if(occupation==6){
                    total_salary=Receptionist_Salary(total_salary);
                    break;
                }
                else if(occupation==7){
                    System.out.println("THANK YOU and GOOD BYE!");
                    break;
                }
                else{
                    break;
                }
            }
        }
        else
            System.out.println("You cannot access the Salary Block! Retry");
        chance++;
    }

    //METHOD FOR CHECKING THE SALARY OF THE MANAGER OF THE BAKERY
    public static double Manager_Salary(double TotalSalary){
        boolean bool1=true;
        boolean bool2=true;
        boolean bool3=true;
        boolean bool4=true;
        System.out.println("=======================================================");
        System.out.println("                     Manager Salary");
        System.out.println("=======================================================");
        int Fix_bonus=7000;//per month
        // double Manager_sal;
        double gs=0;
        double it=0;
        double pt=0;
        double pf=0;
        double netSalary=0;

        Scanner input=new Scanner(System.in);
        while(bool1){
            try{
                System.out.print("Enter the the gross salary of Manager : ");
                gs= input.nextDouble();
                bool1=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID INPUT!! PLEASE ENTER A DOUBLE VALUE");
                input.nextLine();
            }
        }

        while(bool2){
            try{
                System.out.print("Enter Income Tax % : ");
                it=input.nextDouble();
                bool2=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID INPUT!! PLEASE ENTER A DOUBLE VALUE");
                input.nextLine();
            }
        }

        while(bool3){
            try{
                System.out.print("Enter Professional Tax % : ");
                pt=input.nextDouble();
                bool3=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID INPUT!! PLEASE ENTER A DOUBLE VALUE");
                input.nextLine();
            }
        }

        while(bool4){
            try{
                System.out.print("Enter Provident Fund % : ");
                pf=input.nextDouble();
                bool4=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID INPUT!! PLEASE ENTER A DOUBLE VALUE");
                input.nextLine();
            }
        }

        pf=pf*(gs/100);
        it=it*(gs/100);
        pt=pt*(gs/100);
        netSalary=gs-it-pt-pf+Fix_bonus;
        System.out.println("Net Salary is="+netSalary);

        System.out.println(netSalary+" :This is your total salary  after removing the taxes and adding BONUS!!");
        return TotalSalary;

    }

    //METHOD FOR CHECKING THE SALARY OF THE CHEF OF THE BAKERY
    public static double Chef_Salary(double TotalSalary){
        System.out.println("=========================================================");
        System.out.println("                        Chef Salary");
        System.out.println("=========================================================");
        int Fix_bonus=5000;//per month
        //double Chef_sal;
        double gs=0;
        double it=0;
        double pt=0;
        double pf=0;
        double netSalary=0;
        boolean bool1=true;
        boolean bool2=true;
        boolean bool3=true;
        boolean bool4=true;

        Scanner input=new Scanner(System.in);
        while(bool1){
            try{
                System.out.print("Enter the the gross salary of Chef:");
                gs= input.nextDouble();
                bool1=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID INPUT!! PLEASE ENTER A DOUBLE VALUE");
                input.nextLine();
            }
        }
        while(bool2){
            try{
                System.out.print("Enter Income Tax %");
                it=input.nextDouble();
                bool2=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID INPUT!! PLEASE ENTER A DOUBLE VALUE");
                input.nextLine();
            }
        }
        while(bool3){
            try{
                System.out.print("Enter Professional Tax %");
                pt=input.nextDouble();
                bool3=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID INPUT!! PLEASE ENTER A DOUBLE VALUE");
                input.nextLine();
            }
        }
        while(bool4){
            try{
                System.out.print("Enter Provident Fund %");
                pf=input.nextDouble();
                bool4=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID INPUT!! PLEASE ENTER A DOUBLE VALUE");
                input.nextLine();
            }
        }

        pf=pf*(gs/100);
        it=it*(gs/100);
        pt=pt*(gs/100);
        netSalary=gs-it-pt-pf+Fix_bonus;
        System.out.println("Net Salary is="+netSalary);

        System.out.println(netSalary+" :This is your total salary  after removing the taxes and adding BONUS!!");
        return TotalSalary;
    }

    //METHOD FOR CHECKING THE SALARY OF THE BAKER CHEF OF THE BAKERY
    public static double Baker_chef_Salary(double TotalSalary){
        System.out.println("=========================================================");
        System.out.println("                  Baker_Chef Salary");
        System.out.println("=========================================================");
        int Fix_bonus=5000;//per month
        // double Baker_Chef ;
        double gs=0;
        double it=0;
        double pt=0;
        double pf=0;
        double netSalary=0;
        boolean bool1=true;
        boolean bool2=true;
        boolean bool3=true;
        boolean bool4=true;
        Scanner input=new Scanner(System.in);
        while(bool1){
            try{
                System.out.print("Enter the the gross salary of Baker : ");
                gs= input.nextDouble();
                bool1=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID INPUT!! PLEASE ENTER A DOUBLE VALUE");
                input.nextLine();
            }
        }
        while(bool2){
            try{
                System.out.print("Enter Income Tax % : ");
                it=input.nextDouble();
                bool2=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID INPUT!! PLEASE ENTER A DOUBLE VALUE");
                input.nextLine();
            }
        }
        while(bool3){
            try{
                System.out.print("Enter Professional Tax % : ");
                pt=input.nextDouble();
                bool3=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID INPUT!! PLEASE ENTER A DOUBLE VALUE");
                input.nextLine();
            }
        }
        while(bool4){
            try{
                System.out.print("Enter Provident Fund % : ");
                pf=input.nextDouble();
                bool4=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID INPUT!! PLEASE ENTER A DOUBLE VALUE");
                input.nextLine();
            }
        }

        pf=pf*(gs/100);
        it=it*(gs/100);
        pt=pt*(gs/100);
        netSalary=gs-it-pt-pf+Fix_bonus;
        System.out.println("Net Salary is="+netSalary);

        System.out.println(netSalary+" :This is your total salary  after removing the taxes and adding BONUS!!");
        return TotalSalary;
    }

    //METHOD FOR CHECKING THE SALARY OF THE SALESMAN OF THE BAKERY
    public static double Salesman_Salary(double TotalSalary){
        System.out.println("=========================================================");
        System.out.println("                     Salesman Salary");
        System.out.println("=========================================================");
        int Fix_bonus=1000;//per month
        //long salesman_sal;
        double gs=0;
        double it=0;
        double pt=0;
        double pf=0;
        double netSalary=0;
        boolean bool1=true;
        boolean bool2=true;
        boolean bool3=true;
        boolean bool4=true;
        Scanner input=new Scanner(System.in);
        while(bool1){
            try{
                System.out.print("Enter the the gross salary of Salesman  : ");
                gs= input.nextDouble();
                bool1=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID INPUT!! PLEASE ENTER A DOUBLE VALUE");
                input.nextLine();
            }
        }
        while(bool2){
            try{
                System.out.print("Enter Income Tax % : ");
                it=input.nextDouble();
                bool2=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID INPUT!! PLEASE ENTER A DOUBLE VALUE");
                input.nextLine();
            }
        }
        while(bool3){
            try{
                System.out.print("Enter Professional Tax % : ");
                pt=input.nextDouble();
                bool3=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID INPUT!! PLEASE ENTER A DOUBLE VALUE");
                input.nextLine();
            }
        }
        while(bool4){
            try{
                System.out.print("Enter Provident Fund % : ");
                pf=input.nextDouble();
                bool4=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID INPUT!! PLEASE ENTER A DOUBLE VALUE");
                input.nextLine();
            }
        }

        pf=pf*(gs/100);
        it=it*(gs/100);
        pt=pt*(gs/100);
        netSalary=gs-it-pt-pf+Fix_bonus;
        System.out.println("Net Salary is="+netSalary);

        System.out.println(netSalary+" :This is your total salary  after removing the taxes and adding BONUS!!");
        return TotalSalary;
    }

    //METHOD FOR CHECKING THE SALARY OF THE KITCHEN STAFF OF THE BAKERY
    public static double Kitchen_Staff_Salary(double TotalSalary){
        System.out.println("=========================================================");
        System.out.println("                 Kitchen_Staff   Salary");
        System.out.println("=========================================================");
        int Fix_bonus=1000;//per month
        //long kitchen_sal;
        double gs=0;
        double it=0;
        double pt=0;
        double pf=0;
        double netSalary=0;
        boolean bool1=true;
        boolean bool2=true;
        boolean bool3=true;
        boolean bool4=true;
        Scanner input=new Scanner(System.in);
        while(bool1){
            try{
                System.out.print("Enter the the gross salary of Kitchen_Staff  : ");
                gs= input.nextDouble();
                bool1=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID INPUT!! PLEASE ENTER A DOUBLE VALUE");
                input.nextLine();
            }
        }
        while(bool2){
            try{
                System.out.print("Enter Income Tax % : ");
                it=input.nextDouble();
                bool2=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID INPUT!! PLEASE ENTER A DOUBLE VALUE");
                input.nextLine();
            }
        }
        while(bool3){
            try{
                System.out.print("Enter Professional Tax % : ");
                pt=input.nextDouble();
                bool3=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID INPUT!! PLEASE ENTER A DOUBLE VALUE");
                input.nextLine();
            }
        }
        while(bool4){
            try{
                System.out.print("Enter Provident Fund % : ");
                pf=input.nextDouble();
                bool4=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID INPUT!! PLEASE ENTER A DOUBLE VALUE");
                input.nextLine();
            }
        }

        pf=pf*(gs/100);
        it=it*(gs/100);
        pt=pt*(gs/100);
        netSalary=gs-it-pt-pf+Fix_bonus;
        System.out.println("Net Salary is="+netSalary);

        System.out.println(netSalary+" :This is your total salary  after removing the taxes and adding BONUS!!");
        return TotalSalary;
    }

    //METHOD FOR CHECKING THE SALARY OF THE RECEPTIONIST OF THE BAKERY
    public static double Receptionist_Salary(double TotalSalary){
        System.out.println("=========================================================");
        System.out.println("                  Receptionist Salary");
        System.out.println("=========================================================");
        int Fix_bonus=1000;//per month
        //long receptionist_sal;
        double gs=0;
        double it=0;
        double pt=0;
        double pf=0;
        double netSalary=0;
        boolean bool1=true;
        boolean bool2=true;
        boolean bool3=true;
        boolean bool4=true;
        Scanner input=new Scanner(System.in);
        while(bool1){
            try{
                System.out.print("Enter the the gross salary of Receptionist  : ");
                gs= input.nextDouble();
                bool1=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID INPUT!! PLEASE ENTER A DOUBLE VALUE");
                input.nextLine();
            }
        }
        while(bool2){
            try{
                System.out.print("Enter Income Tax % : ");
                it=input.nextDouble();
                bool2=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID INPUT!! PLEASE ENTER A DOUBLE VALUE");
                input.nextLine();
            }
        }
        while(bool3){
            try{
                System.out.print("Enter Professional Tax % : ");
                pt=input.nextDouble();
                bool3=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID INPUT!! PLEASE ENTER A DOUBLE VALUE");
                input.nextLine();
            }
        }
        while(bool4){
            try{
                System.out.print("Enter Provident Fund % : ");
                pf=input.nextDouble();
                bool4=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID INPUT!! PLEASE ENTER A DOUBLE VALUE");
                input.nextLine();
            }
        }

        pf=pf*(gs/100);
        it=it*(gs/100);
        pt=pt*(gs/100);
        netSalary=gs-it-pt-pf+Fix_bonus;
        System.out.println("Net Salary is="+netSalary);

        System.out.println(netSalary+" :This is your total salary  after removing the taxes and adding BONUS!!");
        return TotalSalary;
    }

    //WELCOME TO THE EMPLOYEE BLOCK
    public static void Employee_Block() throws FileNotFoundException {
        System.out.println("=====================================================================================================");
        System.out.println("                                  E M P L O Y E E     B L O C K !!        ");
        System.out.println("=====================================================================================================");
        System.out.println();
        //THESE 5 ARE THE ATTRIBUTES OF THE EMPLOYEE ENTITY
        System.out.print("1= ADD EMPLOYEE DETAILS\n" +
                "2= SEARCH EMPLOYEE DETAILS \n" +
                "3= VIEW EMPLOYEE DETAILS\n" +
                "4= DELETE EMPLOYEE DETAILS\n" +
                "5= UPDATE EMPLOYEE DETAILS \n" +
                "6= EXIT\n");
        System.out.println();
        System.out.print("Enter one of the above choices : ");
        SelectOption();
    }

    static int[] IDList = new int[]{1000, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static String[] NameList = new String[]{"Ali", "Ahmed", "Zahid", "Mujtaba", "Zahra", "Hashim", "Abazar", "Hamed", "Zainab", "Mehdi", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"};
    static String[] Gender = new String[]{"male", "male", "\tmale", "Male", "\tFemale", "\tMale", "Male", "Male", "Female", "Male", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"};
    static String[] DOB = new String[]{"22/5/1990", "12/6/1991", "9/7/1992", "2/12/1990", "5/4/1989", "6/2/1987", "22/8/1995", "30/3/1986", "15/3/1993", "29/1/1985", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"};
    static String[] Email = new String[]{"ali57@gmail.com", "ahmed@gmail.com", "zahid124@gmail.com", "mujtaba5@gmail.com", "zahraBano@gmail.com", "hashim21@gmail.com", "abazarmehdi@gmail.com", "hamed98@gmail.com", "zainab3@gmail.com","mehdi512@gmail.com","0", "0", "0", "0", "0", "0", "0", "0", "0"};
    static String[] Occupation = new String[]{"\tSalesman", "\tReciptionist", "Salesman", "Salesman", "Cheif", "Baker Chief", "Salesman", "\tSalesman", "\tReciptionist", "Manager", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"};
    static String[] Contact = new String[]{"\t03345333101", "03356783926", "\t03005467383", "\t03121009292", "\t03349873622", "03321456737", "\t03008726182", "\t03214232890", "03456289183", "\t03337684378", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"};
    static String[] Address = new String[]{"Bahria,Islamabad", "I-9/1,Islamabad", "Askari14,Islamabad", "PWD,Rawalpindi", "Faisal_town,Rawalpindi", "I-10/4,Islamabad", "G-11,Islamabad", "E-11,Islamabad", "I-8/4,Islamabad", "Blue area,Islamabad", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"};

    public static void SelectOption() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        int answer=0;
        boolean bool=true;
        while(bool){
            try{
                answer = input.nextInt();
                bool=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID INPUT!! PLEASE ENTER AN INTEGER!");
                input.nextLine();
            }

        }
        switch (answer) {
            case 1:
                System.out.println("=======================================================");
                System.out.println("                   ADD Employee Record   ");
                System.out.println("=======================================================");
                System.out.println("\nEnter the following details to ADD list: ");

                Add_Employee(IDList, NameList, DOB, Gender, Email, Occupation, Contact, Address);
                System.out.println();
                System.out.println("Enter your choice again: ");
                SelectOption();
            case 2:
                System.out.println("=======================================================");
                System.out.println("                   SEARCH Employee Record");
                System.out.println("=======================================================");
                System.out.println("\nEnter the Name of Employee for Search : ");
                Search_Employee(IDList, NameList, DOB, Gender, Email, Occupation, Contact, Address);
                System.out.println();
                System.out.println("Enter your choice again: ");
                SelectOption();
            case 3:
                System.out.println(" =======================================================  ");
                System.out.println("                   VIEW Employee Record          ");
                System.out.println(" =======================================================  ");
                View_Employee(IDList, NameList, DOB, Gender, Email, Occupation, Contact, Address);
                System.out.println();
                System.out.println("Enter your choice again: ");
                SelectOption();
            case 4:
                System.out.println("=======================================================");
                System.out.println("                   DELETE Employee Record");
                System.out.println("=======================================================");
                System.out.println("\nEnter the Name of Employee to delete : ");
                Delete_Employee(IDList, NameList, DOB, Gender, Email, Occupation, Contact, Address);
                System.out.println();
                System.out.print("Enter your choice again: ");
                SelectOption();
            case 5:
                System.out.println("=======================================================");
                System.out.println("                   UPDATE Employee Record");
                System.out.println("=======================================================");
                Update_Employee(IDList, NameList, DOB, Gender, Email, Occupation, Contact, Address);
                System.out.println();
                System.out.print("Enter your choice again: ");
                SelectOption();

            case 6:
                System.out.println("Exit");
                System.out.println();
                Choices();
                break;
        }
    }


    //METHOD FOR ADDING THE EMPLOYEE
    public static void Add_Employee(int[] IDList, String[] NameList, String[] DOB, String[] Gender, String[] Email, String[] Occupation, String[] Contact, String[] Address) throws FileNotFoundException {


        for(int i=0;i<IDList.length;i++){
            if(IDList[i]==0){

                Scanner input = new Scanner(System.in);
                boolean bool= true;
                while (bool){
                    try {
                        System.out.print("Enter ID :");
                        IDList[i] = input.nextInt();
                        bool=false;
                    }catch (InputMismatchException ex){
                        System.out.println("INVALID INPUT!! PLEASE ENTER AN INTEGER.");
                        input.nextLine();
                    }
                }

                System.out.print("Enter Name :");
                NameList[i] = input.next();

                System.out.print("Enter Gender :");
                Gender[i] = input.next();

                System.out.print("Enter date of birth :");
                DOB[i] = input.next();

                System.out.print("Enter Email :");
                Email[i] = input.next();

                System.out.print("Enter Occupation (e.g: salesman):");
                Occupation[i] = input.next();

                System.out.print("Enter Contact :");
                Contact[i] = input.next();

                System.out.print("Enter Address :");
                Address[i] = input.next();

                System.out.println("Record enter successfully. :");
                System.out.println();
                System.out.print("1= ADD EMPLOYEE DETAILS\n" +
                        "2= SEARCH EMPLOYEE DETAILS \n" +
                        "3= VIEW EMPLOYEE DETAILS\n" +
                        "4= DELETE EMPLOYEE DETAILS\n" +
                        "5= UPDATE EMPLOYEE DETAILS \n" +
                        "6= EXIT\n");
                System.out.println("Enter your choice again: ");
                SelectOption();

            }
        }

    }

    //METHOD FOR SEARCHING THE EMPLOYEE
    public static String Search_Employee(int[] IDList, String[] NameList, String[] DOB, String[] Gender, String[] Email, String[] Occupation, String[] Contact, String[] Address) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        String name = input.next();
        int i = 0;

        while (i < NameList.length) {
            if (name.equals(NameList[i])) {

                System.out.println("ID =" + IDList[i] );
                System.out.println("Name =  " + NameList[i] );
                System.out.println("Date of birth = " + DOB[i] );
                System.out.println("Gender = " + Gender[i] );
                System.out.println("Email =  " + Email[i]  );
                System.out.println("Occupation = " + Occupation[i] );
                System.out.println("Address = " + Address[i] );
                System.out.println("Contact = " + Contact[i] );
                System.out.println();


            }
            i++;
        }


        System.out.println();
        System.out.print("1= ADD EMPLOYEE DETAILS\n" +
                "2= SEARCH EMPLOYEE DETAILS \n" +
                "3= VIEW EMPLOYEE DETAILS\n" +
                "4= DELETE EMPLOYEE DETAILS\n" +
                "5= UPDATE EMPLOYEE DETAILS \n" +
                "6= EXIT\n");
        System.out.println("Enter your choice again: ");
        SelectOption();
        return Search_Employee(IDList, NameList, DOB, Gender, Email, Occupation, Contact, Address);
    }


    //METHOD FOR VIEWING THE EMPLOYEE DETAILS
    public static void View_Employee(int[] IDList, String[] NameList, String[] DOB, String[] Gender, String[] Email, String[] Occupation, String[] Contact, String[] Address) throws FileNotFoundException {

        File myfile=new File("EmployeeRecord.txt");
        PrintWriter out=new PrintWriter(myfile);

        System.out.println("");
        System.out.println("============================================================================================================================");
        System.out.println("ID     NAME      DOB        Gender        Email           OCCUPATION      CONTACT         ADDRESS");
        System.out.println("============================================================================================================================");

        out.println("");
        out.println("================================================================================================================");
        out.println("ID     NAME      DOB             Gender        Email                OCCUPATION        CONTACT         ADDRESS");
        out.println("================================================================================================================");

        for (int i = 0; i < IDList.length; i++) {
            if (IDList[i] == 0 || NameList[i].equals("0") || DOB[i].equals("0") || Gender[i].equals("0") || Email[i].equals("0") || Occupation[i].equals("0") ||
                    Contact[i].equals("0") || Address[i].equals("0")) {
                continue;
            }

            System.out.println(IDList[i] + "\t" + NameList[i] + "\t" + DOB[i] + "\t" + Gender[i] + "\t" + Email[i] + "\t" + Occupation[i] + "\t" + Contact[i] + "\t" + Address[i] + "\n");

        }

        for (int i = 0; i < IDList.length; i++) {
            if (IDList[i] == 0 || NameList[i].equals("0") || DOB[i].equals("0") || Gender[i].equals("0") || Email[i].equals("0") || Occupation[i].equals("0") ||
                    Contact[i].equals("0") || Address[i].equals("0")) {
                continue;
            }

            out.println(IDList[i] + "\t" + NameList[i] + "\t" + DOB[i] + "\t" + Gender[i] + "\t" + Email[i] + "\t\t" + Occupation[i] + "\t" + Contact[i] + "\t" + Address[i] + "\n");

        }
        out.close();


        System.out.println();
        System.out.print("1= ADD EMPLOYEE DETAILS\n" +
                "2= SEARCH EMPLOYEE DETAILS \n" +
                "3= VIEW EMPLOYEE DETAILS\n" +
                "4= DELETE EMPLOYEE DETAILS\n" +
                "5= UPDATE EMPLOYEE DETAILS \n" +
                "6= EXIT\n");
        System.out.println("Enter your choice again: ");
        SelectOption();
    }


    //METHOD FOR DELETING THE EMPLOYEE/EMPLOYEES
    public static void Delete_Employee(int[] IDList, String[] NameList, String[] DOB, String[] Gender, String[] Email, String[] Occupation, String[] Contact, String[] Address) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        String name = input.next();

        int k = 0;

        while (k < NameList.length) {

            if (name.equals(NameList[k])) {
                System.out.println("Delete Employee Successfully");

                IDList[k] = 0;
                NameList[k] = "0";
                DOB[k] = "0";
                Gender[k] = "0";
                Email[k] = "0";
                Occupation[k] = "0";
                Contact[k] = "0";
                Address[k] = "0";
                System.out.println();
            }
            k++;
        }

        System.out.println();
        System.out.print("1= ADD EMPLOYEE DETAILS\n" +
                "2= SEARCH EMPLOYEE DETAILS \n" +
                "3= VIEW EMPLOYEE DETAILS\n" +
                "4= DELETE EMPLOYEE DETAILS\n" +
                "5= UPDATE EMPLOYEE DETAILS \n" +
                "6= EXIT\n");
        System.out.println("Enter your choice again: ");
        SelectOption();

    }


    //METHOD FOR UPDATING THE EMPLOYEE/EMPLOYEES
    public static void Update_Employee(int[] IDList, String[] NameList, String[] DOB, String[] Gender, String[] Email, String[] Occupation, String[] Contact, String[] Address) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = input.next();
        int i = 0;

        while (i < NameList.length) {
            if (name.equals(NameList[i])) {
                System.out.print("Enter ID :");
                IDList[i] = input.nextInt();
                System.out.print("Enter Name :");
                NameList[i] = input.next();
                System.out.print("Enter gender :");
                Gender[i] = input.next();
                System.out.print("Enter date of birth (format DD/MM/YYYY) :");
                DOB[i] = input.next();
                System.out.print("Enter Email :");
                Email[i] = input.next();
                System.out.print("Enter Occupation :");
                Occupation[i] = input.next();
                System.out.print("Enter Contact :");
                Contact[i] = input.next();
                System.out.print("Enter Address :");
                Address[i] = input.next();
                System.out.println("Record Updated successfully. :");
                System.out.println();

            }
            i++;
        }

        System.out.println();
        System.out.print("1= ADD EMPLOYEE DETAILS\n" +
                "2= SEARCH EMPLOYEE DETAILS \n" +
                "3= VIEW EMPLOYEE DETAILS\n" +
                "4= DELETE EMPLOYEE DETAILS\n" +
                "5= UPDATE EMPLOYEE DETAILS \n" +
                "6= EXIT\n");
        System.out.println("Enter your choice again: ");
        SelectOption();
    }


    //WELCOME TO THE ORDER BLOCK
    public static void Customer_Block() throws FileNotFoundException {
        System.out.println("                         ==========================================================         ");
        System.out.println("                                           O R D E R   B L O C K");
        System.out.println("                         ==========================================================         ");
        System.out.println();

        System.out.println("1 = ADD ORDER");
        System.out.println("2 = EXIT");
        //A BAKERY REPRESENTATIVE WILL TAKE THE ORDER OF THE CUSTOMER.
        // HE WILL FIRST ASK THE CUSTOMER ABOUT HIS PERSONAL INFORMATION AND THEN HIS ORDER DETAILS
        System.out.println();

        Option();
    }
    static int[] IDlist = new int[]{1000,1001,1002,1003,1004,1005,1006,1007,1008,1009,0,0,0,0,0,0,0,0,0,0};
    static String[] Namelist = new String[]{"Abid", "Usman", "Eman", "Sara", "Aliza","Khalid", "Hamza", "Ayesha", "Ifra", "Akram","0","0","0","0","0","0","0","0","0","0"};
    static String[] gender = new String[]{"male", "male", "female", "female", "female","male", "male", "female", "female", "male", "0","0","0","0","0","0","0","0","0","0"};
    static String[] OrderTime = new String[]{"11:03 0'clock", "11:10 0'clock", "12:00 0'clock", "12:19 0'clock", "1:03 0'clock","1:15 0'clock", "1:20 0'clock", "1:19 0'clock", "1:45 0'clock", "2:09 0'clock", "0","0","0","0","0","0","0","0","0","0"};
    static String[] DeliverdTime= new String[]{"11:07 0'clock", "11:15 0'clock", "12:09 0'clock", "12:30 0'clock", "1:10 0'clock","1:35 0'clock", "1:30 0'clock", "1:30 0'clock", "1:57 0'clock", "2:18 0'clock", "0","0","0","0","0","0","0","0","0","0"};
    static String[] contact = new String[]{"0334533310", "0335678392", "0300546738", "0312100929", "03349873621","03345364321", "03212367840", "03007832102", "03145678941", "03344321335", "0","0","0","0","0","0","0","0","0","0"};
    static String[] address = new String[]{"Bahria,Islamabad", "I-10/1,Islamabad", "Askari14,Islamabad", "Chaklala,Rawalpindi", "Faisal_town,Rawalpindi","G-9,Islamabad", "I-4/1,Islamabad", "Askari7,Islamabad", "FortRoad,Rawalpindi", "Saddar,Rawalpindi", "0","0","0","0","0","0","0","0","0","0"};
    static String[] ProductName = new String[]{"Pizza\t", "Pasta\t", "Lasagne\t","Milk\t", "Eggs\t", "Chocolates", "Pastries", "Cupcakes", "Biscuits", "0","0","0","0","0","0","0","0","0","0"};
    static String[] ProductCategory = new String[]{"Bakery","Bakery","Bakery","Dairy","Dairy", "Bakery", "Bakery", "Bakery", "Bakery", "0","0","0","0","0","0","0","0","0","0"};
    static String[] ProductQuantity = new String[]{"10 slices", "5 plates", "5 dishes", "10 litres", "4 dozens", "50 packs", "10 slices","10 packs", "20 packs", "0","0","0","0","0","0","0","0","0","0"};
    static int[] ProductPrice = new int[]{1000, 800, 900, 500, 300, 2000, 350, 750, 600, 0,0,0,0,0,0,0,0,0,0};
    //METHOD FOR CHOOSING THE OPTION
    public static void Option() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        int choice = 0;
        boolean bool = true;

        while (bool) {
            try {
                System.out.println("Enter your choice : ");
                choice = input.nextInt();
                bool = false;
            } catch (InputMismatchException ex) {
                System.out.println("INVALID INPUT! PLEASE ENTER AN INTEGER!");
                input.nextLine();
            }
            if (choice == 1) {
                System.out.println(" ======================================================= ");
                System.out.println("                   ADD Order          ");
                System.out.println(" ======================================================= ");
                System.out.println();
                System.out.println("The order will be added by a bakery representative on behalf of the Customer!!");
                Customer_Editable_Record();
                break;
            } else if (choice == 2) {
                System.out.println("Thank you and GOOD BYE!!!");
                Choices();
            }else{
                Option();
            }

        }
    }


    public static void Customer_Editable_Record() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice != 10) {
            //THESE ARE THE ATTRIBUTES OF THE ORDER BLOCK
            System.out.println();
            System.out.println("1 = VIEW CUSTOMER RECORD");
            System.out.println("2 = ADD CUSTOMER RECORD");
            System.out.println("3 = DELETE CUSTOMER RECORD");
            System.out.println("4 = UPDATE CUSTOMER RECORD");
            System.out.println("5 = SEARCH CUSTOMER RECORD");
            System.out.println("6 = VIEW ORDER DETAILS");
            System.out.println("7 = ADD ORDER");
            System.out.println("8 = DELETE ORDER");
            System.out.println("9 = EXIT");
            System.out.println();
            System.out.print("ENTER YOUR OPTION:");
            Options();
        }
    }

    public static void Options() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int answer = 0;
        boolean bool = true;
        while (bool) {
            try {
                answer = input.nextInt();
                bool = false;
            } catch (InputMismatchException ex) {
                System.out.println("INVALID INPUT! PLEASE ENTER AN INTEGER");
                input.nextLine();
            }
        }

        switch (answer) {
            case 1:
                System.out.println("=======================================================");
                System.out.println("                   VIEW Customer Record          ");
                System.out.println("======================================================= ");
                View_Record(IDlist, Namelist, gender, OrderTime, DeliverdTime, contact, address);
                break;
            case 2:
                Add_Customer(IDlist, Namelist, gender, OrderTime, DeliverdTime, contact, address);
                System.out.println("Enter your choice again: ");
                Options();
            case 3:
                Delete_Customer(IDlist, Namelist, gender, OrderTime, DeliverdTime, contact, address);
                System.out.println("Enter your choice again: ");
                Options();
            case 4:
                Update_Customer(IDlist, Namelist, gender, OrderTime, DeliverdTime, contact, address);
                System.out.println("Enter your choice again: ");
                Options();
            case 5:
                Search_Customer(IDlist, Namelist, gender, OrderTime, DeliverdTime, contact, address);
                System.out.println("Enter your choice again: ");
                Options();
            case 6:
                for (int i = 0; i <= 40; i++) {
                    System.out.print("=" + " ");
                }
                System.out.println();
                System.out.println("                     V I E W    O R D E R  D E T A I L S                           ");

                for (int i = 0; i <= 40; i++) {
                    System.out.print("=" + " ");
                }
                ViewOrderDetails(ProductName, ProductCategory, ProductQuantity, ProductPrice);
                System.out.println();

                System.out.println("Enter any option again: ");
                Options();
                break;

            case 7:
                for (int i = 0; i <= 40; i++) {
                    System.out.print("=" + " ");
                }
                System.out.println();
                System.out.println("                              A D D  O R D E R                         ");

                for (int i = 0; i <= 40; i++) {
                    System.out.print("=" + " ");
                }
                System.out.println();
                System.out.println("Enter the questions to add your order: ");

                AddOrder(ProductName, ProductCategory, ProductQuantity, ProductPrice);
                System.out.println();
                System.out.println("Enter your choice again: ");
                Options();
                break;
            case 8:
                for (int i = 0; i <= 40; i++) {
                    System.out.print("=" + " ");
                }
                System.out.println();
                System.out.println("                            D E L E T E  O R D E R                         ");

                for (int i = 0; i <= 40; i++) {
                    System.out.print("=" + " ");
                }
                System.out.println();
                DeleteOrder(ProductName, ProductCategory, ProductQuantity, ProductPrice);
                System.out.println();
                System.out.print("Enter your choice again: ");
                Options();
                break;

            case 9:
                Customer_Block();
                break;

        }
    }

    //METHOD FOR VIEWING THE CUSTOMER RECORD
    public static void View_Record(int[] IDlist, String[] Namelist,  String[] gender,String[] OrderTime, String[] DeliveryTime,String[] contact, String[] address) throws FileNotFoundException {
        File file2 = new File("CustomerRecord.txt");
        PrintWriter out=new PrintWriter(file2);

        System.out.println("");
        System.out.println("========================================================================================================================================================================");
        System.out.println("ID      NAME             Gender            OrderTime               DeliveryTime               CONTACT                   ADDRESS");
        System.out.println("========================================================================================================================================================================");

        out.println("");
        out.println("========================================================================================================================================================================");
        out.println("ID      NAME             Gender            OrderTime               DeliveryTime               CONTACT                   ADDRESS");
        out.println("========================================================================================================================================================================");

        for (int i = 0; i < IDlist.length; i++) {
            if (IDlist[i] == 0 || Namelist[i].equals("0") ||  gender[i].equals("0")  || OrderTime[i].equals("0")|| DeliveryTime[i].equals("0")||
                    contact[i].equals("0") || address[i].equals("0")) {
                continue;
            }

            System.out.println(IDlist[i] + "\t" + Namelist[i] + "\t\t" + gender[i] + "\t\t" + OrderTime[i]+ "\t\t"+DeliveryTime[i]+ "\t\t"+ contact[i] + "\t\t" + address[i] + "\n");
        }

        for (int i = 0; i < IDlist.length; i++) {
            if (IDlist[i] == 0 || Namelist[i].equals("0") ||  gender[i].equals("0")  || OrderTime[i].equals("0")|| DeliveryTime[i].equals("0")||
                    contact[i].equals("0") || address[i].equals("0")) {
                continue;
            }

            out.println(IDlist[i] + "\t" + Namelist[i] + "\t\t" + gender[i] + "\t\t" + OrderTime[i]+ "\t\t"+DeliveryTime[i]+ "\t\t"+ contact[i] + "\t\t" + address[i] + "\n");
        }
        out.close();
        System.out.println();
        System.out.println("1 = VIEW CUSTOMER RECORD");
        System.out.println("2 = ADD CUSTOMER RECORD");
        System.out.println("3 = DELETE CUSTOMER RECORD");
        System.out.println("4 = UPDATE CUSTOMER RECORD");
        System.out.println("5 = SEARCH CUSTOMER RECORD");
        System.out.println("6 = VIEW ORDER DETAILS");
        System.out.println("7 = ADD ORDER");
        System.out.println("8 = DELETE ORDER");
        System.out.println("9 = EXIT");
        System.out.println();
        System.out.println("Enter your choice again: ");
        Options();
    }

    //METHOD FOR ADDING THE CUSTOMER RECORD
    public static void Add_Customer(int[] IDlist, String[] Namelist,  String[] gender, String[] OrderTime,String[] DeliveryTime,String[] contact, String[] address) throws FileNotFoundException {
        System.out.println("=======================================================");
        System.out.println("                 ADD Customer Record   ");
        System.out.println("=======================================================");

        boolean bool=true;
        Scanner input = new Scanner(System.in);
        for (int i =0; i<IDlist.length; i++) {
            if (IDlist[i] == 0) {
                while(bool){
                    try{
                        System.out.print("Enter ID :");
                        IDlist[i] = input.nextInt();
                        bool=false;
                    }catch (InputMismatchException ex){
                        System.out.println("INVALID INPUT! PLEASE ENTER AN INTEGER");
                        input.nextLine();
                    }
                }

                System.out.print("Enter Name :");
                Namelist[i] = input.next();

                System.out.print("Enter gender :");
                gender[i] = input.next();

                System.out.print("Enter OrderTime (e.g 2:00 o'clock):");
                OrderTime[i] = input.next();

                System.out.print("Enter DeliveryTime (e.g 2:05 o'clock :");
                DeliveryTime[i] = input.next();

                System.out.print("Enter Contact :");
                contact[i] = input.next();

                System.out.print("Enter Address :");
                address[i] = input.next();

                System.out.println("Record enter successfully. :");
                System.out.println();
                System.out.println("1 = VIEW CUSTOMER RECORD");
                System.out.println("2 = ADD CUSTOMER RECORD");
                System.out.println("3 = DELETE CUSTOMER RECORD");
                System.out.println("4 = UPDATE CUSTOMER RECORD");
                System.out.println("5 = SEARCH CUSTOMER RECORD");
                System.out.println("6 = VIEW ORDER DETAILS");
                System.out.println("7 = ADD ORDER");
                System.out.println("8 = DELETE ORDER");
                System.out.println("9 = EXIT");
                System.out.println();
                System.out.println("Enter your choice again: ");
                Options();
            }
        }

    }

    //METHOD FOR DELETING THE CUSTOMER RECORD
    public static void Delete_Customer(int[] IDlist, String[] Namelist,  String[] gender, String[] OrderTime,String[] DeliveryTime,String[] contact, String[] address) throws FileNotFoundException {

        System.out.println("=======================================================");
        System.out.println("                DELETE customer Record");
        System.out.println("=======================================================");
        System.out.print("Enter the Name of Customer to delete : ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        int k = 0;

        while (k < Namelist.length) {

            if (name.equals(Namelist[k])) {
                System.out.println("Delete Customer Successfully");
                IDlist[k] = 0;
                Namelist[k] = "0";
                gender[k] = "0";
                OrderTime[k]="0";
                DeliveryTime[k]="0";
                contact[k] = "0";
                address[k] = "0";


            }
            k++;
        }
        System.out.println();
        System.out.println("1 = VIEW CUSTOMER RECORD");
        System.out.println("2 = ADD CUSTOMER RECORD");
        System.out.println("3 = DELETE CUSTOMER RECORD");
        System.out.println("4 = UPDATE CUSTOMER RECORD");
        System.out.println("5 = SEARCH CUSTOMER RECORD");
        System.out.println("6 = VIEW ORDER DETAILS");
        System.out.println("7 = ADD ORDER");
        System.out.println("8 = DELETE ORDER");
        System.out.println("9 = EXIT");
        System.out.println();
        System.out.println("Enter your choice again: ");
        Options();


    }

    //METHOD FOR UPDATING THE CUSTOMER RECORD
    public static void Update_Customer(int[] IDlist, String[] Namelist,  String[] gender, String[] OrderTime,String[] DeliveryTime,String[] contact, String[] address) throws FileNotFoundException {
        System.out.println("=======================================================");
        System.out.println("                UPDATE Customer Record");
        System.out.println("=======================================================");
        Scanner input = new Scanner(System.in);
        boolean bool = true;
        System.out.print("Enter Customer Name: ");

        String name = input.next();
        for (int i = 0; i < Namelist.length; i++) {
            if (Namelist[i].equals(name)) {
                while (bool) {
                    try {
                        System.out.print("Enter ID :");
                        IDlist[i] = input.nextInt();
                        bool = false;
                    } catch (InputMismatchException ex) {
                        System.out.println("INVALID INPUT! PLEASE ENTER AN INTEGER");
                        input.nextLine();
                    }
                }

                System.out.print("Enter gender :");
                gender[i] = input.next();

                System.out.print("Enter OrderTime :");
                OrderTime[i] = input.next();

                System.out.print("Enter DeliverdTime :");
                DeliveryTime[i] = input.next();

                System.out.print("Enter Contact :");
                contact[i] = input.next();

                System.out.print("Enter Address :");
                address[i] = input.next();
                System.out.println("Record Updated successfully!");

            }
            i++;

        }

        System.out.println();
        System.out.println("1 = VIEW CUSTOMER RECORD");
        System.out.println("2 = ADD CUSTOMER RECORD");
        System.out.println("3 = DELETE CUSTOMER RECORD");
        System.out.println("4 = UPDATE CUSTOMER RECORD");
        System.out.println("5 = SEARCH CUSTOMER RECORD");
        System.out.println("6 = VIEW ORDER DETAILS");
        System.out.println("7 = ADD ORDER");
        System.out.println("8 = DELETE ORDER");
        System.out.println("9 = EXIT");
        System.out.println();
        System.out.println("Enter your choice again: ");
        Options();
    }

    //METHOD FOR SEARCHING THE RECORD OF THE CUSTOMER
    public static Void Search_Customer(int[] IDlist, String[] Namelist,  String[] gender, String[] OrderTime,String[] DeliveryTime,String[] contact, String[] address) throws FileNotFoundException {

        System.out.println("=======================================================");
        System.out.println("                SEARCH Customer Record");
        System.out.println("=======================================================");
        System.out.println("Enter the Name of Customer for Search : ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        int i = 0;

        while (i < 11) {
            if (name.equals(Namelist[i])) {

                System.out.println("ID =" + IDlist[i]);
                System.out.println("Name =" + Namelist[i]);
                System.out.println("Gender =" + gender[i]);
                System.out.println("OrderTime =" + OrderTime[i]);
                System.out.println("DeliverYTime =" + DeliveryTime[i]);
                System.out.println("Contact =" + contact[i]);
                System.out.println("Address =" + address[i]);

            }
            i++;
        }
        System.out.println();
        System.out.println("1 = VIEW CUSTOMER RECORD");
        System.out.println("2 = ADD CUSTOMER RECORD");
        System.out.println("3 = DELETE CUSTOMER RECORD");
        System.out.println("4 = UPDATE CUSTOMER RECORD");
        System.out.println("5 = SEARCH CUSTOMER RECORD");
        System.out.println("6 = VIEW ORDER DETAILS");
        System.out.println("7 = ADD ORDER");
        System.out.println("8 = DELETE ORDER");
        System.out.println("9 = EXIT");
        System.out.println("Enter your choice again: ");
        Options();
        return Search_Customer(IDlist, Namelist, gender, OrderTime, DeliveryTime, contact, address);
    }


    //METHOD FOR VIEWING THE ORDER DETALS
    public static void ViewOrderDetails(String[] ProductName, String[] ProductCategory, String[] ProductQuantity, int[] ProductPrice) throws FileNotFoundException {
        File file3=new File("OrderDetails.txt");
        PrintWriter out=new PrintWriter(file3);

        System.out.println();
        System.out.println("");
        System.out.println("==================================================================================");
        System.out.println("Name             Category          Quantity            Price (Rs/-)       ");
        System.out.println("==================================================================================");

        out.println();
        out.println("");
        out.println("==================================================================================");
        out.println("Name             Category          Quantity            Price (Rs/-)       ");
        out.println("==================================================================================");


        for (int i = 0; i < ProductName.length; i++) {
            if (ProductName[i].equals("0") || ProductCategory[i].equals("0") || ProductQuantity[i].equals("0") || ProductPrice[i] == 0) {
                continue;
            }
            System.out.println();
            System.out.println(ProductName[i]+ "\t\t" + ProductCategory[i]+ "\t\t" + ProductQuantity[i]+ "\t\t" + ProductPrice[i]+ "\n");
        }

        for (int i = 0; i < ProductName.length; i++) {
            if (ProductName[i].equals("0") || ProductCategory[i].equals("0") || ProductQuantity[i].equals("0") || ProductPrice[i] == 0) {
                continue;
            }
            out.println();
            out.println(ProductName[i]+ "\t\t" + ProductCategory[i]+ "\t\t" + ProductQuantity[i]+ "\t\t" + ProductPrice[i]+ "\n");

        }
        out.close();

        System.out.println();
        System.out.println("1 = VIEW CUSTOMER RECORD");
        System.out.println("2 = ADD CUSTOMER RECORD");
        System.out.println("3 = DELETE CUSTOMER RECORD");
        System.out.println("4 = UPDATE CUSTOMER RECORD");
        System.out.println("5 = SEARCH CUSTOMER RECORD");
        System.out.println("6 = VIEW ORDER DETAILS");
        System.out.println("7 = ADD ORDER");
        System.out.println("8 = DELETE ORDER");
        System.out.println("9 = EXIT");
        System.out.println();
        System.out.print("Enter any option again: ");
        Options();

    }


    //METHOD FOR ADDING THE ORDER OF THE CUSTOMER
    public static void AddOrder(String[] ProductName, String[] ProductCategory, String[] ProductQuantity, int [] ProductPrice) throws FileNotFoundException {
        boolean bool=true;

        for(int i=0;i<ProductPrice.length;i++){
            if(ProductPrice[i]==0){
                Scanner input = new Scanner(System.in);

                System.out.print("Enter the product that you want: ");
                ProductName[i] = input.next();
                System.out.println();

                System.out.print("Enter the category of the product that you want:");
                ProductCategory[i] = input.next();
                System.out.println();

                System.out.print("Enter the quantity you want: ");
                ProductQuantity[i] = input.next();
                System.out.println();

                while (bool){
                    try{
                        System.out.print("Enter the price: ");
                        ProductPrice[i] = input.nextInt();
                        bool=false;

                    }catch (InputMismatchException ex){
                        System.out.println("INVALID INPUT! PLEASE ENTER AN INTEGER");
                        input.nextLine();
                    }
                }
                System.out.println("Congratulations! Your order has been placed successfully!!!");
                System.out.println();
                System.out.println("1 = VIEW CUSTOMER RECORD");
                System.out.println("2 = ADD CUSTOMER RECORD");
                System.out.println("3 = DELETE CUSTOMER RECORD");
                System.out.println("4 = UPDATE CUSTOMER RECORD");
                System.out.println("5 = SEARCH CUSTOMER RECORD");
                System.out.println("6 = VIEW ORDER DETAILS");
                System.out.println("7 = ADD ORDER");
                System.out.println("8 = DELETE ORDER");
                System.out.println("9 = EXIT");
                System.out.println();
                System.out.println("Enter your choice again: ");
                Options();

            }
        }

    }

    //METHOD FOR DELETING THE ORDER OF THE CUSTOMER
    public static void DeleteOrder(String[] ProductName, String[] ProductCategory, String[] ProductQuantity, int[] ProductPrice) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        System.out.print("To delete the ORDER, Enter the Product name: ");
        String NameOfProduct = input.nextLine();
        int index = 0;
        while (index < ProductName.length) {
            if (NameOfProduct.equals(ProductName[index])) {
                System.out.println("Record deleted successfully. :");
                ProductName[index] = "0";
                ProductCategory[index] = "0";
                ProductQuantity[index] = "0";
                ProductPrice[index] = 0;
            }
            index++;
        }

        System.out.println();
        System.out.println("1 = VIEW CUSTOMER RECORD");
        System.out.println("2 = ADD CUSTOMER RECORD");
        System.out.println("3 = DELETE CUSTOMER RECORD");
        System.out.println("4 = UPDATE CUSTOMER RECORD");
        System.out.println("5 = SEARCH CUSTOMER RECORD");
        System.out.println("6 = VIEW ORDER DETAILS");
        System.out.println("7 = ADD ORDER");
        System.out.println("8 = DELETE ORDER");
        System.out.println("9 = EXIT");
        System.out.println();
        System.out.println("Enter your choice again: ");
        Options();

    }



    //WELCOME TO THE BAKERY STOCK BLOCK
    public static void Bakery_Stock__block() throws FileNotFoundException {
        System.out.println("=====================================================================================================");
        System.out.println("                            B A K E R Y   S T O C K     B L O C K !!");
        System.out.println("=====================================================================================================");
        System.out.println();
        //THESE ARE THE ATTRIBUTES OF THE BAKERY STOCK BLOCK
        System.out.print("1= ADD PRODUCT \n" +
                "2= SEARCH PRODUCT\n" +
                "3= VIEW PRODUCT DETAILS\n" +
                "4= UPDATE PRODUCT \n" +
                "5= EXIT\n");
        System.out.println();
        System.out.print("Enter your choice : ");
        selectOption();
    }

    static int[] ID_List = new int[]{1000, 1001, 1002, 1003, 1004, 1005, 1006, 1007,1008,1009,1010,1011,0,0,0,0,0,0,0,0,0,0};
    static String[] Name_List = new String[]{"Cake", "Brownie", "Cupcake", "Lasagne", "Patty", "juice","Milk","Oil","Flour", "Sugar", "Soda", "Cheese","0","0","0","0","0","0","0","0","0","0"};
    static String[] CategoryList = new String[]{"Bakery","Bakery","Bakery","Bakery","Bakery","Bakery","Kitchen","Kitchen","Kitchen","Kitchen","Kitchen","Kitchen","0","0","0","0","0","0","0","0","0","0"};
    static String[] QuantityList = new String[]{"150 boxes","250 packets", "200packets", "25 Dishes","150 pieces","100 pieces", "7oo Liters", "800 Liters","80 kilogram", "50 kilogram", "20 packets","25 kilogram","0","0","0","0","0","0","0","0","0","0"};
    static int[] PriceList = new int[]{ 1200, 200, 35, 350, 140, 75, 320, 450, 75, 320, 450,800, 0,0,0,0,0,0,0,0,0,0};

    //METHOD FOR CHOOSING THE OPTIONS
    public static void selectOption() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        int answer=0;
        boolean bool=true;
        while(bool){
            try{
                answer = input.nextInt();
                bool=false;
            }catch (InputMismatchException ex){
                System.out.println("INVALID INPUT, PLEASE ENTER AN INTEGER");
                input.nextLine();
            }
        }

        switch (answer) {
            case 1:
                System.out.println("=======================================================");
                System.out.println("                  ADD Product Record   ");
                System.out.println("=======================================================");
                System.out.println("\nEnter the following details to ADD list: ");

                AddProduct(ID_List, Name_List,CategoryList, QuantityList, PriceList);
                System.out.println("Enter your choice again: ");
                selectOption();
            case 2:
                System.out.println("=======================================================");
                System.out.println("                 SEARCH Product Record");
                System.out.println("=======================================================");
                System.out.println("\nEnter the Name of Product for Search : ");
                SearchProduct(ID_List, Name_List,CategoryList, QuantityList, PriceList );
                System.out.println("Enter your choice again: ");
                selectOption();
            case 3:
                System.out.println("=======================================================  ");
                System.out.println("                 VIEW Product Record          ");
                System.out.println(" =======================================================  ");
                ViewProduct(ID_List, Name_List, CategoryList, QuantityList, PriceList);
                System.out.println("Enter your choice again: ");
                selectOption();
            case 4:
                System.out.println("=======================================================");
                System.out.println("                 UPDATE Product Record");
                System.out.println("=======================================================");
                UpdateProduct(ID_List, Name_List, CategoryList, QuantityList, PriceList);
                System.out.print("Enter your choice again: ");
                selectOption();

            case 5:
                System.out.println("Exit");
                System.out.println();
                Choices();
                break;
        }
    }


    //METHOD FOR ADDING THE PRODUCT IN THE STOCK
    public static void AddProduct(int[] ID_List, String[] Name_List, String[] CategoryList, String[] QuantityList, int[] PriceList) throws FileNotFoundException {

        boolean bool1=true;
        boolean bool2=true;
        for(int i=0;i<ID_List.length;i++){
            if(ID_List[i]==0){
                Scanner input = new Scanner(System.in);

                while (bool1){
                    try{
                        System.out.print("Enter ID :");
                        ID_List[i] = input.nextInt();
                        bool1=false;
                    }catch (InputMismatchException ex){
                        System.out.println("INVALID INPUT! PLEASE ENTER AN INTEGER");
                        input.nextLine();
                    }

                }

                System.out.print("Enter Name :");
                Name_List[i] = input.next();
                System.out.print("Enter Category :");
                CategoryList[i] = input.next();
                System.out.print("Enter Quantity :");
                QuantityList[i] = input.next();

                while (bool2){
                    try{
                        System.out.print("Enter Price(per product) :");
                        PriceList[i] = input.nextInt();
                        bool2=false;
                    }catch (InputMismatchException ex){
                        System.out.println("INVALID INPUT! PLEASE ENTER AN INTEGER");
                        input.nextLine();
                    }

                }

                System.out.println("Record entered successfully. :");
                System.out.println();
                System.out.print("1= ADD PRODUCT \n" +
                        "2= SEARCH PRODUCT\n" +
                        "3= VIEW PRODUCT DETAILS\n" +
                        "4= UPDATE PRODUCT \n" +
                        "5= EXIT\n");
                System.out.println();
                System.out.println("Enter your choice again: ");
                selectOption();
            }
        }

    }

    //METHOD FOR SEARCHING THE PRODUCT IN THE STOCK
    public static String SearchProduct(int[] ID_List, String[] Name_List, String[] CategoryList, String[] QuantityList, int[] PriceList) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        String name = input.next();
        int i = 0;

        while (i < 14) {
            if (name.equals(Name_List[i])) {

                System.out.println("ID =" + ID_List[i]);
                System.out.println("Name =" + Name_List[i]);
                System.out.println("Category =" + CategoryList[i]);
                System.out.println("Quantity =" + QuantityList[i]);
                System.out.println("Price =" + PriceList[i]);
                System.out.println();
                System.out.println("Enter your choice again: ");
                selectOption();
            }
            i++;
        }


        System.out.println();
        System.out.print("1= ADD PRODUCT \n" +
                "2= SEARCH PRODUCT\n" +
                "3= VIEW PRODUCT DETAILS\n" +
                "4= UPDATE PRODUCT \n" +
                "5= EXIT\n");
        System.out.println();
        System.out.println("Enter your choice again: ");
        selectOption();
        return SearchProduct(ID_List, Name_List, CategoryList, QuantityList, PriceList);
    }
    //METHOD FOR VIEWING THE PRODUCTS IN THE STOCK
    public static void ViewProduct(int[] ID_List, String[] Name_List, String[] CategoryList, String[] QuantityList, int[] PriceList) throws FileNotFoundException {

        File file=new File("BakeryStock.txt");
        PrintWriter out=new PrintWriter(file);

        System.out.println("");
        System.out.println("==============================================================================================");
        System.out.println("ID       Name             Category          Quantity            Price (Rs/-)       ");
        System.out.println("==============================================================================================");

        out.println("");
        out.println("==============================================================================================");
        out.println("ID       Name             Category          Quantity            Price (Rs/-)       ");
        out.println("==============================================================================================");

        for (int i = 0; i < ID_List.length; i++) {
            if (ID_List[i] == 0 || Name_List[i].equals("0") || CategoryList[i].equals("0") || QuantityList[i].equals("0") || PriceList[i] == 0)
            {
                continue;
            }

            System.out.println(ID_List[i] + "\t" + Name_List[i] + "\t\t" + CategoryList[i] + "\t\t" + QuantityList[i] + "\t\t" + PriceList[i] + "\n");

        }

        for (int i = 0; i < ID_List.length; i++) {
            if (ID_List[i] == 0 || Name_List[i].equals("0") || CategoryList[i].equals("0") || QuantityList[i].equals("0") || PriceList[i] == 0)
            {
                continue;
            }

            out.println(ID_List[i] + "\t" + Name_List[i] + "\t\t" + CategoryList[i] + "\t\t" + QuantityList[i] + "\t\t" + PriceList[i] + "\n");

        }
        out.close();


        System.out.println();
        System.out.print("1= ADD PRODUCT \n" +
                "2= SEARCH PRODUCT\n" +
                "3= VIEW PRODUCT DETAILS\n" +
                "4= UPDATE PRODUCT \n" +
                "5= EXIT\n");
        System.out.println();
        System.out.println("Enter your choice again: ");
        selectOption();
    }


    //METHOD FOR UPDATING THE PRODUCT/PRODUCTS IN THE STOCK
    public static void UpdateProduct(int[] ID_List, String[] Name_List,String[] CategoryList, String[] QuantityList, int[] PriceList) throws FileNotFoundException {
        boolean bool1=true;
        boolean bool2=true;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Product Name: ");
        String name = input.next();
        int i=0;

        while(i<Name_List.length){
            if (Name_List[i].equals(name)) {
                while (bool1){
                    try{
                        System.out.print("Enter ID :");
                        ID_List[i] = input.nextInt();
                        bool1=false;
                    }catch (InputMismatchException ex){
                        System.out.println("INVALID ENTRY!! PLEASE ENTER AN INTEGER");
                        input.nextLine();
                    }
                }

                System.out.print("Enter Name :");
                Name_List[i] = input.next();
                System.out.print("Enter Category (Bakery/Kitchen):");
                CategoryList[i] = input.next();
                System.out.print("Enter Quantity :");
                QuantityList[i] = input.next();
                while (bool2){
                    try{
                        System.out.print("Enter Price :");
                        PriceList[i] = input.nextInt();System.out.print("Enter Price :");
                        bool2=false;
                    }catch (InputMismatchException ex) {
                        System.out.println("INVALID ENTRY!! PLEASE ENTER AN INTEGER");
                        input.nextLine();
                    }
                }

                System.out.println("Product updated Successfully!!!");
            }
            i++;
        }


        System.out.println();
        System.out.print("1= ADD PRODUCT \n" +
                "2= SEARCH PRODUCT\n" +
                "3= VIEW PRODUCT DETAILS\n" +
                "4= UPDATE PRODUCT \n" +
                "5= EXIT\n");
        System.out.println();
        System.out.println("Enter your choice again: ");
        selectOption();
    }


    //WELCOME TO THE CUSTOMER FEEDBACK BLOCK
    public static void Customer_Feedback() throws FileNotFoundException {
        File file4=new File("CustomerFeedback.txt");
        PrintWriter out=new PrintWriter(file4);

        System.out.println("                           ============================================================");
        System.out.println("                                          C U S T O M E R    F E E D B A C K");
        System.out.println("                           ============================================================");
        System.out.println();
        System.out.println("                              *******************************************************");
        System.out.println("                                       R e v i e w s   a n d   R a t i n g!!");
        System.out.println("                              *******************************************************");
        System.out.println();
        System.out.println("By a show of 1 to 5 stars, please review the performance of our BAKERY: ");
        System.out.println("*where each star means: ");

        System.out.println (" *         --> disappointing");
        System.out.println (" * *       --> Unsatisfactory");
        System.out.println (" * * *     --> SomeWhat Satisfactory");
        System.out.println (" * * * *   --> Satisfactory");
        System.out.println (" * * * * * --> Excellent Job");
        System.out.println();
        System.out.println("Answer the following questions in yes or no: ");


        out.println("                           ============================================================");
        out.println("                                          C U S T O M E R    F E E D B A C K");
        out.println("                           ============================================================");

        //THE CUSTOMER WILL BE ASKED 5 QUETIONS IN TOTAL
        int total=0;
        Scanner input=new Scanner (System.in);
        System.out.print("Was the employee cooperative? ");
        String q1=input.nextLine();
        if (q1.equals("yes")){
            total+=1;
        }
        System.out.print("Was the product available? ");
        String q2=input.nextLine();
        if(q2.equals("yes")){
            total+=1;
        }
        System.out.print("Was the food delivery up to your standard? ");
        String q3=input.nextLine();
        if(q3.equals("yes")) {
            total += 1;
        }
        System.out.print("Are you satisfied with the overall performance? ");
        String q4=input.nextLine();
        if(q4.equals("yes")) {
            total += 1;
        }
        System.out.print("Do you plan to come again in this bakery? ");
        String q5=input.nextLine();
        if(q5.equals("yes")){
            total+=1;
        }
        String suggestion;
        System.out.println();
        switch (total) {
            case 5:
                System.out.println("Customer rating: * * * * * ");
                System.out.println(" ===EXCELLENT JOB=== ");
                out.println("CUSTOMER RATING:" + "* * * * * ");
                out.println("\t\t\t===EXCELLENT JOB=== ");
                out.close();
                break;

            case 4:
                System.out.println("Customer rating: * * * * ");
                System.out.println("===SATISFACTORY===");
                System.out.println("How can we make our experience better?");
                out.println("CUSTOMER RATING:" + "* * * *");
                out.println("CUSTOMER EXPERIENCE:" + "===SATISFACTORY===");
                suggestion=input.nextLine();
                out.println("SUGGESTION:        " +suggestion);
                out.close();
                break;

            case 3:
                System.out.println("Customer rating: * * * ");
                System.out.println (" ===SOMEWHAT SATISFACTORY=== ");
                System.out.println("How can we make our experience better?");
                out.println("CUSTOMER RATING:" + "* * *");
                out.println("CUSTOMER EXPERIENCE:" + " ===SOMEWHAT UNSATISFACTORY===");
                suggestion=input.nextLine();
                out.println("SUGGESTION:        " +suggestion);
                out.close();
                break;

            case 2:
                System.out.println("Customer rating: * * ");
                System.out.println (" ===UNSATISFACTORY===");
                System.out.println("How can we make our experience better?");
                out.println("CUSTOMER RATING:    " + "* *");
                out.println("CUSTOMER EXPERIENCE:" + " ===UNSATISFACTORY===");
                suggestion=input.nextLine();
                out.println("SUGGESTION:         " +suggestion);
                out.close();
                break;

            case 1:
                System.out.println("Customer rating: * ");
                System.out.println (" ===DISAPPOINTING=== ");
                System.out.println("Sorry for your experience");
                System.out.println("How can we make our experience better?");
                out.println("CUSTOMER RATING:    " + "*");
                out.println ("CUSTOMER EXPERIENCE:" + " ===DISAPPOINTING=== ");
                out.println("-Sorry for your experience-");
                suggestion=input.nextLine();
                out.println("SUGGESTION:          " +suggestion);
                out.close();
                break;

            default:
                System.out.println("Customer rating: WORST EXPERIENCE!!");
                System.out.println("-Sorry for your experience-");
                System.out.println("How can we make our experience better?");
                out.println("CUSTOMER RATING:   " + "WORST EXPERIENCE!!");
                out.println("-Sorry for your experience-");
                suggestion=input.nextLine();
                out.println("SUGGESTION:        " +suggestion);
                out.close();
                break;
        }
        System.out.println();
        System.out.println("I'm glad you visited our Bakery!");
        System.out.println();
        select_Option();
    }

}
// *********************************** THE END **********************************************







