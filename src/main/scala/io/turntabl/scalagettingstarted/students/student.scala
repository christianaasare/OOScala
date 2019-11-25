package io.turntabl.scalagettingstarted.students

import java.time.Year

import io.turntabl.scalagettingstarted.grades.Grade


class TLCStudent(val firstName: String,
                   val secondName: String,
                   val IDNumber: Integer,
                   val roleDescription: String,
                   val githubURL: String = "github.com/turntabl",
                 yearStarted: Int = 2019
                  ) {
    override def toString = s"FirstName:$firstName SecondName:$secondName ID:$IDNumber Role:$roleDescription Github:$githubURL $currentYear"


    def calculateService = Year.now().getValue - yearStarted;



    def serviceIsRelated(student:TLCStudent) = yearStarted== yearStarted

    def topGrade=Grade("Scala",89)

  }

  object TLCStudent{
    def apply(firstName:String, lastName:String, IDNumber:Int,roleDescription:String, githubUrl:String) = new TLCStudent(firstName,lastName,IDNumber,roleDescription,githubUrl)
  }




