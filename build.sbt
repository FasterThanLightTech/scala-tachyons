//Basic Setup
scalaVersion := "3.4.0"
name         := "scala-cucumber"
organization := "com.ftlt.tachyons"

//Scalafix setup
semanticdbEnabled := true

//Dependencies Setup
libraryDependencies ++= Seq(
  "io.cucumber" %% "cucumber-scala"  % "8.20.0" % Test,
  "io.cucumber"  % "cucumber-junit"  % "7.15.0" % Test,
  "com.novocode" % "junit-interface" % "0.11"   % Test,
  "org.mockito"  % "mockito-core"    % "4.3.1",
  compilerPlugin("com.github.ghik" % ("zerowaste_" + scalaVersion.value) % "0.2.18")
)

//coverageEnabled := true

//Sbt aliases
addCommandAlias("fmt", "; scalafmtAll ; scalafmtSbt ; scalafixAll")
addCommandAlias("fmtc", "; scalafmtCheckAll ; scalafmtSbtCheck ; scalafixAll --check")
addCommandAlias("ci", "; fmtc ; coverage ; test ; coverageReport")
addCommandAlias("lci", "; fmt ; ci")
