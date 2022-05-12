public class Main {
    public static void main(String[] args) {
        double radius = 5.0;
        double side1 = 4;
        double side2 = 5;
        double rectArea = area(side1, side2);
        double circArea = area(radius);

        System.out.println(circArea);
        System.out.println(rectArea);
    }

    public static double area(double r){
        if(r<0){
            System.out.println(r+ " is an invalid number");
            return -1;
        }
        double circleArea = r*r*Math.PI;
        return circleArea;
    }

    public static double area(double s1, double s2){
        if(s1 < 0 || s2 < 0){
            System.out.println(s1 +" or " +s2+" is an invalid number");
            return -1;
        }
        double rectArea = s1 *s2;
        return rectArea;
    }
}
