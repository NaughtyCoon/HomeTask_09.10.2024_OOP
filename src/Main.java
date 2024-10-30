public class Main {
    public static void main(String[] args) {

        Family family = new Family("Smith");
        System.out.println("Meet the family of " + family.getSurname());

        Husband husband = new Husband(family.getSurname(), 32, "John");
        System.out.println("Meet the family captain: " + husband.getName() + " " +
                husband.getSurname() + ", " + husband.getAge() + " y.o.");

        Wife wife = new Wife(family.getSurname(), 27, "Mary");
        System.out.println("Meet the family lady: " + wife.getName() + " " +
                wife.getSurname() + ", " + wife.getAge() + " y.o.");

        Daughter daughter = new Daughter(family.getSurname(), 8, "Jenny");
        System.out.println("Meet the little princess: " + daughter.getName() + " " +
                daughter.getSurname() + ", " + daughter.getAge() + " y.o.");

        System.out.println("\nEverybody performs his duties: ");
        System.out.print(husband.getName() + " " + husband.getSurname() + " ");
        husband.action();
        System.out.print(wife.getName() + " " + wife.getSurname() + " ");
        wife.action();
        System.out.print(daughter.getName() + " " + daughter.getSurname() + " ");
        daughter.action();

    }
}
