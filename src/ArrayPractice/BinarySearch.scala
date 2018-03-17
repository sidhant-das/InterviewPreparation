package ArrayPractice

object BinarySearch extends App {

  def newArrayConstruct: Unit ={
    val arr = Array(2,6,8,15,20,23,26,27)
    val mid = arr.length/2
    var newArray = Array() // Difference between Array and Array() in scala
    for(a <- mid until arr.length){
      newArray :+ a
    }

  }
}

