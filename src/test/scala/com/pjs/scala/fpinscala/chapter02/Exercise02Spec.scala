package com.pjs.scala.fpinscala.chapter02

import com.pjs.scala.fpinscala.chapter02.Exercise02.isSorted
import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by ponks on 11/08/2015.
 */
class Exercise02Spec extends FlatSpec with Matchers{

  "Given an null array when isSorted is called then" should  " be true " in {
    isSorted(null,(x:Int,y:Int)=> x<=y) should be(true)
  }

  "Given an empty array when isSorted is called then" should  " be true " in {
    isSorted(Array(),(x:Int,y:Int)=> x<=y) should be(true)
  }

  "Given an array with a single element when isSorted is called then" should  " be true " in {
    isSorted(Array(1),(x:Int,y:Int)=> x<=y) should be(true)
  }

  "Given a sorted array when isSorted is called then" should  " be true " in {
    isSorted(Array(1,2,3),(x:Int,y:Int)=> x<=y) should be(true)
  }

  "Given a unsorted array when isSorted is called then" should  " be false " in {
    isSorted(Array(3,2,1),(x:Int,y:Int)=> x<=y) should be(false)
    isSorted(Array(3,1),(x:Int,y:Int)=> x<=y) should be(false)
  }

  "Given a array of duplicate numbers when isSorted is called then" should  " be true " in {
    isSorted(Array(1,1,1),(x:Int,y:Int)=> x<=y) should be(true)
    isSorted(Array(1,1,1,2,2,2,3,3,3),(x:Int,y:Int)=> x<=y) should be(true)
  }

}
