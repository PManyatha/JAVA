public class MethodMaestro {

    static class Square{
        public int SquareOfNumber(int a){
            return a*a;

        }
    }

    public static void main(String[] args){
        Square square= new Square();
        System.out.println(square.SquareOfNumber(89));
    }
}
