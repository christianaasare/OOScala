package io.turntabl.scalagettingstarted

import java.util.Date

import io.turntabl.scalagettingstarted.manager.TLCManager
import io.turntabl.scalagettingstarted.students.TLCStudent


object MyApp extends App {
//  print("Hello, World!")

  val TLCStudent1 = new TLCStudent("Chris", "Asare", 2345, "dev", "github.com/chris")
  val TLCStudent2 = new TLCStudent("Jim", "Rae", 265, "op", "github.com/jim")
  TLCStudent("Duke","Washington",34728,"UI","github.com/duke")
  print(TLCStudent1 serviceIsRelated TLCStudent2 )

  print(TLCStudent1.topGrade)

  val m = new TLCManager("Sam")
  print(m.getWorkLoad)
  print(m.calculateService)

  print(TLCStudent ("Duke","Washington",34728,"UI","github.com/duke").getWorkLoad)



  //Functional Scala
  val func1 = (string: String)=>string.length

  print(func1("blaah"))

  val func2 = (string: String) => string.split(" ").length - 1
  print(func2("Hey guys"))

  val stringToInt = (string: String) => 9
  val ApplyToString = (string: String, f:(String => Int)) => f(string)
  ApplyToString("Hello there",func1)
  ApplyToString("Ho Ho Ho",func2)

    val calculate = (n: String) =>((int1: Int, int2: Int) => n match{
  case "addition" => int1 + int2
  case "subtract" => int1 - int2
  case "multiply" => int1 * int2
  case "divide" => int1 / int2
})
//  calculate("add")
  val add = calculate("addition")
  val result= add(8,9)
  print(result)

  val sub = calculate("subtract")
  val output= sub(12,9)
  print(output)


}