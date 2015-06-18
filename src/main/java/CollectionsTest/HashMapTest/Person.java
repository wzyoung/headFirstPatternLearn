package CollectionsTest.HashMapTest;

/**
 * Created by wzyoung on 2015/6/18.
 */
public class Person {

    private String name;

    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (!name.equals(person.name)) return false;
        if (!sex.equals(person.sex)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + sex.hashCode();
        return result;
    }
}
