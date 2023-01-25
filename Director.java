public class Director implements Interface {
    private final String name;

    public Director(String name) {
        this.name = name;
    }

    @Override
    public void print(String position) {
        System.out.println("Здрасте! Я " + name + ". И я тут директор. А на забугорном " + position + "!");;
    }
}
