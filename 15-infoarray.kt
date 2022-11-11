Why should you use ArrayList?

ArrayList are used to crete a dynamic array. Which means the size of an ArrayList
can be increased or decreased according to your requirement.

The ArrayList class provides both read and write functionalities.

The ArrayList follows the sequence of insertion order.

An ArrayList is non synchronized and it may countain duplicate elements.




-----------

Constructor of ArrayList


ArrayList<E>(): Is used to create an empty ArrayList 

ArrayList(capacity:Int): Is used to create an ArrayList of specified capacity

ArrayList(elements: Collection<E>): Is used to create an ArrayList filled with 
the elements of a collection 



---------------------

Function of ArrayList

open fun add(element:E):Boolean -> used to add the specific eleemnt into the collection

open fun clear() -> used to remove all elements from the collection 

open fun get(index:Int): E -> used to return the element at specified index in the list

open fun remove(element:E) Boolean -> used to remove a single instance of the 
specific element from the current collection, if it is available

There are of course many more functions in the ArrayList Class 


-----------

Empty ArrayList

fun main() {

    val arrayList = ArrayList<String>() // creating an empty arrayList
    arrayList.add("One")
    arrayList.add("Two")

    for (i in arrayList) {
        print("$i")
    }
}


-----------

ArrayList using collections

fun main(){

    val arrayList:ArrayList<String> = ArrayList<String>(5)
    var list: MutableList<String> = mutableListOf()

    list.add("One")
    list.add("Two")

    arrayList.addAll(list)

    val itr = arrayList.iterator()

    while(itr.hasNext()){
        println(itr.next())

    }
    println("Size of arrayList = "+arrayList.size)
}

----------

fun main(args:Array<String>){

    val arrayList: ArrayList<String> = ArrayList<String>()
    arrayList.add("One")
    arrayList.add("Two")

    for (i in arrayList) {
        println(i)
    }
    println("arrayList.get(1)")
    println(arrayList.get(1))

}


--------devoir-----

//This is one way of doing it, there are plenty of other ways however. If your program works, then it is fine, even if the code is different :)
fun main(){

val myArrayList: ArrayList<Double> = ArrayList()
myArrayList.add(1.75)
myArrayList.add(2.0)
myArrayList.add(2.5)
myArrayList.add(3.0)
myArrayList.add(4.0)
var total: Double = 0.0

for (i in myArrayList) {
    println(i)
    total += i
}
println(myArrayList.size)

var average = total / myArrayList.size
println("Avarage is " + average)

}