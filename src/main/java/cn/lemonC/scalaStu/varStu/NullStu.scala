package cn.lemonC.scalaStu.varStu

import scala.runtime.Nothing$

object NullStu {
  def main(args: Array[String]): Unit = {
    // 1、unit为函数空返回，类似void
    def unitTest(): Unit = {
      println("unitTest")
    }
    unitTest
    // 2、Null只能用于引用类型的引用为空，数值类型不能用
    var nullVar = null
    //    var nullVar2: Int = null
    println(nullVar)
    //    println(nullVar2) // error:an expression of type Null is ineligible for implicit conversion
    // 3、nothing：可以作为非正常返回的类型
    def unitTest2(): Nothing = {
      throw new Exception()
    }

    unitTest2
  }
}
