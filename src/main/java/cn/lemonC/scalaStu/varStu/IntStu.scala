package cn.lemonC.scalaStu.varStu


object IntStu {

  def main(args: Array[String]): Unit = {
    // 1、byte
    var byteVar: Byte = 122
    // 2、short
    var shortVar: Short = 3123
    // 3、int
    var intVar: Int = 2131
    //字面值默认为int
    var intVarDefault = 123
    // 4、long
    var longVar: Long = 213
    //由于字面量默认为int，long需手动声明L或者l
    var longVar2 = 123L;

  }
}
