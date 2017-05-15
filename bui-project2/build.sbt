name := """bui-project2"""
organization := "com.considine"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.11"
libraryDependencies += filters
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "2.0.0" % Test
libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.0.2"
libraryDependencies += jdbc
// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.considine.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.considine.binders._"
