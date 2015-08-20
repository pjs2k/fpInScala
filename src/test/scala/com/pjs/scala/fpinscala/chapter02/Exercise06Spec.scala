package com.pjs.scala.fpinscala.chapter02

import com.pjs.scala.fpinscala.chapter02.Exercise06.compose
import org.scalatest._

/**
 * Created by ponks on 10/08/2015.
 */
class Exercise06Spec extends FlatSpec with Matchers {

  def multBy2(a: Int) = a * 2
  def multBy3(a: Int) = a * 3

  "Given a function to compose 2 functions when evaluated" should " result in evaluation of composed functions" in {
    val multiplyBySix = compose(multBy2, multBy3)
    multiplyBySix(3) should be(18)
  }

}
