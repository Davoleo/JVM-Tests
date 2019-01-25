package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*************************************************
 * Author: Davoleo
 * Date / Hour: 25/01/2019 / 18:06
 * Class: ReadFile
 * Project: JavaBase
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class ReadFile {

    private Scanner scanner;

    void openFile()
    {
        try {
            scanner = new Scanner(new File("file2.txt"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("couldn't find any file");
        }
    }

    void readFile()
    {
        while (scanner.hasNext())
        {
            String id = scanner.next();
            String name = scanner.next();
            String randomWord = scanner.next();

            System.out.printf("%s | %s | %s\n", id, name, randomWord);
        }
    }

    void closeFile()
    {
        scanner.close();
    }

}
