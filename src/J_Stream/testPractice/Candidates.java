package J_Stream.testPractice;

public class Candidates {
    String name;
    String locality;
    int age;

    public Candidates(String name, String locality, int age) {
        this.name = name;
        this.locality = locality;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Candidates{" +
                "name='" + name + '\'' +
                ", locality='" + locality + '\'' +
                ", age=" + age +
                '}';
    }
}
