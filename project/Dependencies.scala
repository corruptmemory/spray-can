import sbt._

object Dependencies {

  val resolutionRepos = Seq(
    "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
    "Typesafe snapshots" at "http://repo.typesafe.com/typesafe/snapshots/",
    ScalaToolsSnapshots
  )

  object V {
    val akka      = "2.0-SNAPSHOT"
    val logback   = "0.9.29"
  }

  object Compile {
    //val slf4j         = "org.slf4j"                 %   "slf4j-api"                 % "1.6.1"     % "compile"
    val akkaActor     = "com.typesafe.akka" %   "akka-actor"                % V.akka      % "compile"
  }

  object Provided {
    val akkaActor     = "com.typesafe.akka" %   "akka-actor"                % V.akka      % "provided"
  }

  object Test {
    val specs2        = "org.specs2"                %%  "specs2"                    % "1.6.1"     % "test"
    //val akkaSlf4j     = "com.typesafe.akka" %   "akka-slf4j"                % V.akka      % "test"
    val logback       = "ch.qos.logback"            %   "logback-classic"           % V.logback   % "test"
  }

  object Runtime {
   // val akkaSlf4j     = "com.typesafe.akka" %   "akka-slf4j"                % V.akka      % "runtime"
    val logback       = "ch.qos.logback"            %   "logback-classic"           % V.logback   % "runtime"
  }

}
