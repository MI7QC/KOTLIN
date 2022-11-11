/*Visibility Modifiers

are the keywords which are used to restrict the use of clases, interfaces, methods, and properties in Kotlin


What is a Visibility Modifier ?

* Visibility modifeirs are the keywords which are used to restrict the use of classes,
interfaces, metrhods, and properties in Kotlin

* These modifiers are used at multiple places such as class header or method body

* Visibility Modifiers are categorized into four diffrent types

    * public
    * private
    * internal 
    * protected 


***---- Public Modifier----***

* A public modified leent is accessible grom everywhere in the project

* It is a default modifier in Kotlin. If any class, interface etc. are not specifed with any
access/visibility modifier then that class, interface etc. is used in a public scope

* All public delcation can be placed at the top of the file. 

* If a member of a class is not specified then it is by default public. 

    Syntax of Public Modifier

    public class Example {

    }
    class Demo{

    }

    public fun hello()

    fun demo()

    public val x = 5 
    va; y = 10




***---- Private Modifier----***

 * A private modifier allows the element to be accessible only within the 
   block in which properties, fields, ect... are declared

 * The private modifier declaration does not allow access outside the scope
 
 * A private package can be accessible within tha specific file 
 
    Syntax Private Modifier

    private class Example {

        private val x= 1

        private doSomething() {

        }
    }

    In above class Example, val x and function doSomething() are declared as private.
    The class "Example" is accesible from the same source file, "val x" and "fun doSomething()" are accesible within Example class

 

***---- Internal Modifier----***

    * The internal modifier is feature in Kotlin, Which is not available in Java

    * The internal modifier makes the fiel visible only inside the module in which it is implemented

    * All the fields are declared as internal which are accessible only inside the module
      in which they are implemented

      Syntax Internal Modifier

        internal class Example {
            internal val x = 5

            internal fun getValue() {

            }
        }
        internal val y = 10


        
***---- Protected Modifier----***

    * A protected modifier with a class or an interface allows visibility to its class or subclass only

    * A protected declaration (when overridden) in its subclass is also protected unless
      it is explicitly changed. 

    * The protected modifier CANNOT be declared at top level

     Syntax of Protected Modifier

        open class Base {
            protected val i = 0
        }

        class Derived : Base() {

            fun getValue() : Int {
                return i
            }
        }

    Overriding of protected types

        open class Base {
            open protected val i = 5
        }

        class Another : Base() {
            fun getValue() : Int {
                return i
            }
            override bal i = 10
        }
*/