package io.turntabl.scalagettingstarted

import java.util.Date

import io.turntabl.scalagettingstarted.students.TLCStudent


object MyApp extends App {
  print("Hello, World!")

  val TLCStudent1 = new TLCStudent("Chris", "Asare", 2345, "dev", "github.com/chris")
  val TLCStudent2 = new TLCStudent("Jim", "Rae", 265, "op", "github.com/jim")
  TLCStudent("Duke","Washington",34728,"UI","github.com/duke")
  print(TLCStudent1 serviceIsRelated TLCStudent2 )

  print(TLCStudent1.topGrade)


}