package com.pjs.scala.fpinscala.chapter03

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by ponks on 19/08/2015.
 */
class Exercise02Spec extends FlatSpec with Matchers{
  val lst = com.pjs.scala.fpinscala.chapter03.List(1,2,3,4,5)
  val emptyLst = com.pjs.scala.fpinscala.chapter03.List()

  "Given a numeric list from one to five" should " when I take the first element it should be one" in {
    com.pjs.scala.fpinscala.chapter03.List.take(lst)  should be(1)
  }

  "Given an empty list" should " when I take then an exception should be thrown" in {
    intercept[UnsupportedOperationException] {
      com.pjs.scala.fpinscala.chapter03.List.take(emptyLst)
    }
  }

}
