package com

object ListOperations {
  def main(args: Array[String]) : Unit = {
    val list = List[Int](1,2,3,4,5,6,7,8,9,10);
    
    println("Sum of all Elements : " + list.reduce((x,y) => x+y));
    println("Total no. of Elements in the list : " + list.length);
    println("Average of Elements in the list : " + 
        list.reduce((x,y) => x+y)/list.length);
    println("Sum of all Even Elements in the list : " + 
        list.filter(x => x%2 == 0).reduce(_+_));
    println("No. of Elements divisible by 5 & 3 are : " + 
        list.filter(x => (x%5 == 0 && x%3 == 0)).length);
  }
}