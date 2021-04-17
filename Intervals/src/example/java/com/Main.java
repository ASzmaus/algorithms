package example.java.com;
public class Main {
  public static void main(String[] args) {
    int a1 = 4; 
    int b1 = 2;
    int a2 = 3;
    int b2 = 5;

    Interval p1 = new Interval(a1,b1), p2 = new Interval(a2,b2);

    System.out.println("Interval " + p1 + " has " + "begining " + p1.begining() + " and end " + p1.end());

    System.out.println("Intersection " + p1 + " i " + p2 + " = " + 
                      (p1.intersection(p2)!=null?p1.intersection(p2):"empty interval‚"));  
  }
}
