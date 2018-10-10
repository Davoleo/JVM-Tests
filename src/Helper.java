/*************************************************
 * Author: Davoleo
 * Date: 11/10/2018
 * Hour: 00.01
 * Project: JavaBase
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class Helper {

    //Stato interno
    private String girlName;


    public void simpleMessage(String name)
    {
        System.out.println("Hello " + name);
        System.out.printf("Your first girlfriend was %s \n", this.getGirlName());
    }


    //Getter and Setter example
    public void setGirlName(String girlName)
    {
        this.girlName = girlName;
    }

    public String getGirlName()
    {
        return girlName;
    }
}
