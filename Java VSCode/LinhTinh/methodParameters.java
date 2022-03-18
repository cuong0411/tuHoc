class Robot {
    public void speak(String text) {
        System.out.println(text);
    }
    public void jump(int height) {
        System.out.println("Jumping: " + height);
    }
    public void move(String direction, double distance) {
        System.out.println("Moving " + distance + " metres in direction "
            + direction);
    }
}

public class methodParameters {
    public static void main(String[] args) {
        Robot sam = new Robot();
        sam.speak("Helu, I'm sam");
        sam.jump(12);
        sam.move("West", 5);
    }
}
