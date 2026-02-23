public class TileTester
{
    public static void runTests()
    {
        System.out.println("This is Tile Tester!!!");

        //#1 Default Constructor
        Tile t1 = new Tile();
        System.out.println("Test Default Constructor:");
        System.out.println("Expected nearby is 0 and Actual: " + t1.getNearby());
        System.out.println("Expected mined is false and Actual: " + t1.getMined());
        System.out.println();

        //#2 setNearby and getNearby
        t1.setNearby(5);
        System.out.println("Test setNearby(5):");
        System.out.println("Expected is 5 and Actual: " + t1.getNearby());
        System.out.println();

        //#3 placeMine and getMined
        t1.placeMine();
        System.out.println("Test placeMine():");
        System.out.println("Expected mined is true and Actual: " + t1.getMined());
        System.out.println();

        //#4 Scenario A
        Tile t2 = new Tile();
        t2.flag();
        boolean digResult = t2.dig();

        System.out.println("Scenario A: flag then dig");
        System.out.println("Expected dig() is false and Actual: " + digResult);
        System.out.println();

        //#5 Scenario B
        Tile t3 = new Tile();
        boolean firstFlag = t3.flag();
        boolean secondFlag = t3.flag();

        System.out.println("Scenario B: flag twice");
        System.out.println("Expected after first flag is true and Actual: " + firstFlag);
        System.out.println("Expected after second flag is false and Actual: " + secondFlag);
        System.out.println();

        System.out.println("End of Tests!!!");
    }
}