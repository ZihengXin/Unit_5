public class Hardware {
    public static void main (String[] args){
        Item a = new Item ("4343","Circular Saw", 122.5);
        Item b = new Item ("9876","Hammer",19.75);
        Item c = new Item ("1239","Level",12.99);
        double circularSaw = a.getTotalPrice(2);
        double hammer = b.getTotalPrice(5);
        double level = c.getTotalPrice(12);
        System.out.println("Total of circular saw: "+circularSaw);
        System.out.println("Total of hammers: "+hammer);
        System.out.println("Total of levels: "+level);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
