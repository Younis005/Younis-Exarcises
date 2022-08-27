public class Exarise4 {
    public static void main(String[] args) {
        int balance = 1000;
        int interest=5;
        int year = 1;
        int newBalance=0;

        while (year<=3)
        {
            newBalance=balance+(balance*interest/100);
            System.out.println("Year"+year+":"+newBalance);
            balance=newBalance;
            year++;
        }
    }
}
