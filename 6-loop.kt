 /*LOOP*/
fun main() { 
 var condition = true
 // Loops
 // While Loop
 // While loop executes a block of code repeatedly as long as a given condition is true
 /*
 while(condition) {
     // code to be executed
     //println("condition excuted")
 }
 */

 var z = 1
 while(z <= 10) {
     println("$z")
     z++
 }

 // Do while loop
 // The do-while loop is similar to while loop except that it
 // tests the condition at the end of the loop.
 // This means that it will at least execute the body once
 var n = 1
 do {
     print("$n ")
     n++
 } while(n <= 10)

 var feltTemp: String = "cold"
 var roomTemp: Int = 10
 while (feltTemp == "cold"){
     roomTemp++
     if(roomTemp == 20){
         feltTemp = "comfy"
         println("it's comfy now")
     }
 }



/* 
 Write a for loop that runs from 0 to 10000
 Once it's at 9001 it should write "IT'S OVER 9000!!!"

 Write a while loop that checks the humidity (not the humidityLevel).
 The variable humidityLevel starts at 80.
 The variable humidity is initialized with "humid".
 If it is "humid" then it should reduce the "humidityLevel" by 5 and print "humidity decreased"
 Once the humidityLevel is below 60 it should print "it's comfy now" and set the humidity to "comfy"
 */

 for(num in 1..10000) {
     if (num == 9001){
         println("IT'S OVER 9000!!!")
     }
 }


 var humidityLevel : Int = 80;
 var humidity : String = "humid";

 while (humidity == "humid"){
     humidityLevel =- 5;
     if(humidityLevel < 60){
         humidity = "comfy"
         println("it's comfy now")
     }
 }

 var feltTemp: String = "cold"
 var roomTemp: Int = 10

 while (feltTemp == "cold"){
     roomTemp++
     if(roomTemp == 20){
         feltTemp = "comfy"
         println("it's comfy now")
     }
 /*
     var txt1 = "Hello World"
     var txt2 = "Hello World"
     println(txt1.compareTo(txt2))
 */
 }

 var i: Int = 0
 while (i < 10) {
     print(i)
     i++
     if (i == 4) {
         break
     }
 }

 var o: Int = 0
 while (o < 10) {
     if (o == 4) {
         o++
         print("on est dedans")
         continue
     }
     print(o)
     o++
 }


 

 // For Loop
 // A for-loop is used to iterate through ranges, arrays, collections, or anything
 // that provides an iterator (You’ll learn about iterator, arrays, ranges and collections in a future lecture).
 for(num in 1..10) {
     print("$num ")
 }

 // infix notation
 for(i in 1 until 10) { // Same as - for(i in 1.until(10))
     print("$i ")
 }

 for(i in 10 downTo 1) {     // Same as - for(i in 10.downTo(1))
     print("$i ")
 }

 for(i in 1 until 10 step 2) { // Same as - for(i in 1.until(10).step(2))
     print("$i ")
 }


 val array = arrayOf("a", "b", "c")

 for ((index, value) in array.withIndex()) {
     println("the element at $index is $value")
 }

 for (i in array.indices) {
     println(array[i])
 }



for(num in 1..10000) {
 if(num == 9001)
     print("IT'S OVER 9000!!!")
}
//As usual, there are many different solution for this :)

var humidity: String = "humid"
var humidityLevel: Int = 80

while (humidity == "humid"){
 humidityLevel-=5
 println("humidity decreased")
 if(humidityLevel < 60){
     humidity = "comfy"
     println("it's comfy now")
 }
}



val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
print(cars.size)


val ca = arrayOf("Volvo", "BMW", "Ford", "Mazda")
for(x in ca) { println(x) }


}