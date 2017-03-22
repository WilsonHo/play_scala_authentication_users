name := """play_scala_authentication_users/"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test,

  "org.postgresql" % "postgresql" % "9.4.1207.jre7",
  "org.scalikejdbc"  %% "scalikejdbc"   % "2.3.5",
  "org.scalikejdbc"  %% "scalikejdbc-config" % "2.3.5",
  "ch.qos.logback"   % "logback-classic"  % "1.1.3"
)

