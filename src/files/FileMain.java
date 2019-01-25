package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

/*************************************************
 * Author: Davoleo
 * Date / Hour: 25/01/2019 / 17:23
 * Class: FileMain
 * Project: JavaBase
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class FileMain {

    public static void main(String[] args)
    {
        //File Info, does it exist?
        File x = new File("asdf.txt");

        if (x.exists())
            System.out.println(x.getName() + " Exists");
        else
            System.out.println("This file doesn't exist");

        //--------------------------------------------------------
        //Creating files

        final Formatter formatter;

        try
        {
            formatter = new Formatter("asdf.txt");
            System.out.println("you created a file!");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error while creating the file!");
        }

        //----------------------------------------------------------
        //Writing to files

        CreateFile file = new CreateFile();
        file.openFile();
        file.addRecords();
        file.closeFile();

        //-----------------------------------------------------------
        //Reading from files

        ReadFile file2 = new ReadFile();
        file2.openFile();
        file2.readFile();
        file2.closeFile();


    }



}
