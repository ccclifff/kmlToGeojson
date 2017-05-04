organization := "com.github.workingDog"

name := "kmlToGeojson"

version := (version in ThisBuild).value

scalaVersion := "2.11.11"

crossScalaVersions := Seq("2.11.11")

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-xml" % "1.0.6",
  "com.typesafe.play" %% "play-json" % "2.5.14",
  "com.typesafe.play.extras" %% "play-geojson" % "1.4.0",
  "com.github.workingDog" %% "scalakml" % "1.1"
)

homepage := Some(url("https://github.com/workingDog/kmlToGeojson"))

licenses := Seq("Apache 2" -> url("http://www.apache.org/licenses/LICENSE-2.0"))

mainClass in(Compile, run) := Some("com.kodekutters.KmlToGeojson")

mainClass in assembly := Some("com.kodekutters.KmlToGeojson")

assemblyJarName in assembly := "kmltogeojson_2.11-1.1-SNAPSHOT.jar"
