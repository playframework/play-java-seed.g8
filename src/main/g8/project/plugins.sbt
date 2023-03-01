// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "$play_version$")

// Defines scaffolding (found under .g8 folder)
// http://www.foundweekends.org/giter8/scaffolding.html
// sbt "g8Scaffold form"
addSbtPlugin("org.foundweekends.giter8" % "sbt-giter8-scaffold" % "0.14.0")
