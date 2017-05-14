name := """Versus"""

version := "0.1"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean, SbtWeb)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  javaWs,
  guice,
  "org.postgresql" % "postgresql" % "42.1.1",
  "com.typesafe.play" %% "play-java-jdbc" % "2.6.0-M5",
  "com.typesafe.play" %% "play-jdbc-evolutions" % "2.6.0-M5"
)

routesGenerator := InjectedRoutesGenerator
