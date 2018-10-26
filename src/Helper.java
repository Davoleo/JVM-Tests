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

    public Helper()
    {}

    public Helper(String name)
    {
         girlName = name;
    }

    public void simpleMessage(String name)
    {
        System.out.println("Ciao " + name);
        System.out.printf("La tua prima ragazza era %s \n", this.getGirlName());
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
