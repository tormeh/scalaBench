import scala.math

object Bench 
{
  def main(args: Array[String]) 
  {
    println((0 until (Int.MaxValue)/5).par.map(x=>calculation(x)).fold(0)((x,y)=>x+y))
  }
  
  def calculation(in:Int):Int =
  {
    if (in%2==0)
    {
      (math.sin(in)*10).toInt
    }
    else
    {
      (math.cos(in)*10).toInt
    }
  }
}
