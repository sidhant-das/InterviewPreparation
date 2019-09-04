package ArrayPractice.Easy

import scala.collection.mutable.ArrayBuffer

object HamiltonianAndLagrangian extends App {

  val noOfTestCase = scala.io.StdIn.readLine().toInt
  val actualArr =new ArrayBuffer[Int]() ++ (1 to noOfTestCase).map{
    _ =>
      scala.io.StdIn.readLine().toInt
  }
  println(actualArr)
  val iter = actualArr.iterator
  var max = iter.next()
  while(iter.hasNext){
    val next = iter.next()
    if(max <= next){
      max = next
    }

  }
  println(max)

}
