
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Jesus/Desktop/prueba/conf/routes
// @DATE:Thu Sep 03 12:03:15 CDT 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
