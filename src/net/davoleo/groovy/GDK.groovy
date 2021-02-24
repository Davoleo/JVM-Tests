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

        //Working with Collections -----------------------------------------------
        //Native support for lists maps and ranges
        //2.1 Lists
        def exampleList = [4, 5, 6, 7, 8]
        assert exampleList.get(1) == 5
        assert exampleList[1] == 5
        assert exampleList instanceof List

        //using a list as a source to create another list
        List<Integer> exampleList2 = exampleList.clone() as List<Integer>

        exampleList.clear()
        assert exampleList.size() == 0
        exampleList.add(5)
        assert exampleList.size() == 1

        //Negative indexes count from the end
        assert exampleList2[-1] == 8
        assert exampleList2.getAt(-2) == 7
        try {
            //Negative indexes can't be used with get()
            exampleList2.get(-2)
            assert false
        }
        catch (e) {
            assert e instanceof IndexOutOfBoundsException
        }

        //A list evaluates to false only when it's empty
        assert ![]

        //Iterating over lists (there's also an alternative without Index)
        exampleList2.eachWithIndex { item, index -> println("Item n$index: $item") }

        //Mapping | filtering | looping
        exampleList2.collect { it * 2 }.findAll { it > 8 }.each { println(it) }

        //An initial value can be provided
        assert exampleList2.sum() == 30

        //list joining as strings
        assert exampleList2.join('-') == '4-5-6-7-8'

        //Injecting items into strings
        assert [1, 2, 3].inject('counting: ') {
            string, item -> string + item
        } == 'counting: 123'

        exampleList = []
        assert exampleList.empty
        exampleList << 5 << 7 << 'i' << 11

        assert exampleList - 5 == [7, 'i', 11]
        //Returns true if the element is removed (false otherwise)
        assert exampleList.remove(5) == [7, 'i', 11]

        assert exampleList.removeAt(2) == [5, 7, 11]

        //Checks if two sets have no items in common
        assert exampleList.disjoint(['z', 'x'])

        assert [1, 2, 3].multiply(2) == [1, 2, 3, 1, 2, 3]

        //2.2 Maps
        def map = [
                name: 'Jack', color: 'black', id: 1234
        ]
        assert map.get("name") == 'Jack'
        assert map['color'] == 'black'

        //Empty map
        assert [:].size() == 0

        //Many list methods are also present in maps with minor differences

        //2.3 Ranges
        def range = 5..8
        //inclusive range
        assert range.size() == 4

        range = 5..<8
        //semi-exclusive range
        assert range.size() == 3

        //get endpoints without using indexes
        assert range.from == 5
        assert range.to == 7

        //ranges can also be used in switch-case statements (just like in Kotlin)

        //The star-dot operator (*) is a shorhand to call a method on all the elements of a collection
        assert [1, 3, 5] == ['a', 'few', 'words']*.size()

        //You can also use ranges in place of multiple indexes of a collection
        assert exampleList[1..2] == [5, 7]
    }
}
