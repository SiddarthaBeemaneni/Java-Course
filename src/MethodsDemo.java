class Computer{
    public void Playmusic(){

        System.out.println("Playing Music ..... ");

    }
    public String GetMeAPen(int cost){

        return"pen";

    }
}



public class MethodsDemo {
    static void main(String[] args) {

        Computer computer = new Computer();
        computer.Playmusic();
        String str = computer.GetMeAPen(10);
        System.out.println(str);
    }
}
