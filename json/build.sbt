name := "smile-json"

// Parent project disables Scala as most libraries are in Java.
// Enable it as this is a Scala project.
crossPaths := true
autoScalaLibrary := true

scalacOptions in (Compile, doc) ++= Seq("-groups", "-implicits")
scalacOptions in (Compile, doc) ++= Seq("-doc-root-content", baseDirectory.value + "/root-doc.txt")
scalacOptions in (Compile, doc) ++= Seq("-doc-title", "Smile - JSON")
target in Compile in doc := baseDirectory.value / "../doc/api/json"

libraryDependencies ++= Seq(
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",
  "org.specs2" %% "specs2-core" % "4.10.3" % "test"
)
