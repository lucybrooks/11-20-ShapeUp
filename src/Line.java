public class Line
{
  Point start;
  Point end;
 
  //constructor
  public Line()
  {
    start=new Point();
    end=new Point();
  }
  
  public Line(Point startPoint, Point endPoint)
  {
    start=startPoint;
    end=endPoint;
  }
  
  // accessors
  public double length()
  {
    return start.distance(end);
  }
  public double slope()
  {
    return (start.getY()-end.getY())/(start.getX()-end.getX());
  }
  public String toString()
  {
    return "["+start.toString()+","+end.toString()+"]";
  }
  
  // mutators
  public void translate(int dx, int dy)
  {
    start.translate(dx,dy);
    end.translate(dx, dy);
  }
}
