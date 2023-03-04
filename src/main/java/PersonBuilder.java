public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Каждый человек обязан иметь имя");
        } else
            this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        if (surname == null) {
            throw new IllegalArgumentException("Каждый человек обязан иметь фамилию");
        } else
            this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст должен быть больше 0");
        } else
            this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        Person person;
        if (name == null || surname == null)
            throw new IllegalStateException("Каждый человек обязан иметь имя и фамилию");
        if (age < 0) {
            person = new Person(name, surname);
        } else person = new Person(name, surname, age);
        person.setAddress(address);
        return person;
    }
}
