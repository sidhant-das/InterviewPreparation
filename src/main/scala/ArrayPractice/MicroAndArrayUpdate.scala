package ArrayPractice

import scala.collection.mutable.ArrayBuffer

object MicroAndArrayUpdate extends App{
  val noOfTestCase = scala.io.StdIn.readLine().toInt
  (1 to noOfTestCase).foreach{
    i =>
      val testCaseDetail = scala.io.StdIn.readLine()
      println(testCaseDetail)
      val inputData = testCaseDetail.split(" ")
      val arrSize = inputData(0).toInt
      val highestVal = inputData(1)
      val actualArr =new ArrayBuffer[Int]() ++ (1 to arrSize).map{
        _ =>
          scala.io.StdIn.readLine().toInt
      }



      //

  }
  def searcharray()={

  }


}
