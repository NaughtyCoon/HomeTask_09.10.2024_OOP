public class Wife extends Family{
    private int age;
    private String name;

    public Wife(String surname, int age, String name) {
        super(surname);
        this.age = age;
        this.name = name;
    }

    public void action(){
        System.out.println("runs the house.");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
