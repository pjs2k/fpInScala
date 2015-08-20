package com.pjs.scala.fpinscala

/**
 * Perhaps the most ubiquitous of functional data
 * structures, the singly-linked list. The definition here is identical in spirit to (though
 * simpler than) the data type defined in Scala's standard List library
 */
package object chapter03 {

  sealed trait List[+A]

  case object Nil extends List[Nothing]

  case class Cons[+A](head: A, tail: List[A]) extends List[A]

  object List {
    def sum(ints: List[Int]): Int = ints match {
      case Nil => 0
      case Cons(x, xs) => x + sum(xs)
    }

    def product(ds: List[Double]): Double = ds match {
      case Nil => 1.0
      case Cons(0.0, _) => 0.0
      case Cons(x, xs) => x * product(xs)
    }

    /*
    * Implement the function tail for "removing" the first element
    * of a List. Notice the function takes constant time.
    */
    def take[A](lst: List[A]): A = lst match {
        case Nil => throw new UnsupportedOperationException("Cannot take from an empty list")
        case Cons(x, xs) => x
    }


    def apply[A](as: A*): List[A] =
      if (as.isEmpty) Nil
      else Cons(as.head, apply(as.tail: _*))
  }


}
