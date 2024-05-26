package cn.lemonC.scalaStu.varStu


object StrStu {
  def main(args: Array[String]): Unit = {
    var str: String = "testStr"
    //拼接string
    // 1、使用+拼接
    str += "test1"
    // 2、使用printf函数格式化输出
    printf("println=========%s", str)
    // 3、三引号模板输出
    // stripMargin的作用是使用“|”规范换行格式，将“|”作为换行连接符
    val tempStr =
    """
      |select * from   yy
      |table_t
      |""".stripMargin
    println(tempStr)
    //占位符${}
    // 1、s""字符串
    println(s"str = ${str}")
    // 2、s"""模板字符串
    println(
      s"""
         |select * from   ${str}
         |""".stripMargin)
  }
}