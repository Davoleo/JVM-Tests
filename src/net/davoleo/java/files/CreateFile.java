package net.davoleo.java.files;

import java.io.FileNotFoundException;
import java.util.Formatter;

/*************************************************
 * Author: Davoleo
 * Date / Hour: 25/01/2019 / 17:57
 * Class: CreateFile
 * Project: JavaBase
 * Copyright - © - Davoleo - 2018
 **************************************************/

class CreateFile {

    private Formatter formatter;

    void openFile()
    {
        try {
            formatter = new Formatter("asdf.txt");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File creation errror");
        }
    }

    void addRecords()
    {
        formatter.format("%s%s%s", "19 ", "Davoleo ", "Felt blu");
    }

    void closeFile()
    {
        formatter.close();
    }

}
