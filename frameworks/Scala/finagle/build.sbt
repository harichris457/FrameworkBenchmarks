name := "finagle"

scalaVersion := "2.12.5"

version := "18.8.0"

libraryDependencies ++= Seq(
  "com.twitter" %% "finagle-http" % "18.8.0",
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.8.4"
)

assemblyMergeStrategy in assembly := {
 case PathList("META-INF", xs @ _*) => MergeStrategy.discard
 case x => MergeStrategy.first
}
