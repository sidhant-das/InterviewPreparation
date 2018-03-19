package ArrayPractice
object BinarySearch extends App {
  newArrayConstruct
  def newArrayConstruct:Unit  ={
    val arr = Array(2,6,8,15,20,23,26,27)
    var left= arr(0)
    var right = arr(arr.length-1)
    var mid = arr.length/2
    var midValue= arr(mid) //20
    val find = 23
    while(left <= right) { //20 < 27
      if (midValue == find){
        println(mid)
      return mid
      }
      else if (midValue > find) {
        right = midValue
        mid = mid/2
        midValue= arr(mid)
      }

      else // if (midValue < find)
      {
        left = midValue
        //20
        mid = mid + (arr.length - mid) / 2
        midValue = arr(mid)

      }
    }


  }
}

