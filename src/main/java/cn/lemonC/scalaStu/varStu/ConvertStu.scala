package cn.lemonC.scalaStu.varStu

object ConvertStu {
  def main(args: Array[String]): Unit = {
    //=================================隐藏转换==================================
    // 1、自动像上级转换
    var n = 1 + 2.0
    println(n)
    // 2、进度只能从小的向上转换，反之报错
    var n2: Double = 1.0
    //    var n3: Int = n2 error
    // 3、不能和char直接转换
    var n4: Byte = 97
    //    var n3: Char = n4 error
    // 4、参与计算的时候默认转换为int
    var n6: Byte = 1
    var c2: Char = 1
    var sum = n6 + c2
    println(sum)
    //    var shortVar: Short = 22 + 2 err
    //=================================强转转换==================================
    // 1、大精度向小精度转换，会造成精度缺失
    var c_n: Int = 130 //00000000 00000000 00000000 10000010
    var c_b: Byte = c_n.toByte // 10000010 => 1 111 1101=-126
    println(c_b)
  }
}
