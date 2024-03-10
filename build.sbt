//Basic Setup
scalaVersion := "3.4.0"
name         := "scala-cucumber"
organization := "com.ftlt.tachyons"

//Scalafix setup
semanticdbEnabled := true

//Dependencies Setup
libraryDependencies += compilerPlugin("com.github.ghik" % ("zerowaste_" + scalaVersion.value) % "0.2.18")

//Sbt aliases
addCommandAlias("fmt", "; scalafmtAll ; scalafmtSbt ; scalafixAll")
addCommandAlias("fmtc", "; scalafmtCheckAll ; scalafmtSbtCheck ; scalafixAll --check")
addCommandAlias("ci", "; fmtc ; test")
addCommandAlias("lci", "; fmt ; fmtc ; test")
