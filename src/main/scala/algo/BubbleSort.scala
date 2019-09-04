package algo

object BubbleSort extends App {
  var arr = Array(10, 2, 4, 100, 3, 7)
  println(arr.length)
  for (i <- 0 until arr.length) {
    //print(s" ${arr(i)} ")
    val temp = arr(i)
    if (i != arr.length-1 && arr(i) > arr(i + 1)) {
      arr(i) = arr(i + 1)
      arr(i + 1) = temp
    }
  }
  arr.foreach(println)

  def swap(firstVal: Int, secondVal: Int) = {
    if (firstVal < secondVal) {
      val first = secondVal
      val second = firstVal
      (first, second)
    } else {
      (firstVal, secondVal)
    }
  }
}

