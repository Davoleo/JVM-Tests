package net.davoleo.groovy.meta

class ExampleIntegerExtension {
    /**
     * @param self The object of the class this method will extend
     * @param fun The code to execute
     */
    static void maxRetries(Integer self, Closure fun) {
        assert self >= 0
        int retries = self
        Throwable e = null
        while (retries > 0) {
            try {
                fun.call()
                break
            }
            catch (Throwable error) {
                e = error
                retries--
            }
        }
        if (retries == 0 && e)
            throw e
    }
}
