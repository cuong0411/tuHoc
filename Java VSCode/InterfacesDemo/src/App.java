public class App {
    public static void main(String[] args) {
        
        ITelephone timsPhone;
		timsPhone = new DeskPhone(123456);
		timsPhone.powerOn();
		timsPhone.callPhone(123456);
		timsPhone.answer();
		
		timsPhone = new MobilePhone(23465);
		timsPhone.powerOn();
		timsPhone.callPhone(23465);
		timsPhone.answer();
    }
}
