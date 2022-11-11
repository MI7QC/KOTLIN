fun main(){
//https://kotlinlang.org/docs/collections-overview.html

    val months = listOf("January","February","March")
    val anyTypes = listOf(1,2,3,true,false,"String")

    print(anyTypes.size)
    print( "\nthe second element " + months[1] + "\n")

    if (months[1] == months[1]) {
        println( "\n caca "  + months[1])
    }

    for(month in months) {
        println(month)
    }

    val additionalMonth = months.toMutableList()
    val newMonths = arrayOf("April", "May", "June")
    additionalMonth.addAll(newMonths)
    additionalMonth.add("July")
    print("\nmutation d'array " + additionalMonth)

    val days = mutableListOf<String>("Mon","Tue","Wed")
    days.add("Thu")
    days[2] = "replaced"
    days.removeAt(0)
    print("\nmutableListOf ${days}")
}