package com.pjs.scala.fpinscala.chapter02

import com.pjs.scala.fpinscala.chapter02.Exercise04.curry
import org.scalatest._

/**
 * Created by ponks on 10/08/2015.
 */
class Exercise04Spec extends FlatSpec with Matchers  {

  def add(a: Int, b: Int) = a + b

  "Given a curried function when called with add function and params of 2 and 2 then " should  "4" in {
    curry(add)(2)(2) should be(4)
  }



}
