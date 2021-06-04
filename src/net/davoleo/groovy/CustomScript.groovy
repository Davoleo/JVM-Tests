package net.davoleo.groovy

abstract class CustomScript extends Script {

    String name

    String greet() {
        "Hello, $name"
    }
}
