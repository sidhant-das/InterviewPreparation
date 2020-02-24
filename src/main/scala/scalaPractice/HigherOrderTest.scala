/*
package scalaPractice

object HigherOrderTest extends App {

  // implement the below function such that the resulting value is either a list of accumulated errors,
  // or a list of all right-hand values, A.
  def sequence[A](xs: List[Either[List[Error], A]]): Either[List[Error], List[A]] = {
    val op = xs.partition(_.isLeft)


  }


  val AlphaNumericPattern = """(^[a-zA-Z0-9]*$)""".r

  def parse(str: String): Either[List[Error], String] = str match {
    case AlphaNumericPattern(x) => Right(x)
    case x => Left(s"not alphanumeric: '$x'" :: Nil)
  }


  scala.io.Source.stdin.getLines.foreach {
    x => println(sequence(x.split(",").map(_.trim).map(parse).toList).map(_.sorted))
  }


}
*/
