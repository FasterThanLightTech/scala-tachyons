//Basic Setup
scalaVersion := "3.4.0"
name         := "basic-tachyon"
organization := "com.ftlt.tachyons"

libraryDependencies += compilerPlugin("com.github.ghik" % s"zerowaste_${scalaVersion.value}" % "0.2.18")

//Scalafix setup
semanticdbEnabled := true

//Dependencies Setup
libraryDependencies += compilerPlugin("com.github.ghik" % ("zerowaste_" + scalaVersion.value) % "0.2.18")

//Sbt aliases
addCommandAlias("fmt", ";scalafmtAll;scalafmtSbt;scalafixAll")
addCommandAlias("fmtc", ";scalafmtCheckAll;scalafmtSbtCheck;scalafixAll --check")
