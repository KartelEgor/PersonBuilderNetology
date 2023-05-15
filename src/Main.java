public class Main {

    public static void main(String[] args) {
        Person mom = null;
        try {
            mom = new PersonBuilder()
                    .setName("Екатерина")
                    .setSurname("Уварова")
                    .setAge(34)
                    .build();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println(mom);

        try {
            Person me = new PersonBuilder()
                    .setName("Андрей")
//                    .setSurname("Растаропный")
                    .build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        mom.happyBirthday();
        System.out.println(mom);

        mom.setAddress("г. Москва, ул. Арбасткая, д. 10");

        Person son = mom.newChildBuilder()
                .setName("Илья")
                .build();

        System.out.println(son);
    }
}
