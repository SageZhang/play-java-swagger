name := """play-java-swagger"""

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  filters,
  "javax.ws.rs" % "jsr311-api" % "1.1.1" ,
  "io.swagger" %% "swagger-play2" % "1.5.3"
)

//unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )