name := "zero-to-graphql"
description := "An examples of GraphQL endpoint created using sangria and akka-http"

scalaVersion := "2.12.5"
scalacOptions ++= Seq("-deprecation", "-feature")

libraryDependencies ++= Seq(
  // GraphQL
  "org.sangria-graphql" %% "sangria" % "1.4.0",
  "org.sangria-graphql" %% "sangria-spray-json" % "1.0.1",

  // Http
  "com.typesafe.akka" %% "akka-http" % "10.1.0",
  "com.typesafe.akka" %% "akka-http-spray-json" % "10.1.0",

  // Database
  "com.typesafe.slick" %% "slick" % "3.2.2",
  "com.h2database" % "h2" % "1.4.197",
  "org.slf4j" % "slf4j-nop" % "1.7.25",

  // Testing
  "org.scalatest" %% "scalatest" % "3.0.5" % Test
)

Revolver.settings