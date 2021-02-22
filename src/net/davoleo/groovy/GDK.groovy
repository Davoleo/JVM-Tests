package net.davoleo.groovy

class GDK {

    static void main(String[] args) {

        new File("poggroovy.txt") << '''Into the ancient pond
A frog jumps
Water's sound!
'''

        //File I/O
        //If something goes wrong (exception) inside of the closure Groovy automatically closes file resources
        new File("poggroovy.txt").eachLine { line, n ->
            println("Line $n: $line")
        }

        //Collecting file content
        def lineList = new File("poggroovy.txt").collect { it }
        def lineArray = new File("poggroovy.txt") as String[]

        //Traverse all the files matching the regex in a folder
        //new File("testDir").eachFileMatch(~/.*\.txt/) {}
        //Traverse all the files inside of the folder while also checking subdirectories
        //new File("testDir").eachFileRecurse {}
        //You can also use traverse() for more complex directory explorations
        //You can use {@link DataInputStream} and {@link DataOutputStream} to serialize and deserialize objects into and from files

        //Execute a command as an external process:
        //def process = "ls -l".execute()
        //println(process.text)

    }
}
