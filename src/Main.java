public class Main {
    public static void main(String[] args) {
        Backend[] backendArr = {new Java(), new CSharp(), new Python()};

        for (Backend b : backendArr) {
            System.out.println(b.getClass());
            if (b instanceof Java) {
                Java j = (Java) b;
                j.spring();
            } else if (b instanceof CSharp) {
                CSharp c = (CSharp) b;
                c.dotNet();
            } else if (b instanceof Python) {
                Python p = (Python) b;
                p.django();
            }
        }
    }

}