package ArrayPractice.Easy

import scala.collection.immutable

object StringToMapTest extends App{

 /* val str = "{Account present in cassandra with non zero balance but no matching account found in the files -> 6,Value mismatch -> 1}"
  val withoutBraces: Map[String, Int] = str.drop(1).dropRight(1).split(",").map{
    arr =>
      val splitted= arr.split("->")
      splitted(0).trim -> splitted(1).trim.toInt
  }.toMap
  println(withoutBraces)
  val tempMap: Map[String, Int] = Map("Value mismatch" -> 1, "Account present in cassandra with non zero balance but no matching account found in the files" -> 6)
  println(tempMap)
  println(withoutBraces.equals(tempMap) )

*/
  var source = Map(
    "one" -> Map("a" -> "bbb", "b" -> "qww"),
    "two" -> Map("b" -> "ccc")
  )

  var target = Map(
    "one" -> Map("a" -> "bbb", "b" -> "qqq", "c" -> "ccc"),
    "two" -> Map("b" -> "ccc")
  )

  println(source.equals(target))

  val a = source.map{
    row =>
      val key = row._1
      val valuesinFirstMap: Map[String, String] = row._2
      val valuesinSecondMap: Map[String, String] =target(key)
      val diff= valuesinSecondMap -- valuesinFirstMap.keySet
      if(diff.size >0)
        {
          diff
        }
      else{
        Map.empty
      }
  }
  println(a)

}
