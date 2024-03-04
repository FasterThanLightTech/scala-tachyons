//Basic Setup
scalaVersion := "3.3.1"
name := "basic-tachyon"
organization := "com.ftlt.tachyons"

//Scalafix setup
semanticdbEnabled := true

//Sbt aliases
addCommandAlias("fmt",";scalafmtAll;scalafmtSbt;scalafixAll")
addCommandAlias("fmtc",";scalafmtCheckAll;scalafmtSbtCheck;scalafixAll --check")

