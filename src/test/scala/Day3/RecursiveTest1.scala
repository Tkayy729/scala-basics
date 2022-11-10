package Day3

import munit.FunSuite

class RecursiveTest1 extends FunSuite {
    test("test"){
      val rec = new Recursive
      val actual = rec.lengthOfString("word")
      val ex = 4
      assertEquals(actual,ex)
    }

  test("testTocheckPrimeNumber"){
    val rec = new Recursive
    val actual = rec.isPrime(1500001)
    val ex = false
    assertEquals(actual, ex)
  }
}
