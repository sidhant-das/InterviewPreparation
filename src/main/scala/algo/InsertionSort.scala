package algo

import scala.collection.mutable.ArrayBuffer

object InsertionSort extends App {
  var arr = ArrayBuffer(20, 35, -15, 7, 55, 1, -22, 34, 67, -2, 14, 100, -3, -9)
  for(i <- 1 until arr.length){
    val temp = arr(i)
    var j = i-1
    var k = i
    while(j >= 0 && arr(j)> temp){
      arr(k) = arr(j)
      arr(j) = temp
      j= j-1
      k = k -1
    }

  }
  arr.foreach(println)
}
