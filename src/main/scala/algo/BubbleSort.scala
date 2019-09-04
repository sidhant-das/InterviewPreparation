package algo

object BubbleSort extends App {
  var arr = Array(10, 2, 4, 100, 3, 7)
  for(j <- arr.length to 0 by -1 ){
    for (i <- 0 until arr.length) {
      if (i != arr.length-1 && arr(i) > arr(i + 1)) {
        val temp = arr(i)
        arr(i) = arr(i + 1)
        arr(i + 1) = temp
      }
    }
  }

  arr.foreach(println)

}

