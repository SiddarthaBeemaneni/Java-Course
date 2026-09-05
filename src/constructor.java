class Demo{
    int age ;
    String name;
    public Demo(){
        age = 14;
        name = "Siddartha";
    }
}
public class constructor {
    static void main(String[] args) {

        Demo obj = new Demo();
        System.out.println(obj.age + " : " + " " + obj.name);


    }
}
