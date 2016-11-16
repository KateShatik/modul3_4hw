/**
 * Created by Катя on 16.11.2016.
 */
public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private  String currency;

    public User(String name,int balance,int monthsOfEmployment,String companyName,int salary,String currency)
    {
        this.name=name;
        this.balance=balance;
        this.monthsOfEmployment=monthsOfEmployment;
        this.companyName=companyName;
        this.salary=salary;
        this.currency=currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public  void paySalary(){
        balance+=salary;
        System.out.println(balance);

    }
    public  void  withdraw(int summ){
        double withdrawal=0.0;
        if (summ < 1000) withdrawal=  0.05*summ;
        else withdrawal=  0.1*summ;
        System.out.println("Amount withdrawal= "+withdrawal);
    }

    public void companyNameLenght(){
        System.out.println(companyName.length());
    }

    public void monthIncreaser(int addMonth){

        System.out.println(monthsOfEmployment+addMonth);
    }

}

