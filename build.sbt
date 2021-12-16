ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.7"

lazy val root = (project in file("."))
  .settings(
    name := "scala-traits"
  )
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % "test"
/*
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.2"
libraryDependencies += "com.persist" % "persist-logging_2.12" % "1.3.2"

 */
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.2"
libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.2" % Test
libraryDependencies += "com.typesafe.play" % "play_2.13" % "2.8.9"
