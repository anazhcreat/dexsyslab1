import java.security.spec.RSAOtherPrimeInfo;

public class Owner {
    private final String name = "Игорь";
    private final String surname = "Иванов";
    private int age;

    Owner(int age) {
        this.age = age;
    }

    public void sayAbout() {
        System.out.printf("Привет, меня зовут %s %s, мне %d лет.\n", name, surname, age);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}
