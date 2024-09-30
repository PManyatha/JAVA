public class ConstructorConnoisseur {
    static class Constructor{
        int a;
        Constructor(int a){
            System.out.print(a);
        }
    }
    public static void main(String[] args) {
        Constructor costructor=new Constructor(3);
    }
}

