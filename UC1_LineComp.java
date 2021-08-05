public class UC1_LineComp
    {
        public static void main(String[] args)
        {
            int x1=5;
            int y1=4;
            int x2=4;
            int y2=5;
            int x3=4;
            int y3=5;
            int x4=4;
            int y4=5;
            System.out.println("the cordinates of line 1 are");
            System.out.println("(" + x1 + "," + y1 + ")");
            System.out.println("(" + x2 + "," + y2 + ")");
            double length=Math.sqrt(((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1)));
            System.out.println("Length is" +length);
        }
}
