package com.pjs.scala.fpinscala.chapter02

import com.pjs.scala.fpinscala.chapter02.Exercise03.partial1
import org.scalatest._

/**
 * Created by ponks on 10/08/2015.
 */
class Exercise03Spec extends FlatSpec with Matchers  {

  def add(a: Int, b: Int) = a + b
  def sub(a: Int, b: Int) = a - b

  "Given a partial1 function with 5 and add function" should  "5" in {
    partial1(5, add)(5) should be(10)
  }

  "Given a partial1 function with 5 and sub function" should  "2" in {
    partial1(5, sub)(3) should be(2)
  }



}
