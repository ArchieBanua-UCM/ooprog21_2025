// Application lists valid shipping codes
// A, C, T,
// or H
// then prompts user for a code
// Application accepts a shipping code
// and determines if it is valid

import java.util.Scanner;

public class DebugEight1
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        char userCode;
        String entry;
        boolean found = false; // 1. Initialize found to false
        char[] okayCodes = {'A', 'C', 'T', 'H'};

        System.out.println("Enter shipping code for this delivery.");
        System.out.print("Valid codes are: ");

        // 2. Loop through all okayCodes to display them
        for(int x = 0; x < okayCodes.length; ++x)
        {
            System.out.print(okayCodes[x]);
            // Add comma and space after all but the last one
            if(x != (okayCodes.length - 1))
                System.out.print(", ");
        }

        System.out.print(" >> ");
        entry = input.nextLine();

        // 3. Get the first character of the input and convert to uppercase
        userCode = entry.toUpperCase().charAt(0);

        // 4. Check for a match
        for(int i = 0; i < okayCodes.length; ++i)
        {
            if(userCode == okayCodes[i]) // 4a. Use == for comparison
            {
                found = true;
                break; // 4b. Stop searching once found
            }
        }

        // 5. Correct the output logic
        if(found)
            System.out.println("Good code");
        else
            System.out.println("Sorry, code not found");
    }
}