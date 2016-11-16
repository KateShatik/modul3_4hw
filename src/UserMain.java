/**
 * Created by Катя on 16.11.2016.
 */
public class UserMain {
    public static void main(String[] args) {
        User user = new User("Kate",15000,5,"Apple",20000,"$");
        System.out.println("Name "+user.getName());
        System.out.println("Balance "+user.getBalance());
        System.out.println("MonthsOfEmployment "+user.getMonthsOfEmployment());
        System.out.println("Company "+user.getCompanyName());
        System.out.println("Salary "+user.getSalary());
        System.out.println("Currency " +user.getCurrency());
        System.out.println("1. Method paySalary: ");
        user.paySalary();
        int summ=100;
        System.out.println("2. Method withdraw (summ= "+summ +")  :");
        user.withdraw(summ);
        System.out.println("3. Method companyNameLenght: ");
        user.companyNameLenght();
        int addMonth= 9;
        System.out.println("4. Method monthIncreaser  (addMonth = " + addMonth+")  :");
        user.monthIncreaser(addMonth);

    }
}

