object book extends App{
  def wholesaleBookprice(n:Int) = if (n > 50) 24.95*100/60*n+(n-50)*0.75+50*3 else 24.95*100/60*n+n*3;

  println("Whole sale of 60 books : " + wholesaleBookprice(60));
}
