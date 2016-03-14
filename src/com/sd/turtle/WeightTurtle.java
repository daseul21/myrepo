/*
 * @author dsk
 *@since 20160314
 */

package com.sd.turtle;
import ch.aplu.turtle.*;
import java.awt.Color;

public class WeightTurtle extends Turtle
{
  protected int weight;
  public int getWeight(){
    return weight;
  }
  public WeightTurtle(int w)
  {
    weight = w;
    setColor(Color.red);
    setPenColor(Color.red);
  }
}
