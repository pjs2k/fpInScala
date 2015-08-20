package com.pjs.scala.fpinscala.chapter02

import com.pjs.scala.fpinscala.chapter02.Exercise01.fib
import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by ponks on 14/08/2015.
 */
class Exercise01Spec extends FlatSpec with Matchers  {

  "The 1st Fibonacci" should "be 0" in {
    fib(0) should be(0)
  }

  it should "be 1 for 2nd Fibonacci" in {
    fib(1) should be(1)
  }

  it should "be 1 for 3rd Fibonacci" in {
    fib(2) should be(1)
  }

  it should "be 2 for 4rd Fibonacci" in {
    fib(3) should be(2)
  }

  it should "be 3 for 5th Fibonacci" in {
    fib(4) should be(3)
  }

  it should "be 5 for 6th Fibonacci" in {
    fib(5) should be(5)
  }

}
