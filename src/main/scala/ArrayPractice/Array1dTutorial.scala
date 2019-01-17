import scala.collection.mutable.ArrayBuffer

object Array1dTutorial extends App{

  val arraySize = scala.io.StdIn.readLine().toInt

  val arr = new ArrayBuffer[Int]() ++ (1 to arraySize).map{
    _ => scala.io.StdIn.readLine().toInt
  }
  println(arr.reverseNew.mkString("\n"))

  implicit class ArrayOperation[T](val arr: ArrayBuffer[T]) extends AnyVal {
    def reverseNew={
      new ArrayBuffer[T]() ++ (arr.size to 1 by -1).map{
        i =>  arr(i-1)
      }
    }
  }

  /*
  Other nicer functional way to do without using ArrayBuffer
    (0 until arraySize).map(_ => scala.io.StdIn.readInt).reverse.foreach(println)
  */
}
