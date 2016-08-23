
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/MeanMachine/Desktop/x.ai/play-slick3-steps/conf/routes
// @DATE:Sat Aug 06 17:41:18 EDT 2016


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
