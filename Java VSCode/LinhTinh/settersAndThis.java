class Forg {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int newAge) {
        age = newAge;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setInfo(String name, int age) {
        setName(name);
        setAge(age);
    }
}

public class settersAndThis {
    public static void main(String[] args) {

        Forg forg1 = new Forg();

        //forg1.name = "ech";
        //forg1.age = 1;

        forg1.setName("ech2");
        forg1.setAge(1);

        System.out.println(forg1.getName());
        System.out.println(forg1.getAge());
    }
}
