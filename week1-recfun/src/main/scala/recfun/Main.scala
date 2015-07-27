package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = 
    if (c == 0 || r==0 || r==c) 
      1 
    else 
      pascal(c-1, r-1) + pascal(c, r-1)

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balanceAcc(acc: Int, chars: List[Char]): Boolean = 
      if (acc==0 && chars.isEmpty) true
      else if (chars.isEmpty) false
      else if (acc == 0 && chars.head==')') false
      else if (chars.head==')') balanceAcc(acc-1, chars.tail)
      else if (chars.head=='(') balanceAcc(acc+1, chars.tail)
      else balanceAcc(acc, chars.tail)

    balanceAcc(0, chars)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def evalTree(balance: Int, root: Int, coins: List[Int]) : Int = 
      if (balance - root == 0) 1
      else if (balance - root < 0) 0
      else if (coins.isEmpty) 0
      else 
	      evalTree(balance - root, coins.head, coins) +
	      evalTree(balance, root, coins.tail) 

    evalTree(money, 0, coins.sortBy(x => x))
  }
}