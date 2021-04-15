/**
 * Programmer: Felipe Seixas 
 * What: Cast of numbers
 * When: 15/04/2021 
 */

fun main() {
    
    var valor = 50
    
    println("valor = $valor")
    
    var valorDouble = valor.toDouble()
    
    println("IntToDouble = $valorDouble")
    
    var valorFloat = valor.toFloat()
    
    println("IntToFloat = $valorFloat")
    
    var nInt = valorDouble.toInt()
    
    println("DoubleToInt = $nInt")

    var byte = valor.toByte()
    
    println("IntToByte = $byte")
    
    var short = valor.toShort()
    
    println("IntToShort = $short")
    
    var long = valor.toLong()
    
    println("IntToLong = $long")
      
}