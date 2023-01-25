public class Accountant implements Interface {
    private final String name;

    public Accountant(String name) {
        this.name = name;
    }

    @Override
    public void print(String position) {
        System.out.println("Здрасте! Я " + name + ". И я тут бухгалтер. А на забугорном " + position + "!");
    }
}
