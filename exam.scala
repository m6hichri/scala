//************Exo 1
//Question 1
def egaux(a: List[Int], b: List[Int]): Boolean = {
  
  if(a.isEmpty && b.isEmpty){
    return true
  }
  else if(a.isEmpty || b.isEmpty){
    return false
  }
  else if((a.head) != (b.head)){
    return false
  }
  egaux(a.tail, b.tail)
}


println(egaux(1 :: 2 :: 3 :: Nil, 1 :: 2 :: 3 :: Nil))


//Question 2
  def min(a: List[Int]): Int= {
    if (a.isEmpty) {
      throw new NoSuchElementException()
    }
    
    minRec(a, a.head)
  }

  def minRec(xs: List[Int], min: Int): Int = {
    if (xs.isEmpty) {
      return min
    }
    
    var m = min
    if (xs.head < m) {
      m = xs.head
    }
    return minRec(xs.tail, m)
  }
  
  val numbers = List[Int](11, 5, 10, 2)
  println(min(numbers))
  

//Question 3
def prime(n: Int, i:Int = 2): Boolean = {
  if (n <= 2) 
      if(n == 2 )
        true
      else
        false
  if (n % i == 0) 
      return false; 
  if (i * i > n) 
      return true; 
  return prime(n, i + 1); 
} 
    
def isPrime(n: Int): Boolean = {
 prime(n,2)
} 

println(isPrime(8) )
 
//************Exo 2
    
//Question 1
  
  
sealed trait Liste[+A]
{
  
  def isEmpty : // methode abstraite
}


//
object Vide extends Liste[Nothing]
  
  def isEmpty = true
}

// constructeur
case class NonVide[+A](tete: A, queue: Liste[A]) extends Liste[A]{
  
  def isEmpty = false
} 

val list = Cons(1,cons(3,Nil))
  
  
  
  
type Set = Int => Boolean
  
def singletonSet(elem: Int): Set = R => elem == R

def union(s: Set, t: Set): Set = elem => s(elem) || t(elem)
  
  def apply[A](first: A, others: A*): List[A] = {
    
    def _apply(first: A, l: List[Int]): List[A] = l match {
      case Nil => A
      case elem :: rest => _apply(union(prec, singletonSet(elem)), rest)
    }
    _apply(singletonSet(first), others.toList)
  }
  
  
var tmp = apply(1,2,3)
println(tmp)
  /*
  def from (first: Int, others: Int*): Set = {
  
    def _from(prec: Set, l: List[Int]): Set = l match {
      case Nil => prec
      case elem :: rest => _from(union(prec, singletonSet(elem)), rest)
    }
  
  _from(singletonSet(first), others.toList)
}

*/

 //************Exo 3
 
 
//Question 1
def isDiscounted(article: Article): Boolean = article match {
  case Regular(_, _, _) => false
  case Discounted(_, _, _, _) => true
}
//Question 2
def discountedItems(articles: List[Article]): List[Discounted] = articles.collect({
  case d if isDiscounted(d) => d.asInstanceOf[Discounted]
})

//Question 3
def regularItems(articles: List[Article]): List[Regular] = articles.collect ({
  case r if isDiscounted(r) == false => r.asInstanceOf[Regular]
})

    
    ****************************************************

//************Exo 1
//Question 1
def egaux(a: List[Int], b: List[Int]): Boolean = {
  
  if(a.isEmpty && b.isEmpty){
    return true
  }
  else if(a.isEmpty || b.isEmpty){
    return false
  }
  else if((a.head) != (b.head)){
    return false
  }
  egaux(a.tail, b.tail)
}


println(egaux(1 :: 2 :: 3 :: Nil, 1 :: 2 :: 3 :: Nil))


//Question 2
  def min(a: List[Int]): Int= {
    if (a.isEmpty) {
      throw new NoSuchElementException()
    }
    
    minRec(a, a.head)
  }

  def minRec(xs: List[Int], min: Int): Int = {
    if (xs.isEmpty) {
      return min
    }
    
    var m = min
    if (xs.head < m) {
      m = xs.head
    }
    return minRec(xs.tail, m)
  }
  
  val numbers = List[Int](11, 5, 10, 2)
  println(min(numbers))
  

//Question 3
def prime(n: Int, i:Int = 2): Boolean = {
  if (n <= 2) 
      if(n == 2 )
        true
      else
        false
  if (n % i == 0) 
      return false; 
  if (i * i > n) 
      return true; 
  return prime(n, i + 1); 
} 
    
def isPrime(n: Int): Boolean = {
 prime(n,2)
} 

println(isPrime(8) )
 
//************Exo 2
    
//Question 1
  
sealed trait Liste[+A]
{
  
  def isEmpty :
}


object Vide extends Liste[Nothing]
  
  def isEmpty = true
}

case class NonVide[+A](tete: A, queue: Liste[A]) extends Liste[A]{
  
  def isEmpty = false
} 

val list = NonVide(1,cons(3,Nil))
  
  
object Liste {
  
def apply[A](first: A, others: A*): List[A] = new Liste()
def apply(radius: Double): Circle = new Circle(radius)

}
  
  
  
  
  
  /*
sealed trait Liste[+A]
{
  
  def isEmpty :
}


//
object Vide extends Liste[Nothing]
  
  def isEmpty = true
}

case class NonVide[+A](tete: A, queue: Liste[A]) extends Liste[A]{
  
  def isEmpty = false
} 

val list = NonVide(1,cons(3,Nil))
  
  
  
  
type Set = Int => Boolean
  
def singletonSet(elem: Int): Set = R => elem == R

def union(s: Set, t: Set): Set = elem => s(elem) || t(elem)
  
  def apply[A](first: A, others: A*): List[A] = {
    
    def _apply(first: A, l: List[Int]): List[A] = l match {
      case Nil => A
      case elem :: rest => _apply(union(prec, singletonSet(elem)), rest)
    }
    _apply(singletonSet(first), others.toList)
  }
  
  
var tmp = apply(1,2,3)
println(tmp)
*/


 //************Exo 3
 
 /*
//Question 1
def isDiscounted(article: Article): Boolean = article match {
  case Regular(_, _, _) => false
  case Discounted(_, _, _, _) => true
}
//Question 2
def discountedItems(articles: List[Article]): List[Discounted] = articles.collect({
  case d if isDiscounted(d) => d.asInstanceOf[Discounted]
})

//Question 3
def regularItems(articles: List[Article]): List[Regular] = articles.collect ({
  case r if isDiscounted(r) == false => r.asInstanceOf[Regular]
})

    */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    