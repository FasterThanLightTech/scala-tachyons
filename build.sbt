//Basic Setup
scalaVersion := "3.4.0"
name         := "basic-tachyon"
organization := "com.ftlt.tachyons"

//Scalafix setup
semanticdbEnabled := true

//Dependencies Setup
libraryDependencies += compilerPlugin("com.github.ghik" %% "zerowaste" % "0.2.18" cross CrossVersion.full)

//Sbt aliases
addCommandAlias("fmt", "; scalafmtAll ; scalafmtSbt ; scalafixAll")
addCommandAlias("fmtc", "; scalafmtCheckAll ; scalafmtSbtCheck ; scalafixAll --check")
addCommandAlias("ci", "; fmtc ; test")
addCommandAlias("lci", "; fmt ; fmtc ; test")
