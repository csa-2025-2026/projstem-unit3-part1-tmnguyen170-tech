import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
    Rectangle r1 = new Rectangle(3.2, 5.8);
    Rectangle r2 = new Rectangle(5.8, 3.2);

    boolean isRotated = (r1.getLength() == r2.getWidth()) && (r1.getWidth()) == (r2.getLength());

    boolean isCongruent = r1.equals(r2) || isRotated;

    double widthRatio = r1.getWidth() / r2.getWidth();
    double lengthRatio = r1.getLength() / r2.getLength();
    boolean isSimilar = isCongruent || widthRatio == lengthRatio;

    System.out.println(isRotated + " \n" + isCongruent + " \n" + isSimilar);

    // Umamusume 
  
  }
}
