public class Main {
    public static void main(String[] args) {
        
        Account ana = new Account(); //("1235", 1000, "Ana Pham", "ana@og.com", "1234234");
        ana.getBalance();
        ana.withdrawal(100.0);
        System.out.println(ana.getCustomerName());
    }
}