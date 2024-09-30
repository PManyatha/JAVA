public class MethodMaestro {

    static class Square{
        public void SquareOfNumber(int a){
            System.out.println(a*a);

        }
    }

    public static void main(String[] args){
        Square square= new Square();
        square.SquareOfNumber(89);
    }
}
