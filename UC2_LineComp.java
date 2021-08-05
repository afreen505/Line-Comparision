public class UC2_LineComp {
    public static void main(String[]args)
    {
        int x1=8;
        int y1=9;
        int x2=9;
        int y2=7;
        int x3=8;
        int y3=5;
        int x4=10;
        int y4=12;
        System.out.println("the cordinates of line 1 are");
        System.out.println("(" + x1 + "," + y1 + ")");
        System.out.println("(" + x2 + "," + y2 + ")");
        double length=Math.sqrt(((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1)));
        System.out.println("Length is" +length);
        String str = Double.toString(length);
        System.out.println("the cordinates of line 2 are");
        System.out.println("(" + x3 + "," + y3 + ")");
        System.out.println("(" + x4 + "," + y4 + ")");
        double length2=Math.sqrt(((x4-x3) * (x4-x3)) + ((y4-y3) * (y4-y3)));
        System.out.println("Length:");
        System.out.println(length2);
        String str2 = Double.toString(length2);
        System.out.println("Comparision of two strings:");
        System.out.println(str2.compareTo(str));
        if (str.equals(str2))
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("not equal");
        }
    }
}


