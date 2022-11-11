fun main(args: Array<String>){

    // Keyword used in exception handling :

        //try:
            //the try bloack contains a set of statements which might generate an exception.
            //It must be followed by either catch or finally or both.

        //catch :
            // the catch block it used to catch the exception thrown from try block.

        //finally:
            // finally block always execute whether exception is handled or not. So it is used to execute important code statement.(like closing buffers)

        //throw :
            // the throw keyword is used to throw an exception explicitly


    //exemple

    try {
        val a = IntArray(5)
        a[5] = 10 / 0
    } catch(e: ArithmeticException) {
        println("ArithmeticException")
    } catch(e: ArrayIndexOutOfBoundsException) {
        println("ArrayIndexOutOfBoundsException")
    } catch(e: Exception) {
        println("parent exception class")
    }
    println("code after try catch")
}