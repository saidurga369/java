package team_wolf.rest;

public class Flames
{
    public String flames(String str1,String str2)
    {
        String name1 = str1;
        String name2 = str2;;

        // Removing common characters from names
        String temp1 = "", temp2 = "";
        for (int i = 0; i < name1.length(); i++)
        {
            char c = name1.charAt(i);
            if (name2.indexOf(c) == -1)
            {
                temp1 += c;
            }
        }
        for (int i = 0; i < name2.length(); i++) 
        {
            char c = name2.charAt(i);
            if (name1.indexOf(c) == -1)
            {
                temp2 += c;
            }
        }

        // Concatenating the remaining characters
        String combinedString = temp1 + temp2;

        // Finding the length of the combined string
        int len = combinedString.length();

        // Flames algorithm
        String f = "flames";
        while (f.length() > 1) {
            int index = len % f.length();
            String part1 = f.substring(0, index-1);
            String part2 = f.substring(index);
            f = part1 + part2;
        }

        // Mapping the result to the corresponding outcome
        String result = "";
        switch (f) 
        {
            case "f":
                result = "Friends";
                break;
            case "l":
                result = "Lovers";
                break;
            case "a":
                result = "Affectionate";
                break;
            case "m":
                result = "Marriage";
                break;
            case "e":
                result = "Enemies";
                break;
            case "s":
                result = "Siblings";
                break;
        }

        return ("Result: " + result);
    
}
}
