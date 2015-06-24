scalac -optimise bench.scala && time --verbose scala -J-server -J-XX:+UseConcMarkSweepGC -J-Xmx8g -J-Xms8g Bench && rm *.class
