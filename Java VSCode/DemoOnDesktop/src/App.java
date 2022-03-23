public class App {
    public static void main(String[] args) {
        
        Dog aDog = new Dog();
        Object o = aDog.getObject(aDog);
        if (o instanceof Dog) {
            Dog d = (Dog) o;
        }
    }
}
