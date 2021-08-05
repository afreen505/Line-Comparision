public class UC3_LineComp {
       public static void main(String[] args) {
            int x1=4;
            int y1=4;
            int x2=6;
            int y2=6;
            int x3=8;
            int y3=8;
            int x4=10;
            int y4=10;
            System.out.println("the cordinates of line 1 are");
            System.out.println("(" + x1 + "," + y1 + ")");
            System.out.println("(" + x2 + "," + y2 + ")");
            double length=Math.sqrt(((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1)));
            System.out.println(length);
            String str = Double.toString(length);
            System.out.println("the cordinates of line 2 are");
            System.out.println("(" + x3 + "," + y3 + ")");
            System.out.println("(" + x4 + "," + y4 + ")");
            double length2=Math.sqrt(((x4-x3) * (x4-x3)) + ((y4-y3) * (y4-y3)));
            System.out.println(length2);
            String str2 = Double.toString(length2);
            System.out.println(str2.compareTo(str));
            if(str2.compareTo(str)>0)
                System.out.println( "Length2 is greater than length1" );
            else if(str2.compareTo(str)==0)
                System.out.println( "length2 is equal to length1");
            else
                System.out.println("length2 is smaller than length");


    }


}
