package forcomp

object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  Anagrams.wordOccurrences("tea")                 //> res0: forcomp.Anagrams.Occurrences = List((a,1), (e,1), (t,1))
  Anagrams.wordOccurrences("time")                //> res1: forcomp.Anagrams.Occurrences = List((e,1), (i,1), (m,1), (t,1))

 	val occList = Anagrams.sentenceOccurrences(List("golf"))
                                                  //> occList  : forcomp.Anagrams.Occurrences = List((f,1), (g,1), (l,1), (o,1))

	Anagrams.dictionaryByOccurrences(occList) //> res2: List[forcomp.Anagrams.Word] = List(flog, golf)
	
	Anagrams.wordAnagrams("golf")             //> res3: List[forcomp.Anagrams.Word] = List(flog, golf)

	Anagrams.combinations(List(('a', 2), ('b', 2)))
                                                  //> res4: List[forcomp.Anagrams.Occurrences] = List(List((a,1), (b,1)), List((a,
                                                  //| 1), (b,2)), List((a,1)), List((a,2), (b,1)), List((a,2), (b,2)), List((a,2))
                                                  //| , List((b,1)), List((b,2)), List())
	
	Anagrams.subtract(List(('a', 2), ('b', 2)), List(('b', 1)))
                                                  //> res5: forcomp.Anagrams.Occurrences = List((a,2), (b,1))
	val sentence = List("Yes", "man")         //> sentence  : List[String] = List(Yes, man)
	
	Anagrams.sentenceAnagrams(sentence)       //> res6: List[forcomp.Anagrams.Sentence] = List(List(sane, my), List(Sean, my),
                                                  //|  List(man, yes), List(say, men), List(as, en, my), List(as, my, en), List(me
                                                  //| n, say), List(en, as, my), List(en, my, as), List(yes, man), List(my, sane),
                                                  //|  List(my, Sean), List(my, as, en), List(my, en, as))

	Anagrams.sentenceAnagrams(List())         //> res7: List[forcomp.Anagrams.Sentence] = List(List())
	
	
	
}