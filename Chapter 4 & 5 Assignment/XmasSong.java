import java.util.Scanner;

public class XmasSong {

    public static void main(String[] args) {

        String christmas = """
                Day 1  On the first day of Christmas
                Day 2  On the second day of Christmas
                Day 3  On the third day of Christmas
                Day 4  On the fourth day of Christmas
                Day 5  On the fifth day of Christmas
                Day 6  On the sixth day of Christmas
                Day 7  On the seventh day of Christmas
                Day 8  On the eighth day of Christmas
                Day 9  On the ninth day of Christmas
                Day 10 On the tenth day of Christmas
                Day 11 On the eleventh day of Christmas
                Day 12 On the twelfth day of Christmas
                """;

        System.out.print(christmas);

        Scanner obtain = new Scanner(System.in);

        System.out.print("Enter Number Of Days  ");
        int day = obtain.nextInt();

        for(int count=1; count <=12; count++){   

        if (day < 1 || day > 12) {
            System.out.println("Invalid Input");
        }

            switch (day) {

                

                case 1 -> {
                    System.out.println("On the first day of Christmas");
                    System.out.println("""
                            My true love gave to me
                            A partridge in a pear tree
                            """);
                }
                case 2 -> {
                    System.out.println("On the second day of Christmas");
                    System.out.println("""
                            My true love gave to me
                            Two turtle doves
                            And a partridge in a pear tree
                          
                            """);  
                  }
                case 3 -> {
                    System.out.println("On the third day of Christmas");
                    System.out.println("""
                            My true love gave to me
                            Three French hens
                            Two turtle doves
                            And a partridge in a pear tree (how wonderful) 
                            """);
                    }
    

                case 4 -> {
                    System.out.println("On the fourth day of Christmas");
                    System.out.println("""
                            My true love gave to me
                            Four calling birds
                            Three French hens
                            Two turtle doves
                            And a partridge in a pear tree
                            """);
                        }
                 

                case 5 -> {
                    System.out.println("On the fifth day of Christmas");
                    System.out.println("""
                            My true love gave to me
                            Five golden rings
                            Four calling birds
                            Three French hens
                            Two turtle doves
                            And a partridge in a pear tree (fantastic)
                            """);
                      }

                case 6 -> {
                    System.out.println("On the sixth day of Christmas");
                    System.out.println("""
                            My true love gave to me
                            Six geese a-laying
                            Five golden rings
                            Four calling birds
                            Three French hens
                            Two turtle doves
                            And a partridge in a pear tree               
                                """);
                    }

                case 7 -> {
                    System.out.println("On the seventh day of Christmas");
                    System.out.println("""
                            My true love gave to me
                            Seven swans a-swimming
                            Six geese a-laying
                            Five golden rings
                            Four calling birds
                            Three French hens
                            Two turtle doves
                            And a partridge in a pear tree
                            """);
                    }
                    
                case 8 -> {
                    System.out.println("On the eighth day of Christmas");
                    System.out.println("""
                            My true love gave to me
                            Eight maids a-milking
                            Seven swans a-swimming
                            Six geese a-laying
                            Five golden rings
                            Four calling birds
                            Three French hens
                            Two turtle doves
                            And a partridge in a pear tree (beautiful)
                            """);
                    }

                case 9 -> {
                    System.out.println("On the ninth day of Christmas");
                    System.out.println("""
                            My true love gave to me
                            Nine ladies dancing
                            Eight maids a-milking
                            Seven swans a-swimming
                            Six geese a-laying
                            Five golden rings
                            Four calling birds
                            Three French hens
                            Two turtle doves
                            And a partridge in a pear tree
                                """);
                       }

                case 10 -> {
                    System.out.println("On the tenth day of Christmas");
                    System.out.println("""                   
                            My true love gave to me
                            Ten lords a-leaping
                            Nine ladies dancing
                            Eight maids a-milking
                            Seven swans a-swimming
                            Six geese a-laying
                            Five golden rings
                            Four calling birds
                            Three French hens
                            Two turtle doves
                            And a partridge in a pear tree
                            """);
                        }

                case 11 -> {
                    System.out.println("On the eleventh day of Christmas");
                    System.out.println("""
                            My true love gave to me
                            Eleven pipers piping
                            Ten lords a-leaping
                            Nine ladies dancing
                            Eight maids a-milking
                            Seven swans a-swimming
                            Six geese a-laying
                            Five golden rings
                            Four calling birds
                            Three French hens
                            Two turtle doves
                            And a partridge in a pear tree (how lovely)
                                """);
                        }
                    

                case 12 -> {
                    System.out.println("On the twelfth day of Christmas");
                    System.out.println("""
                            My true love gave to me
                            Twelve drummers drumming
                            Eleven pipers piping
                            Ten lords a-leaping
                            Nine ladies dancing
                            Eight maids a-milking
                            Seven swans a-swimming
                            Six geese a-laying
                            Five golden rings
                            Four calling birds
                            Three French hens
                            Two turtle doves
                            And a partridge in a pear tree
                            """);
                            }
            }
            day = obtain.nextInt();
        }

        
    }
}

