package com.pjs.scala.fpinscala

package object chapter02 {

  /**
   * Created by ponks on 10/08/2015.
   * Write a recursive function to get the nth Fibonacci number.
   * The first two Fibonacci numbers are 0 and 1. The nth number is
   * always the sum of the previous two–the sequence begins 0, 1, 1, 2,
   * 3, 5. Your definition should use a local tail-recursive function.
   */
  object Exercise01 {

    def fib(n: Int): Int = {
      @annotation.tailrec
      def iter(n: Int, prev: Int, acc: Int): Int = n match {
        case 0 => prev
        case _ => iter(n - 1, acc, acc + prev)
      }
      iter(n, 0, 1)
    }
  }

  /**
   * Implement isSorted, which checks whether an Array[A] is
   * sorted according to a given comparison function
   **/
  object Exercise02 {
    def isSorted[A](as: Array[A], gt: (A, A) => Boolean): Boolean = {
      @annotation.tailrec
      def go(start: Int): Boolean = {
        if (as == null || as.length == 0 || start == as.length - 1) return true
        if (!gt(as(start), as(start + 1))) return false else go(start + 1)
      }
      go(0)
    }
  }

  /**
   * Implement partial1 and write down a concrete usage
   * of it. There is only one possible implementation that compiles. We don't have any
   * def partial1[A,B,C](a: A, f: (A,B) => C): B => C
   * concrete types here, so we can only stick things together using the local 'rules of
   * the universe' established by the type signature. The style of reasoning required here
   * is very common in functional programming—we are simply manipulating symbols
   * in a very abstract way, similar to how we would reason when solving an algebraic
   * equation.
   **/
  object Exercise03 {
    def partial1[A, B, C](a: A, f: (A, B) => C): B => C = b => f(a, b)
  }

  /**
   * Let's look at another example, currying, which converts a
   * function of N arguments into a function of one argument that returns another
   * function as its result. Here again, there is only one implementation that
   * typechecks. def curry[A,B,C](f: (A, B) => C): A => (B => C)
   * What’s the benefit of using function currying? It allows you to turn generalized functions
   * into specialized ones
   **/
  object Exercise04 {
    def curry[A, B, C](f: (A, B) => C): A => (B => C) = a => b => f(a, b)
  }

  /**
   * Implement uncurry, which reverses the
   * transformation of curry. Note that since => associates to the right,
   * A => (B => C) can be written as A => B => C.
   **/
  object Exercise05 {
    def uncurry[A, B, C](f: A => B => C): (A, B) => C = (a, b) => f(a)(b)
  }

  /**
   * Implement the higher-order function that composes two
   * functions.  def compose[A,B,C](f: B => C, g: A => B): A => C
   **/
  object Exercise06 {
    def compose[A, B, C](f: B => C, g: A => B): A => C = a => f(g(a))
  }

}
