public class Person {
    private String name;
    private String family;
    private int age;
    private Sex sex;
    private Education education;

    public Person (String name, String family, int age, Sex sex, Education education) {
        this.name = name;
        this.family = family;
        this. age = age;
        this.sex = sex;
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public Education getEducation() {
        return education;
    }

    @Override
    public String toString() {
        return "Личные данные: {" +"\n"
                + "Имя: " + name + "\n"
                + "Фамилия: " + family + "\n"
                + "Возраст: " + age + "\n"
                + "Пол: " + sex + "\n"
                + "Образование: " + "\n"
                + "}";
    }
}
