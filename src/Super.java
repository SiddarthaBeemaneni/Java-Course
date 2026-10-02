class C{
    public C(){
        System.out.println("in C ");
    }
    public C(int x){
        System.out.println("in C int");
    }
}
class D extends C{

    public D(){
        super(3);
        System.out.println("in D");
    }
    public D(int x) {
        super();
        System.out.println("in D int");
    }

}

public class Super {
    static void main(String[] args) {
        B obj = new B();

    }
}
