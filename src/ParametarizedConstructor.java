class Alian{
    int age;
    String name;
    public Alian(int a,String n){
        age = a;
        name = n;

    }
}
public class ParametarizedConstructor {
    static void main(String[] args) {
        Alian obj = new Alian(18, "Siddartha");
        System.out.println(obj.age +" : " + obj.name);

    }
}
