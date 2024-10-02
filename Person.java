public class Person {
    private String name;
    private int age;

    public Person(){
        name = "";
        age = 0;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print(){
        System.out.println("Name\t\t: "+name);
        System.out.println("Age\t\t: "+age);
    }

}
