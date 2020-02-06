name := "01_scala"

version := "0.1"

//Spark no funciona con 2.13
scalaVersion := "2.12.10"
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-sql" % "2.4.4"
)

//Para compilar a un jar: sbt clean; sbt package
//SBT: https://www.jetbrains.com/help/idea/sbt-support.html
//SBT: https://alvinalexander.com/scala/sbt-how-to-compile-run-package-scala-project
//SBT: https://alvinalexander.com/scala/sbt-how-build-single-executable-jar-file-assembly