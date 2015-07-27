package patmat


object test {
	val str = "welcome to the scala worksheet"//> str  : String = welcome to the scala worksheet

	val hl = Huffman.times(str.toList)        //> hl  : List[(Char, Int)] = List((k,1), (r,1), (a,2), (s,2), (h,2), (t,3), ( ,
                                                  //| 4), (m,1), (o,3), (c,2), (l,2), (e,5), (w,2))
                                                  
//  val leafs = Huffman.makeOrderedLeafList(hl)
                                                  
 //	Huffman.combine(leafs)
 	
 	
  val codeTree = Huffman.createCodeTree(str.toList)
                                                  //> codeTree  : patmat.Huffman.CodeTree = Fork(Fork(Fork(Leaf(t,3),Leaf(o,3),Lis
                                                  //| t(t, o),6),Fork(Fork(Leaf(m,1),Leaf(a,2),List(m, a),3),Leaf( ,4),List(m, a, 
                                                  //|  ),7),List(t, o, m, a,  ),13),Fork(Fork(Fork(Leaf(s,2),Leaf(h,2),List(s, h),
                                                  //| 4),Fork(Leaf(c,2),Leaf(l,2),List(c, l),4),List(s, h, c, l),8),Fork(Fork(Leaf
                                                  //| (w,2),Fork(Leaf(k,1),Leaf(r,1),List(k, r),2),List(w, k, r),4),Leaf(e,5),List
                                                  //| (w, k, r, e),9),List(s, h, c, l, w, k, r, e),17),List(t, o, m, a,  , s, h, c
                                                  //| , l, w, k, r, e),30)

	val public = Huffman.decodedSecret        //> public  : List[Char] = List(h, u, f, f, m, a, n, e, s, t, c, o, o, l)
	val secret = Huffman.encode(Huffman.frenchCode)(public)
                                                  //> secret  : List[patmat.Huffman.Bit] = List(0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0
                                                  //| , 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1,
                                                  //|  1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 
                                                  //| 1)

	Huffman.decode(Huffman.frenchCode, secret)//> res0: List[Char] = List(h, u, f, f, m, a, n, e, s, t, c, o, o, l)

	Huffman.convert(Huffman.frenchCode)       //> res1: patmat.Huffman.CodeTable = List((s,List(0, 0, 0)), (d,List(0, 0, 1, 0)
                                                  //| ), (x,List(0, 0, 1, 1, 0, 0, 0)), (j,List(0, 0, 1, 1, 0, 0, 1)), (f,List(0, 
                                                  //| 0, 1, 1, 0, 1)), (z,List(0, 0, 1, 1, 1, 0, 0, 0, 0)), (k,List(0, 0, 1, 1, 1,
                                                  //|  0, 0, 0, 1, 0)), (w,List(0, 0, 1, 1, 1, 0, 0, 0, 1, 1)), (y,List(0, 0, 1, 1
                                                  //| , 1, 0, 0, 1)), (h,List(0, 0, 1, 1, 1, 0, 1)), (q,List(0, 0, 1, 1, 1, 1)), (
                                                  //| o,List(0, 1, 0, 0)), (l,List(0, 1, 0, 1)), (m,List(0, 1, 1, 0, 0)), (p,List(
                                                  //| 0, 1, 1, 0, 1)), (u,List(0, 1, 1, 1)), (r,List(1, 0, 0, 0)), (c,List(1, 0, 0
                                                  //| , 1, 0)), (v,List(1, 0, 0, 1, 1, 0)), (g,List(1, 0, 0, 1, 1, 1, 0)), (b,List
                                                  //| (1, 0, 0, 1, 1, 1, 1)), (n,List(1, 0, 1, 0)), (t,List(1, 0, 1, 1)), (e,List(
                                                  //| 1, 1, 0)), (i,List(1, 1, 1, 0)), (a,List(1, 1, 1, 1)))
                                                  
	val secret2 = Huffman.quickEncode(Huffman.frenchCode)(public)
                                                  //> secret2  : List[patmat.Huffman.Bit] = List(0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 
                                                  //| 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1
                                                  //| , 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0,
                                                  //|  1)
	Huffman.decode(Huffman.frenchCode, secret2)
                                                  //> res2: List[Char] = List(h, u, f, f, m, a, n, e, s, t, c, o, o, l)
}