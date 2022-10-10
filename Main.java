
public class Main {
    public static void main(String[] args) {
        double a[]={1,2,3,4,5,6,7,8,9,10};
        double b[]={.3,.2,.1,.4};

        Operaciones op = new Operaciones();
        //double res = op.mediaArmonica(a);
        double res =op.proporcion(a, 4);
        System.out.println(res);
    }

}