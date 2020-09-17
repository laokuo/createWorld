package reflect;

public class Mainfunc {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> cla = Class.forName("reflect.Person");
        Person person = (Person) cla.newInstance();
        person.setAge(15);
        person.setName("tianlu");
        System.out.println(person);
    }
}
