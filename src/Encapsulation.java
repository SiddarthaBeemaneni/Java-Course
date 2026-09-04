class Human{
    private int age;
    private String name;
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    public void setAge(int a) {
        age = a;
    }
public void setName(String n) {
        name = n;
}
}


        public class Encapsulation {
          static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(18);
        obj.setName("Siddartha");
        System.out.println("Name :" + obj.getName() + "Age : " + obj.getAge());
    }
}
