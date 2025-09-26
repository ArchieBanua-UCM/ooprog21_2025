public class DebugBox
{
   private int width;
   private int length;
   private int height;

   public DebugBox()
   {
      length = 1;
      width = 1;
      height = 1;
   }

   public DebugBox(int width, int length, int height)
   {
      this.width = width;
      this.length = length;   // Fix here: previously length was assigned width incorrectly
      this.height = height;   // Fix here as well
   }

   public void showData()
   {
      System.out.println("Width: "  + width + "  Length: " +
        length + "  Height: " + height);
   }

   public double getVolume()
   {
      return length * width * height;
   }
}
