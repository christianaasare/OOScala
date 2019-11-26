package io.turntabl.scalagettingstarted.manager

import io.turntabl.scalagettingstarted.employee.TurntablEmployee

class TLCManager extends TurntablEmployee(name = "Manager") {
  override def getWorkLoad = {
    super.getWorkLoad;
    print("Works very hard. ")
  }
}