package the_basics;

public class Variables {
    public static void main(String[] args) {

        //Variable Initialization
        //1.DataType 2.VariableName 3.Assignment 4.Value 5.EndOperator

        String facebookPageName = "CodeWall Technologies";
        int followerCount = 49000;


        System.out.println(facebookPageName);
        System.out.println(facebookPageName);

        //Modify

        facebookPageName = "CodeWall Technologies EDU";
        System.out.println(facebookPageName);

        facebookPageName = facebookPageName + " Myanmar";
        System.out.println(facebookPageName);
        System.out.println(facebookPageName);

        System.out.println(followerCount);

        followerCount = 50000;
        System.out.println(followerCount);

        followerCount = followerCount + 1000 ;
        System.out.println(followerCount);

        //Variable Declaration
        String themeColor ;

        var name = "Maung Maung";
        var count = 23456;

        //can't write like this , it is incorrect
        //var color ;


    }
}
