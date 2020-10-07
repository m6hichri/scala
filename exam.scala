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
  
  def isEmpty // methode abstraite
}


object Vide extends Liste[Nothing]{
  
  def isEmpty = true
}

// constructeur
case class NonVide[+A](tete: A, queue: Liste[A]) extends Liste[A]{
  
  def isEmpty = false
} 

// constructeur
case class Cons[A](courent: A, list: Liste[A]) extends Liste[A]{
  
  def isEmpty = false
} 
val numList = List(2,3,4,5,6,7,8,9,10)
val list = Cons(1,numList)

println(list)  
  
  

type Set = Int => Boolean
  
def singletonSet(elem: Int): Set = R => elem == R

def union(s: Set, t: Set): Set = elem => s(elem) || t(elem)
  
object Liste {
def apply[A](first: A, others: A*): Liste[A] = {
  
  def _apply(first: A, l: List[Int]): Liste[A] = l match {
    case Nil => A
    case elem :: rest => _apply(union(prec, singletonSet(elem)), rest)
  }
  _apply(singletonSet(first), others.toList)
}

}


println(Liste.apply(1,2,3))


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

//Question 4 :

def applyDiscount(article: Discounted): Double = { 
  article.price * article.discount
}

//Question 5 :

def cartAmount(articles: List[Article]): Double = articles.map(article => article match {
  case a: Regular => a.price
  case b: Discounted => applyDiscount(b)
}).reduce((a, b) => a + b)

//Question 6 :
val articles: List[Article] = List(
  Regular(name = "Biscuits", category = "food", price = 2.0),
  Discounted(name = "Monitor", category = "tech", price = 119.99, discount = 0.1),
  Discounted(name = "Mouse", category = "tech", price = 25.50, discount = 0.2),
  Regular(name = "dress", category = "clothes", price = 49.90)
)
// ==>Le montant du panier est de 69€


//Question 7 :
def applyCoupon(coupon: Float, category: String): Boolean = {
  true
}

//Exercice 4 :


    
    
    
    
    
    
    