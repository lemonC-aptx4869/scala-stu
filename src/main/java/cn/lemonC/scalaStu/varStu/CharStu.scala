package cn.lemonC.scalaStu.varStu

object CharStu {
  def main(args: Array[String]): Unit = {
    // 1、表示字符
    var charVar: Char = 's'
    var charVar2: Char = '\t'
    var charVar3: Char = '\\'
    println("charVar=", charVar)
    println("charVar2=", charVar2)
    println("charVar3=", charVar3)
    // 2、char的数字表示，asc编码，可加入计算
    println('a'.toInt)
    var charVar4 : Char= 'a' + 1
    println(charVar4) //默认提升为int
  }
}
