package net.davoleo.java.oop.interfaces;

/*************************************************
 * Author: Davoleo
 * Date: 25/06/2018
 * Hour: 22.05
 * Project: JavaOOP
 * Copyright - © - Davoleo - 2018
 **************************************************/

public interface Sortable<T> {

    boolean lessThan(T confrontaCon);

    boolean greaterThan(T confrontaCon);
}
