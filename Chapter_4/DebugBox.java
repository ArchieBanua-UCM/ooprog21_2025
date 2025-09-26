public class DebugBox
{
   private int width;
   private int length;
   private int height;

   // Default constructor
   public DebugBox()
   {
      length = 1;
      width = 1;
      height = 1;
   }

   // Parameterized constructor with correct assignments
   public DebugBox(int width, int length, int height)
   {
      this.width = width;
      this.length = length;
      this.height = height;
   }

   // Method to display the box's dimensions
   public void showData()
   {
      System.out.println("Width: " + width + "  Length: " +
        length + "  Height: " + height);
   }

   // Method to calculate volume
   public double getVolume()
   {
      return length * width * height;
   }
}
