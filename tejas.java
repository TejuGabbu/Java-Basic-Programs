class person
{
    String name;
    int age;
    String gender;

    person()
    {
        System.out.println("default contructor");
    }

    person(String name ,int age, String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void walk()
    {
        System.out.println("person is walking");
        return;
    }

    // void walk(int a)
    // {
    //     System.out.println("your number is "+a);
    //     return;
    // }

}
class doctor extends person
{
    String degree;
    String name = "doctor";
    void walk()
    {
        System.out.println("child is walking");
        return;
    }
}
public class tejas // main 
{
    public static void main(String[] args) 
    {
        person p1 = new person("tejas",21,"male");
        doctor d1 = new doctor();

        // runtime polymorphism 
        // method overiding
        person p2 = new doctor();     
        p2.walk();
        // System.out.println(d1.name);
        // d1.walk();
    }
}
