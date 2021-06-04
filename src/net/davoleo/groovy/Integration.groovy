package net.davoleo.groovy

import org.codehaus.groovy.control.CompilerConfiguration

class Integration {

    static void main(String[] args) {

        //Eval: Simplest way to execute Groovy dynamically at runtime Eval.me().
        assert Eval.me('"foo".toUpperCase()') == 'FOO'
        assert Eval.xyz(4, 5, 6, 'x*y+z') == 26

        //shared data between the scripts and the application
        def sharedData = new Binding()

        //Groovy Shell allows to cache the resulting script instance
        def shell = new GroovyShell(sharedData)
        assert shell.evaluate('3*5') == 15

        def script = shell.parse('3*5')
        assert script.run() == 15

        sharedData.setProperty('testHello', 'Hello Warudo!')
        String result = shell.evaluate('testHello')
        assert result == "Hello Warudo!"

        //Custom base script class
        def customConfig = new CompilerConfiguration()
        customConfig.scriptBaseClass = 'net.davoleo.groovy.CustomScript'
        def customShell = new GroovyShell(this.class.classLoader, new Binding(), customConfig)
        CustomScript customScript = customShell.parse("greet()")
        customScript.setName('KEK')
        customScript.run()

        //Groovy Class Loader
        //You can parse entire classes via the class loader
        def gcl = new GroovyClassLoader()
        //The Groovy script engine can be used to run scripts multiple times
        def engine = new GroovyScriptEngine()
    }

}
