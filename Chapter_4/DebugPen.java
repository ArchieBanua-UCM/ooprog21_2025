public class DebugPen
{
   private String color;
   private String point;

   // Default constructor
   public DebugPen()
   {
      color = "black";
      point = "fine";
   }

   // Parameterized constructor with proper assignments
   public DebugPen(String color, String point)
   {
      this.color = color;
      this.point = point;
   }

   // Getter for color
   public String getColor()
   {
      return color;
   }

   // Getter for point
   public String getPoint()
   {
      return point;
   }
}
