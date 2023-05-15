public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalAccessException {
        if (age < 0) throw new IllegalAccessException("Некорректный возраст");
        else this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (this.name == null || this.surname == null)
            throw new IllegalStateException("Имя и фамилия обязательны для указания");
        else return new Person(name, surname, age, address);
    }
}