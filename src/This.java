class A {
    public A(){
        System.out.println("in A");
    }
    public A(int a){
        System.out.println("in A int");
    }
}
class B{
    public B(){
        System.out.println("int B");
    }
    public B(int b){
        System.out.println("in B int");

    }
}
    public class This {
        static void main(String[] args) {
            B obj = new B();
        }
    }
