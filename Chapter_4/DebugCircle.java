// DebugCircle.java
// Class that represents a circle with basic calculations

public class DebugCircle
{
   private int radius;

   public DebugCircle(int r)
   {
      radius = r;
   }

   public int getRad()
   {
      return radius;
   }

   public int getDiam()
   {
      return radius * 2;
   }

   public double getArea()
   {
      return Math.PI * radius * radius;
   }
}
