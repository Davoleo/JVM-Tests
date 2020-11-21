/* -----------------------------------
 * Author: Davoleo
 * Date / Hour: 10/08/2020 / 09:43
 * Class: ClassHeader
 * Project: JavaBase
 * Copyright - © - Davoleo - 2020
 * ----------------------------------- */

package net.davoleo.java.oop.interfaces;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//Makes this annotation repeatable, although you have to create a container annotation class
//(with one method value that returns an array of ClassHeader)
//@Repeatable(ClassHeaders.class)
//Defines where this annotation can be applied
@Target(ElementType.TYPE)
//This annotation will be automatically documented
@Documented
public @interface ClassHeader {

    String author();

    String date();

    int currentRevision() default 1;

    String lastModified() default "N/A";

    String lastModifiedBy() default "N/A";

    String[] reviewers();

}
