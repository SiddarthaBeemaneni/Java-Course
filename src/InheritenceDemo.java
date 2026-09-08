class InheritanceDemo {
    public static void main(String[] args) {

        AdvCal obj = new AdvCal();

        int r1 = obj.Add(3, 4);
        int r2 = obj.Sub(12, 4);
        int r3 = obj.Mul(12, 4);
        int r4 = obj.Div(12, 4);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}