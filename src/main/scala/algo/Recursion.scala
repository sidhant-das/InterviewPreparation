package algo

import scala.annotation.tailrec

object Recursion extends App{
  def factRecursion(num: Int):Int ={
    if (num ==1){
      1
    }else{
      num * factRecursion(num-1)
    }
  }
  println(factRecursion(3))
  println(tailRecursion(3))

  def tailRecursion(num: Int) = tailRecursionBody(num,1)
  @tailrec
  def tailRecursionBody(num:Int,accumulator : Int):Int={
    if(num == 1){
      accumulator
    }else
      tailRecursionBody(num -1, num*accumulator)

  }

}
