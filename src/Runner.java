public class Runner {
    public static void main(String[] args) {
        Car myCar = new Car (2012, "toyata", "RAV4" );
        System.out.println(myCar.toString());
        myCar.drive(10);
        System.out.println(myCar.toString());

        Rectangle purple = new Rectangle(12, 13);
        System.out.println(purple.getArea());
        System.out.println(purple.getDiagonal());
        System.out.println(purple.isSquare());



    }
}
