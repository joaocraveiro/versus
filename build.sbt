name := """Versus"""

version := "0.1"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean, SbtWeb)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  evolutions,
  guice,
  "org.avaje" % "ebean-maven-enhancement-plugin" % "2.8.1",
  "com.typesafe.play" %% "play-json" % "2.6.0-M7",
  "org.mindrot" % "jbcrypt" % "0.3m",
  "com.typesafe.play" %% "play-mailer" % "5.0.0",
  "org.postgresql" % "postgresql" % "9.4.1211",  
  "org.neo4j" % "neo4j-ogm-bolt-driver" % "2.1.2",
  "org.neo4j" % "neo4j-ogm-core" % "2.1.2",
  "com.amazonaws" % "aws-java-sdk" % "1.11.123",
  "com.relayrides" % "pushy" % "0.9.3"
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

// SbtWeb pipeline
//pipelineStages := Seq(rjs, uglify)
//includeFilter in uglify := GlobFilter("js/*.js")