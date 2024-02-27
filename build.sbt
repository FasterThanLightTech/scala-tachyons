//Basic Setup
scalaVersion := "3.3.1"
name := "di-tachyon"
organization := "com.ftlt.tachyons"

//Scalafix setup
semanticdbEnabled := true

//Sbt aliases
addCommandAlias("fmt",";scalafmtAll;scalafixAll")
addCommandAlias("fmtc",";scalafmtCheckAll;scalafixAll --check")

