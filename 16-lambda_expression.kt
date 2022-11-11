/*
https://kotlinlang.org/docs/lambdas.html#higher-order-functions

lambda expression ?

lambda (expression) is a function which has no name

Lambda expressions and anonymous functions are 'function literals',
functions tbat are not declared, but passed immediately as an expression


lambda is defined with curly braces {} wich takes variables as a parameter (if any) and a body of a function

the body of a function is written after the variable (if any) followed by  -> operator

syntax : {variable(s) -> body_of_lambda}



normal function : addition of two numbers

we create a function addNumber() passing two arguments (a,b)

addNumber(5,10) // let say passing the values are a=5 and b=10

fun adNumber(a:Int, b:Int){
    var add = a+ b
    println(add)
}



Lambdda expression: addition of two numbers

we will writre the same example using a lambda expression

val sum: (Int,Int) -> Int = {a:Int , b:Int -> a + b}
 println(sum(10,5))


//Even Shoter

val sum = {a:Int, B:Int -> println(a + b)}
sum(10,5)
*/