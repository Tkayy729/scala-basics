package Day3

import munit.FunSuite

class RecursiveTest1 extends FunSuite {
    test("test"){
      val rec = new Recursive
      val actual = rec.lengthOfString("word")
      val ex = 4
      assertEquals(actual,ex)
    }
}
