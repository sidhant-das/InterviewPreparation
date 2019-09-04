package algo

object SelectionSort extends App {
  var arr = Array(20, 35, -15, 7, 55, 1, -22,34,67,-2,14,100,-3,-9)
  for (j <- arr.length-1 to 0 by -1) {
    var largestIndex = 0
    for (i <- 1 until j+1) {
      if (arr(i) > arr(largestIndex) ) {
        largestIndex = i
      }
    }
    //swap
    val temp = arr(j)
    arr(j) = arr(largestIndex)
    arr(largestIndex) = temp
  }

  arr.foreach(a => print(s" $a"))
}
