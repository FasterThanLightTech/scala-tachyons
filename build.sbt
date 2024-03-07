//Basic Setup
scalaVersion := "3.4.0"
name         := "basic-tachyon"
organization := "com.ftlt.tachyons"

libraryDependencies += compilerPlugin("com.github.ghik" % s"zerowaste_${scalaVersion.value}" % "0.2.18")

//Convert warnings to error for zerowaste plugin
scalacOptions += "-Werror"

//Scalafix setup
semanticdbEnabled := true

//Sbt aliases
addCommandAlias("fmt", ";scalafmtAll;scalafmtSbt;scalafixAll")
addCommandAlias("fmtc", ";scalafmtCheckAll;scalafmtSbtCheck;scalafixAll --check")
