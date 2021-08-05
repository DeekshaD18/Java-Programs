public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Deeksha");
        person.setLastName("Dev");
        person.setAge(21);
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());
        System.out.println(person.isTeen());
        System.out.println(person.getFullName());
    }
}
