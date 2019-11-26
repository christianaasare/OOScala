package io.turntabl.scalagettingstarted.students

import java.time.Year

import io.turntabl.scalagettingstarted.employee.TurntablEmployee
import io.turntabl.scalagettingstarted.grades.Grade


class TLCStudent (val firstName: String, val secondName: String, val IDNumber: Integer, val roleDescription: String, val githubURL: String = "github.com/turntabl", yearStarted: Int = 2019)extends TurntablEmployee{
    override def toString = s"FirstName:$firstName SecondName:$secondName ID:$IDNumber Role:$roleDescription Github:$githubURL $yearStarted"
  override def getWorkLoad ={
    super.getWorkLoad;
    print(s"$firstName:Works Super Hard :)")
  }
    override def calculateService = Year.now().getValue - yearStarted;

    def serviceIsRelated(student:TLCStudent) = yearStarted== yearStarted

    def topGrade=Grade("Scala",89)

  }

  object TLCStudent{
    def apply(firstName:String, lastName:String, IDNumber:Int,roleDescription:String, githubUrl:String) = new TLCStudent(firstName,lastName,IDNumber,roleDescription,githubUrl)
  }




