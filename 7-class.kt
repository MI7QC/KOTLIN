/*
Please create a class called MobilePhone. It should have three primary constructor variables, osName, brand and model.
Use the initializer to print those details.
Create three objects of that class in the Main function.
Examples of phones would be:
Samsung Galaxy S20 Ultra. Here the osName is Android, brand is Samsung, model is Galaxy S20 Ultra
*/


fun main() {

    val phone1 = MobilePhone("IOS","Apple","Iphone")
    val phone2 = MobilePhone("Android","SamSumg","Galaxy S20")

}

class MobilePhone(osName: String, brand : String , model: String){

init {
    println(" Here the osName is $osName, brand is $brand, model is $model")
}
}



//   Class withg constructor  and second constructor
/* 
fun main() {

    val person1 = Person("Denis", "Panjuta")
    // Calls the secondary constructor
    val person2 = Person("sam", "Musk", 48, "red")
            person2.hobby = "sexe"
            person2.stateHobby()
}

// Having multiple overloads:

    class Person(firstName: String, lastName: String) {
        var age: Int? = null
        var eyeColor: String? = null
        var firstName : String? = null
        var hobby : String? = null

        init {
            this.firstName = firstName
            println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
        }


        // Secondary Constructor
        constructor(firstName: String, lastName: String, age: Int, eyeColor: String):
                this(firstName, lastName)  {
                this.age = age
                this.eyeColor = eyeColor

            println("second constructor firstName = $firstName and lastName = $lastName age $age" + " color eye  $eyeColor" )

        }

        fun stateHobby() {
            println(" the hobby the $firstName is $hobby")
        }
    }

    */



/*

    fun main() {
        val iphone = MobilePhone("iOS", "Apple", "iPhone 12")
        val galaxyS20 = MobilePhone("Android","Samsung", "Galaxy S20")
        val mateXS = MobilePhone("Android", "Huawei", "Mate X S")
        iphone.chargeBattery(5)
    }

    
    class MobilePhone(osName: String, brand: String, model: String){
        private var battery = 30
    
        init {
            println("The phone $model from $brand uses $osName as its Operating System")
    
        }
        fun chargeBattery(chargedBy: Int ) {
            while (battery <= 95) {
            println("Battery was at $battery and is at ${battery+chargedBy} now")
            battery += chargedBy
            }
        }
    }
    

    
*/