package cn.lemonC.scalaStu.varStu

/**
 * @Description: 变量
 * @Author: lemonC
 * @Date: 2024/5/24
 */
class VarStu {
  //var修饰变量
  var testInt: Int = 2
  // 1、不写类型自动推测
  var testInt2 = 2
  // 2、指定变量必须赋值
  //  var testInt3 error:Wrong variable declaration

  //val修饰常量
  val testIntFinal: Int = 2
  // 1、不写类型自动推测
  // 2、不能被修改引用
  //  testIntFinal = 3 error:Reassignment to val
  // 3、指定变量必须赋值
  //  val testIntFinal2 error:Wrong variable declaration

  //命名
  // 1、以字母下划线打头，后接数字、字母、下划线
  var testVar_2 = 2
  var _testVar_2 = 2
  // 2、以操作符开头，且只包含操作符（+ * / # !等）
  var !@# = 2
  // 3、用反斜号包裹关键字
  var `if` = 2

}

object VarStu {

}
