class Machine {

    private String name;
    private int code;

    public Machine() {
        this("Jerax", 0);
        System.out.println("Contructor running!");
        name = "autubot";
    }
    public Machine(String name) {
        this("Notail", 0);
        System.out.println("Second contructor running!");
        this.name = name;
    }
    public Machine(String name, int code) {
        System.out.println("Third contructor running!");
        this.name = name;
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public int getCode() {
        return this.code;
    }
}
public class contructors {
    public static void main(String[] args) {

        Machine machine1 = new Machine();
        System.out.println(machine1.getName());

        //new Machine();

        //Machine machine2 = new Machine("RTZ");
        //Machine machine3 = new Machine("Ana God", 3);
    }
}
