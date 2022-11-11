fun main(){

    val fruits = setOf<String>("Orange","Apple","Mango","Grape","Apple","Orange")
    print("\nclassé par alphabétique " + fruits.toSortedSet())

    val newFruits = fruits.toMutableList()
    newFruits.add("Water Melon")
    newFruits.add("Pear")
    print("\nindex 5 " + newFruits.elementAt(4))

    val dayOfTheWeek = mapOf(1 to "Monday",2 to "Tuesday",3 to "Wednesday")

    for (key in dayOfTheWeek.keys){
        print("\n key $key is to ${dayOfTheWeek[key]} ")
    }

    val fruitsMap = mapOf(
        "Favorite" to Fruit("Grape", 2.5),
        "Correct"  to Fruit("Apple", 1.5)
    )


    val newDaysOfWeek = dayOfTheWeek.toMutableMap()
    newDaysOfWeek[4] = "Thursday"
    newDaysOfWeek[5] = "Friday"
    print("\n")
    print(newDaysOfWeek.toSortedMap())

}

data class Fruit(val name: String, val price: Double)