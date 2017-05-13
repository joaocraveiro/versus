name := """Versus"""

version := "0.1"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean, SbtWeb)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  javaWs,
  guice,
  "org.postgresql" % "postgresql" % "42.1.1"
)

routesGenerator := InjectedRoutesGenerator
