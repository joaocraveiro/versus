name := """Versus"""

version := "0.1"

lazy val root = (project in file(".")).enablePlugins(PlayJava, SbtWeb)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  javaWs,
  guice
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

// SbtWeb pipeline
//pipelineStages := Seq(rjs, uglify)
//includeFilter in uglify := GlobFilter("js/*.js")