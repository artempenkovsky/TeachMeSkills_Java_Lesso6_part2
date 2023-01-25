public class Worker implements Interface {

    private final String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void print(String position) {
        System.out.println("Здрасте! Я " + name + ". И я тут простой рабочий. А на забугорном " + position + "!");
    }
}