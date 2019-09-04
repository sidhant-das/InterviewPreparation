package scalaPractice

object RandomDataTest extends App{


  val s= "10"
  val a = new java.math.BigDecimal(s)

  println(a)
  val ab = new java.text.DecimalFormat("0.###############").format(a)
  println(ab)

}
