package ArrayPractice

object BinarySearchRecursive extends App {
  val arr = Array(2,6,8,15,20,23,26,27)
  val find = 23
  val mid= (arr.length + 0) / 2
  print(bSearchRecursive(0,arr.length,mid))
  def bSearchRecursive(leftInd:Int,rightInd:Int,md:Int):Int={
    val midValue = arr(md)
    if(midValue == find){
      md
    }
    else if(midValue < find){
      bSearchRecursive(leftInd,rightInd,mid+1)
    }
    else{
      bSearchRecursive(leftInd,rightInd,mid-1)
    }
  }
}
