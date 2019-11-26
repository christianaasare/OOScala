package io.turntabl.scalagettingstarted.manager

import io.turntabl.scalagettingstarted.employee.TurntablEmployee

class TLCManager(name: String) extends TurntablEmployee {
  override def getWorkLoad = {
    super.getWorkLoad;
    print(s"$name: Works very hard. ")
  }

  override val calculateService: Int = 100
}