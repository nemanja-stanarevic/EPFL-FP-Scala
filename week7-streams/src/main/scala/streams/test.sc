package streams

object test {
   val level =
     """------
        |--ST--
        |--oo--
        |--oo--
        |------""".stripMargin                    //> level  : String = ------
                                                  //| --ST--
                                                  //| --oo--
                                                  //| --oo--
                                                  //| ------
	val test ="""a
		|b
c""".stripMargin                                  //> test  : String = a
                                                  //| b
                                                  //| c
                                                  
                                                  
	val levelPos = Vector(Vector('S', 'T'), Vector('o', 'o'), Vector('o', 'o'))
                                                  //> levelPos  : scala.collection.immutable.Vector[scala.collection.immutable.Vec
                                                  //| tor[Char]] = Vector(Vector(S, T), Vector(o, o), Vector(o, o))

  /**
   * A level constructed using the `InfiniteTerrain` trait which defines
   * the terrain to be valid at every position.
   */
  object InfiniteLevel extends Solver with InfiniteTerrain {
    val startPos = Pos(1,3)
    val goal = Pos(3,3)
  }
 
	println(InfiniteLevel.solution)           //> List(Right, Down, Down, Left)

 abstract class Level extends Solver with StringParserTerrain
  
  object Level0 extends Level {
    val level =
      """------
        |--ST--
        |--oo--
        |--oo--
        |------""".stripMargin
  }

  println(Level0.solution)                        //> List(Up, Right, Down)

 object Level1 extends Level {
    val level =
      """ST""".stripMargin
  }

	Level1.findChar('S', Level1.vector)       //> res0: streams.test.Level1.Pos = Pos(0,0)

  println(Level1.solution)                        //> List()
  
  

}