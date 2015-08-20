package com.pjs.scala.fpinscala.chapter02

import com.pjs.scala.fpinscala.chapter02.Exercise04.curry
import com.pjs.scala.fpinscala.chapter02.Exercise05.uncurry
import org.scalatest._

/**
 * Created by ponks on 10/08/2015.
 */
class Exercise05Spec extends FlatSpec with Matchers  {

  def add(a: Int, b: Int) = a + b

  "Given a curried function with add method when uncurried then " should  " call original add method" in {
    val curr=curry(add)
    curr(2)(2)
    val addMethod=uncurry(curr)
    addMethod(2,2) should be(4)
  }


}
